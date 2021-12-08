package com.ziina.multiplatformpath.android

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import com.ziina.multiplatformpath.MultiPlatformDrawer
import com.ziina.multiplatformpath.PlatformDrawer
import com.ziina.multiplatformpath.models.DrawingRect
import com.ziina.multiplatformpath.models.LineTo
import com.ziina.multiplatformpath.models.MoveTo

@Composable
fun MultiPlatformView() = Canvas(
    modifier = Modifier
        .size(200.dp)
        .background(Color.Black),
    onDraw = {
        val path = Path()

        PlatformDrawer.getDrawingFunctions(DrawingRect(size.width, size.height))
            .forEach { drawingFunction ->
                when (drawingFunction) {
                    is LineTo -> path.lineTo(drawingFunction.x, drawingFunction.y)
                    is MoveTo -> path.moveTo(drawingFunction.x, drawingFunction.y)
                }
            }

        drawPath(path, Color.Red)
        path.close()
    }
)


// This also works fine
@Composable
fun MultiPlatformViewMultiPlatformDraw() = Canvas(
    modifier = Modifier
        .size(200.dp)
        .background(Color.White),
    onDraw = {
        val path = Path()
        MultiPlatformDrawer.drawOnPath(path, DrawingRect(size.width, size.height))
        drawPath(path, Color.Blue)
        path.close()
    }
)