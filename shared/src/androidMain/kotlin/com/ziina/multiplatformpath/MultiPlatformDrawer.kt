package com.ziina.multiplatformpath

import androidx.compose.ui.graphics.Path

actual object MultiPlatformDrawer {
    fun drawOnPath(path: Path) {

        // works fine
        path.moveTo(10f, 10f)
        path.lineTo(100f, 100f)
    }
}