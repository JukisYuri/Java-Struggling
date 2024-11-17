package JavaBasic.EX23;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MousePaintApp extends JFrame {
    private Color currentColor = Color.RED;
    private String currentShape = "Oval";
    private boolean fillShape = true;
    private JPanel canvas;
    private ButtonGroup shapeGroup, fillGroup;

    public MousePaintApp() {
        setTitle("UsingMousePaint");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Left Panel for Clear Button
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        leftPanel.setBackground(Color.PINK);

        // Clear button
        JButton clearButton = new JButton("Clear all");
        clearButton.setBackground(Color.WHITE);
        clearButton.addActionListener(e -> canvas.repaint());
        leftPanel.add(clearButton);

        add(leftPanel, BorderLayout.WEST);

        // Toolbar Panel
        JPanel toolbar = new JPanel();
        toolbar.setLayout(new BoxLayout(toolbar, BoxLayout.X_AXIS));
        toolbar.setBackground(Color.PINK);

        // Empty panel to center the buttons
        JPanel emptyPanelLeft = new JPanel();
        emptyPanelLeft.setBackground(Color.PINK);
        toolbar.add(emptyPanelLeft);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBackground(Color.PINK);

        // Color buttons
        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        redButton.setForeground(Color.WHITE);
        redButton.addActionListener(e -> currentColor = Color.RED);
        buttonPanel.add(redButton);

        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        blueButton.setForeground(Color.WHITE);
        blueButton.addActionListener(e -> currentColor = Color.BLUE);
        buttonPanel.add(blueButton);

        // Shape buttons
        shapeGroup = new ButtonGroup();
        JRadioButton squareButton = new JRadioButton("Square");
        squareButton.addActionListener(e -> currentShape = "Square");
        buttonPanel.add(squareButton);
        shapeGroup.add(squareButton);

        JRadioButton ovalButton = new JRadioButton("Oval", true);
        ovalButton.addActionListener(e -> currentShape = "Oval");
        buttonPanel.add(ovalButton);
        shapeGroup.add(ovalButton);

        // Fill/Outline buttons
        fillGroup = new ButtonGroup();
        JRadioButton fillButton = new JRadioButton("Fill", true);
        fillButton.addActionListener(e -> fillShape = true);
        buttonPanel.add(fillButton);
        fillGroup.add(fillButton);

        JRadioButton outlineButton = new JRadioButton("Out Line");
        outlineButton.addActionListener(e -> fillShape = false);
        buttonPanel.add(outlineButton);
        fillGroup.add(outlineButton);

        toolbar.add(buttonPanel);

        // Empty panel to center the buttons
        JPanel emptyPanelRight = new JPanel();
        emptyPanelRight.setBackground(Color.PINK);
        toolbar.add(emptyPanelRight);

        add(toolbar, BorderLayout.NORTH);

        // Canvas Panel
        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };
        canvas.setBackground(Color.YELLOW);
        canvas.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = canvas.getGraphics();
                g.setColor(currentColor);

                int x = e.getX();
                int y = e.getY();
                int width = 30;
                int height = 30;

                if (currentShape.equals("Oval")) {
                    if (fillShape) {
                        g.fillOval(x, y, width, height);
                    } else {
                        g.drawOval(x, y, width, height);
                    }
                } else if (currentShape.equals("Square")) {
                    if (fillShape) {
                        g.fillRect(x, y, width, height);
                    } else {
                        g.drawRect(x, y, width, height);
                    }
                }
            }
        });

        add(canvas, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MousePaintApp app = new MousePaintApp();
            app.setVisible(true);
        });
    }
}
