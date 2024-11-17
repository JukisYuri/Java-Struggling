package JavaBasic.EX25Other;

import java.awt.*;

public class Shape {
    private Point startPoint, endPoint;
    private String shapeType;
    private Color color;

    public Shape(Point startPoint, Point endPoint, String shapeType, Color color) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.shapeType = shapeType;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        switch (shapeType) {
            case "Line":
                g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
                break;
            case "Circle":
                int radius = (int) startPoint.distance(endPoint);
                g.drawOval(startPoint.x - radius, startPoint.y - radius, radius * 2, radius * 2);
                break;
            case "Rectangle":
                int x = Math.min(startPoint.x, endPoint.x);
                int y = Math.min(startPoint.y, endPoint.y);
                int width = Math.abs(startPoint.x - endPoint.x);
                int height = Math.abs(startPoint.y - endPoint.y);
                g.drawRect(x, y, width, height);
                break;
        }
    }
}

