package EX26.src;

import javax.swing.*;

public class MenuPanel {
    private Management management;

    public MenuPanel(Management management) {
        this.management = management;
    }

    public JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);

        JMenu studentManagement = new JMenu("Quản lý sinh viên");
        JMenuItem qlmh = new JMenuItem("Quản lý môn học");
        JMenuItem qld = new JMenuItem("Quản lý điểm");
        qlmh.addActionListener(e -> management.showCourseManagement());
        qld.addActionListener(e -> management.showScoreManagement());
        studentManagement.add(qlmh);
        studentManagement.add(qld);

        menuBar.add(fileMenu);
        menuBar.add(studentManagement);

        return menuBar;
    }
}
