package com.ziina.multiplatformpath.models

sealed class DrawingFunction

data class MoveTo(val x: Float, val y: Float) : DrawingFunction()
data class LineTo(val x: Float, val y: Float) : DrawingFunction()
