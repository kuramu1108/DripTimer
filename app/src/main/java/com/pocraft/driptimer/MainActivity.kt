package com.pocraft.driptimer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieAnimationSpec
import com.airbnb.lottie.compose.rememberLottieAnimationState
import com.pocraft.driptimer.ui.theme.DripTimerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DripTimerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DripTimerTheme {
        CoffeeAnimation()
    }
}

@Composable
fun CoffeeAnimation() {
    val animationSpec = remember {
        LottieAnimationSpec.RawRes(R.raw.coffee)
    }
    val animationState = rememberLottieAnimationState(
        autoPlay = true,
        repeatCount = Integer.MAX_VALUE
    )

    LottieAnimation(
        spec = animationSpec,
        animationState = animationState,
        modifier = Modifier.size(200.dp)
    )
}