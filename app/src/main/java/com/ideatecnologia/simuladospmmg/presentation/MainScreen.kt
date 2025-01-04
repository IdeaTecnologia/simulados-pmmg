package com.ideatecnologia.simuladospmmg.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ideatecnologia.simuladospmmg.designsystem.theme.SimuladosPMMGTheme
import com.ideatecnologia.simuladospmmg.navigation.AppNavGraph
import com.ideatecnologia.simuladospmmg.navigation.extension.NavHostControllerProvider
import com.ideatecnologia.simuladospmmg.presentation.viewmodel.MainViewAction
import com.ideatecnologia.simuladospmmg.presentation.viewmodel.MainViewModel
import com.ideatecnologia.simuladospmmg.presentation.viewmodel.MainViewState
import org.koin.androidx.compose.koinViewModel

@Composable
fun MainScreen(
    viewModel: MainViewModel = koinViewModel(),
    navController: NavHostController = rememberNavController(),
) {
    val uiState by viewModel.state.collectAsState(initial = MainViewState.Loading)

    // Dispara a ação de load quando a screen é criada
    LaunchedEffect(Unit) {
        viewModel.sendAction(MainViewAction.LoadData)
    }

    SimuladosPMMGTheme {
        when (uiState) {
            is MainViewState.Success -> {
                NavHostControllerProvider { navController ->
                    AppNavGraph(
                        navController = navController
                    )
                }
            }

            is MainViewState.Loading -> {
            }

            is MainViewState.Error -> {
                ErrorScreen(
                    onRetry = {
                        viewModel.sendAction(MainViewAction.LoadData)
                    }
                )
            }
        }
    }
}

@Composable
private fun ErrorScreen(
    onRetry: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Algo deu errado",
            style = MaterialTheme.typography.headlineSmall
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = onRetry) {
            Text("Tentar novamente")
        }
    }
}