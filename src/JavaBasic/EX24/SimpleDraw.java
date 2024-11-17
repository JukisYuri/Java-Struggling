package JavaBasic.EX24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleDraw extends JFrame {
    private String shapeType = "Line";
    private Color drawColor = Color.BLACK;
    private Point startPoint, endPoint;
    private JRadioButton rectButt, circleButt, lineButt;

    public SimpleDraw(){
        setTitle("Drawing Application");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createToolbar();
        setVisible(true);

        DrawingPanel drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);
    }
    private void createToolbar(){
        JToolBar toolBar = new JToolBar();

        rectButt = new JRadioButton("Rectangle");
        circleButt = new JRadioButton("Circle");
        lineButt = new JRadioButton("Line", true);

        ButtonGroup shapeGroup = new ButtonGroup();
        shapeGroup.add(rectButt);
        shapeGroup.add(circleButt);
        shapeGroup.add(lineButt);

        toolBar.add(rectButt);
        toolBar.add(circleButt);
        toolBar.add(lineButt);

        rectButt.addActionListener(e -> shapeType = "Rectangle");
        circleButt.addActionListener(e -> shapeType = "Circle");
        lineButt.addActionListener(e -> shapeType = "Line");

        add(toolBar, BorderLayout.NORTH);
    }
    class DrawingPanel extends JPanel{
        public DrawingPanel(){
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    startPoint = e.getPoint();
                    endPoint = startPoint;
                    repaint();
                }
                public void mouseReleased(MouseEvent e){
                    endPoint = e.getPoint();
                    repaint();
                }
            });
            addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    endPoint = e.getPoint();
                    repaint();
                }
            });
        }
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            if(startPoint != null && endPoint != null){
                g.setColor(drawColor);
                switch (shapeType){
                    case "Line":
                        g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
                        break;
                    case "Circle":
                        int radius = (int) startPoint.distance(endPoint);
                        g.drawOval(startPoint.x - radius, startPoint.y - radius, radius*2, radius*2);
                        break;
                    case "Rectangle":
                        int x = Math.min(startPoint.x, endPoint.x);
                        int y = Math.min(startPoint.y, endPoint.y);
                        int width = Math.abs(startPoint.x - endPoint.x);
                        int height = Math.abs(startPoint.y - endPoint.y);
                        g.drawRect(x,y,width,height);
                        break;
                }
            }
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(SimpleDraw::new);
    }
}
