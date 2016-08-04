package main;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TalkPanel extends JPanel {

    private final JTextArea jTextArea;
    private final JTextField jTextField;
    private final Font font = new Font("Calibri", Font.PLAIN, 24);

    public TalkPanel() {
        super(new BorderLayout());

        jTextArea = new JTextArea();
        jTextArea.setFont(font);
        jTextArea.setEditable(false);
        jTextField = new JTextField();
        jTextField.setFont(font);
        add(jTextArea, BorderLayout.CENTER);
        add(jTextField, BorderLayout.SOUTH);
    }

}
