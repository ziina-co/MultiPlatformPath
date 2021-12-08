package com.ziina.multiplatformpath

import com.ziina.multiplatformpath.models.DrawingFunction
import com.ziina.multiplatformpath.models.DrawingRect
import com.ziina.multiplatformpath.models.LineTo
import com.ziina.multiplatformpath.models.MoveTo

object PlatformDrawer {
    fun getDrawingFunctions(drawingRect: DrawingRect): List<DrawingFunction> = mutableListOf<DrawingFunction>().run {
        val width = drawingRect.width
        val height = drawingRect.height

        add(MoveTo(width / 2f, height * 0.1f))
        add(LineTo(width * 0.9f, height * 0.9f))
        add(LineTo(width * 0.1f, height * 0.9f))
        add(LineTo(width / 2, height * 0.1f))

        toList()
    }
}