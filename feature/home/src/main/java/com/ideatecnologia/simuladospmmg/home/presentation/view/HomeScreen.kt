package com.ideatecnologia.simuladospmmg.home.presentation.view


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ideatecnologia.simuladospmmg.home.presentation.viewmodel.HomeState
import com.ideatecnologia.simuladospmmg.home.presentation.viewmodel.HomeViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
internal fun HomeRoute(
    onNavigateToSettings: () -> Unit = {},
    viewModel: HomeViewModel = koinViewModel()
) {
    //  val state by viewModel.state.collectAsState()
    HomeScreen(
        state = HomeState.Success,
        onNavigateToSettings = onNavigateToSettings
    )
}

@Composable
private fun HomeScreen(state: HomeState, onNavigateToSettings: () -> Unit) {
    Scaffold(
        topBar = {
            // HomeScreenTopBar()
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                when (state) {
                    is HomeState.Loading -> HomeLoadingContent()
                    is HomeState.Success -> HomeSuccessContent(onNavigateToSettings)
                    is HomeState.Error -> HomeErrorContent()
                }

            }
        }
    )
}

@Composable
private fun HomeLoadingContent() {
    // HomeScreenSuccess()
}

@Composable
private fun HomeSuccessContent(onNavigateToSettings: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Button(onClick = onNavigateToSettings) {
            Text(
                text = "Go to Settings",
                color = Color.White,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Composable
private fun HomeErrorContent() {
    // HomeScreenSuccess()
}

@Composable
@Preview(showBackground = true)
private fun HomeScreenPreview() {
    HomeScreen(HomeState.Success) {}
}