package com.ziina.multiplatformpath

import kotlinx.cinterop.pointed
import platform.CoreGraphics.CGMutablePathRef
import platform.CoreGraphics.CGPathRef

actual object MultiPlatformDrawer {
    fun drawOnPath(path: CGMutablePathRef) {


        // doesn't work
//        path.move(to: CGPoint(x: 10, y: 10))
//        path.addLine(to: CGPoint(x: 100, y: 100))
    }
}