import SwiftUI
import shared

struct MultiPlatformView: Shape {
    let platformDrawer = PlatformDrawer()
    
    func path(in rect: CGRect) -> Path {
        var path = Path()

        platformDrawer
            .getDrawingFunctions(drawingRect: DrawingRect(width: Float(rect.width), height: Float(rect.height)))
            .forEach { drawingFunction in
                switch(drawingFunction){
                case let move as MoveTo: path.move(to: CGPoint(x: Double(move.x), y: Double(move.y)))
                case let line as LineTo: path.addLine(to: CGPoint(x: Double(line.x), y: Double(line.y)))
                default: break
                }
            }

        return path
    }

}

struct MultiPlatformViewMultiPlatformDraw: Shape {
    let multiplatformDrawer = MultiPlatformDrawer()
    
    // 😭 doesn't work. Draws nothing
    func path(in rect: CGRect) -> Path {
        var cgPath = CGMutablePath()
        multiplatformDrawer.drawOnPath(path: &cgPath, drawingRect:  DrawingRect(width: Float(rect.width), height: Float(rect.height)))
        return Path(cgPath)
    }

}

