package com.ziina.multiplatformpath

import com.ziina.multiplatformpath.models.DrawingRect
import platform.CoreGraphics.CGMutablePathRef
import platform.CoreGraphics.CGPathAddLineToPoint
import platform.CoreGraphics.CGPathMoveToPoint

actual object MultiPlatformDrawer {
    fun drawOnPath(path: CGMutablePathRef, drawingRect: DrawingRect) {
        val width = drawingRect.width
        val height = drawingRect.height

        // doesn't work. No such methods
//        path.move(to: CGPoint(x: 10, y: 10))
//        path.addLine(to: CGPoint(x: 100, y: 100))

        // this also doesn't work. Draws nothing
        CGPathMoveToPoint(path, null, width / 2.0, height * 0.1)
        CGPathAddLineToPoint(path, null, width * 0.9, height * 0.9)
        CGPathAddLineToPoint(path, null, width * 0.1, height * 0.9)
        CGPathAddLineToPoint(path, null, width / 2.0, height * 0.1)
    }
}