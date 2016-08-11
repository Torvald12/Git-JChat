package main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Main extends JFrame {

    private Image im = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/img/elephant.jpg"));
    private final JTabbedPane jTabbedPane = new JTabbedPane();

    public Main(String title, int w, int h) {
        super(title);
        setSize(w, h);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initMenu();

        jTabbedPane.addTab("JChat", new JPanel() {

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
                g.drawImage(im, 0, 0, getSize().width, getSize().height, this);
            }

        });
        add(jTabbedPane);
        setVisible(true);
    }

    private void initMenu() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu jmFile = new JMenu("File");
        jMenuBar.add(jmFile);

        JMenuItem jmiAddTalk = new JMenuItem("Add talk");
        jmFile.add(jmiAddTalk);
        jmiAddTalk.addActionListener((ActionEvent e) -> {
            TalkPropertiesDialog tpd = new TalkPropertiesDialog();

            if (tpd.showDialog()) {
                jTabbedPane.addTab(tpd.getTalkName(), new TalkPanel());
            }
        });

        JMenuItem jmiExit = new JMenuItem("Exit");
        jmFile.add(jmiExit);
        jmiExit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        super.setJMenuBar(jMenuBar);
    }

    public static void main(String[] args) {

        Main main = new Main("JChat", 500, 500);
        main.setExtendedState(MAXIMIZED_BOTH);
    }

}
