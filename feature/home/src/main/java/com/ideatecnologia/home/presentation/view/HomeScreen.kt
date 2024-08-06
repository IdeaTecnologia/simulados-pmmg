package com.ideatecnologia.home.presentation.view


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ideatecnologia.home.presentation.state.HomeState

@Composable
fun HomeScreen() {
    HomeScreenContent(HomeState.Success)
}

@Composable
private fun HomeScreenContent(state: HomeState) {
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
                    is HomeState.Loading -> HomeScreenLoadingContent()
                    is HomeState.Success -> HomeScreenSuccessContent()
                    is HomeState.Error -> HomeScreenErrorContent()
                }

            }
        }
    )
}

@Composable
private fun HomeScreenLoadingContent() {
    // HomeScreenSuccess()
}

@Composable
private fun HomeScreenSuccessContent() {
    // HomeScreenSuccess()
}

@Composable
private fun HomeScreenErrorContent() {
    // HomeScreenSuccess()
}

@Composable
@Preview(showBackground = true)
private fun HomeScreenPreview() {
    HomeScreenContent(HomeState.Success)
}