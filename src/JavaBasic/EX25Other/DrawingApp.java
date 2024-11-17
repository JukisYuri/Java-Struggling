package EX25Other;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class DrawingApp extends JFrame {
    private String shapeType = "Line";
    private Color drawColor = Color.BLACK;
    private Point startPoint, endPoint;
    private JRadioButton blackButton, redButton, whiteButton;
    private ArrayList<Shape> shapes = new ArrayList<>(); // Danh sách lưu các hình vẽ
    private BufferedImage canvas; // Canvas để vẽ hình

    public DrawingApp() { // Lớp chính tạo cửa sổ ứng dụng và thiết lập menu, toolbar.
        setTitle("Drawing Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMenu();
        createToolbar();

        DrawingPanel drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void createMenu() { // Phương thức tạo menu với các tùy chọn Exit, Line, Circle, Rectangle.
        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        // Shape Menu
        JMenu shapeMenu = new JMenu("Shape");
        JMenuItem lineItem = new JMenuItem("Line");
        JMenuItem circleItem = new JMenuItem("Circle");
        JMenuItem rectangleItem = new JMenuItem("Rectangle");

        lineItem.addActionListener(e -> shapeType = "Line");
        circleItem.addActionListener(e -> shapeType = "Circle");
        rectangleItem.addActionListener(e -> shapeType = "Rectangle");

        shapeMenu.add(lineItem);
        shapeMenu.add(circleItem);
        shapeMenu.add(rectangleItem);
        menuBar.add(shapeMenu);

        setJMenuBar(menuBar);
    }

    private void createToolbar() { // Phương thức tạo toolbar với các lựa chọn màu sắc.
        JToolBar toolBar = new JToolBar();

        blackButton = new JRadioButton("Black", true);
        redButton = new JRadioButton("Red");
        whiteButton = new JRadioButton("White");

        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(blackButton);
        colorGroup.add(redButton);
        colorGroup.add(whiteButton);

        toolBar.add(blackButton);
        toolBar.add(redButton);
        toolBar.add(whiteButton);

        blackButton.addActionListener(e -> drawColor = Color.BLACK);
        redButton.addActionListener(e -> drawColor = Color.RED);
        whiteButton.addActionListener(e -> drawColor = Color.WHITE);

        add(toolBar, BorderLayout.NORTH);
    }

    class DrawingPanel extends JPanel { // Lớp JPanel để vẽ hình. Xử lý sự kiện chuột để bắt đầu, kéo và kết thúc vẽ hình.
        public DrawingPanel() {
            setPreferredSize(new Dimension(800, 600));
            canvas = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    startPoint = e.getPoint();
                    endPoint = startPoint;
                    repaint();
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    endPoint = e.getPoint();
                    // Thêm hình vẽ vào danh sách khi chuột được thả
                    shapes.add(new Shape(startPoint, endPoint, shapeType, drawColor));
                    drawShapesToCanvas();
                    startPoint = null;
                    endPoint = null;
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
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(canvas, 0, 0, null); // Vẽ canvas trước

            // Vẽ hình hiện tại khi kéo chuột
            if (startPoint != null && endPoint != null) {
                g.setColor(drawColor);
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

        private void drawShapesToCanvas() {
            Graphics2D g2d = canvas.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            for (Shape shape : shapes) {
                shape.draw(g2d);
            }
            g2d.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawingApp::new); // Chạy ứng dụng trong luồng sự kiện Swing
    }
}
