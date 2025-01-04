package com.ideatecnologia.simuladospmmg.presentation

/*
import com.ideatecnologia.simuladospmmg.ui.theme.SimuladospmmgTheme
*/
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.animation.OvershootInterpolator
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.animation.doOnEnd
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : ComponentActivity() {

    //  private val viewModel: MainViewModel by viewModel()
    //private val navigator: Navigator by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*  lifecycleScope.launch {
              lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                  viewModel.sendAction(MainViewAction.LoadData)
              }
          }*/
        setupSplashScreen()
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }

    private fun setupSplashScreen() {
        val splashScreen = installSplashScreen()
        splashScreen.setOnExitAnimationListener { screen ->
            val zoomX = ObjectAnimator.ofFloat(
                screen.iconView,
                View.SCALE_X,
                0.4f,
                0f
            )
            val zoomY = ObjectAnimator.ofFloat(
                screen.iconView,
                View.SCALE_Y,
                0.4f,
                0f
            )

            zoomX.interpolator = OvershootInterpolator()
            zoomY.interpolator = OvershootInterpolator()
            zoomX.duration = 500L
            zoomY.duration = 500L

            zoomX.doOnEnd { screen.remove() }
            zoomY.doOnEnd { screen.remove() }

            zoomX.start()
            zoomY.start()
        }
    }
}
