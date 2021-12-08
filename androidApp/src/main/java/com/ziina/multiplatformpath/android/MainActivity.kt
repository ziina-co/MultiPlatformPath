package com.ziina.multiplatformpath.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import com.ziina.multiplatformpath.PlatformDrawer
import com.ziina.multiplatformpath.android.theme.AppTheme
import com.ziina.multiplatformpath.models.DrawingRect
import com.ziina.multiplatformpath.models.LineTo
import com.ziina.multiplatformpath.models.MoveTo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column {
                        MultiPlatformView()
                        MultiPlatformViewMultiPlatformDraw()
                    }
                }
            }
        }
    }
}

