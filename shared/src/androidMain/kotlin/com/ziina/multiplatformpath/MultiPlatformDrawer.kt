package com.ziina.multiplatformpath

import androidx.compose.ui.graphics.Path
import com.ziina.multiplatformpath.models.DrawingRect

actual object MultiPlatformDrawer {
    fun drawOnPath(path: Path, drawingRect: DrawingRect) {
        val width = drawingRect.width
        val height = drawingRect.height

        path.moveTo(width / 2f, height * 0.1f )
        path.lineTo(width * 0.9f, height * 0.9f)
        path.lineTo(width * 0.1f, height * 0.9f)
        path.lineTo(width / 2, height * 0.1f)
    }
}