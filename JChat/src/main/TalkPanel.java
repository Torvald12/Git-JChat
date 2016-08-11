package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TalkPanel extends JPanel {

    private final JTextArea jTextArea;
    private final JTextField jTextField;
    private final JButton jSmileButton;
    private final JPanel jSouthPanel;
    private final JPanel jMainPanel;
    private final Font font = new Font("Times New Roman", Font.PLAIN, 24);

    private final static String newline = "\n";
    //public String nick;

    public TalkPanel() {
        super(new BorderLayout());

        jMainPanel = new JPanel();
        jTextArea = new JTextArea();
        jTextArea.setFont(font);
        jTextArea.setEditable(false);
        jTextField = new JTextField();
        jTextField.setFont(font);
        jTextField.setPreferredSize(new Dimension(1500, 100));
        jMainPanel.add(jTextArea);

        final JScrollPane scrollPane = new JScrollPane();
        jMainPanel.add(scrollPane, BorderLayout.CENTER);

        jSmileButton = new JButton("Smiles");
        jSmileButton.setPreferredSize(new Dimension(100, 100));
        jSouthPanel = new JPanel();

        jSouthPanel.add(jTextField);
        jSouthPanel.add(jSmileButton);
        //add(jSouthPanel, BorderLayout.SOUTH);

        add(jTextArea, BorderLayout.CENTER);
//        add(jTextField, BorderLayout.SOUTH);
//        add(jSmileButton, BorderLayout.SOUTH);
        add(jSouthPanel, BorderLayout.SOUTH);

        jSmileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame windowSmile = new JFrame("Smiles");
                JPanel panelSmile = new JPanel();
                Font biggerFont = new Font("Times New Roman", Font.BOLD, 45);

                panelSmile.setBorder(BorderFactory.createLineBorder(Color.black));
                //panelSmile.setBounds(5, 5, 895, 895);

                windowSmile.setSize(600, 600);
                windowSmile.setVisible(true);

                windowSmile.add(panelSmile);

                panelSmile.setLayout(new GridLayout(3, 3));

                JButton b1 = new JButton(":)");
                JButton b2 = new JButton(":(");
                JButton b3 = new JButton(":/");
                JButton b4 = new JButton("0___0");
                JButton b5 = new JButton(":D");
                JButton b6 = new JButton(":3");
                JButton b7 = new JButton(":*");
                JButton b8 = new JButton(":P");
                JButton b9 = new JButton(":0");

                b1.setFont(biggerFont);
                b2.setFont(biggerFont);
                b3.setFont(biggerFont);
                b4.setFont(biggerFont);
                b5.setFont(biggerFont);
                b6.setFont(biggerFont);
                b7.setFont(biggerFont);
                b8.setFont(biggerFont);
                b9.setFont(biggerFont);

                b1.setBackground(Color.white);
                b2.setBackground(Color.white);
                b3.setBackground(Color.white);
                b4.setBackground(Color.white);
                b5.setBackground(Color.white);
                b6.setBackground(Color.white);
                b7.setBackground(Color.white);
                b8.setBackground(Color.white);
                b9.setBackground(Color.white);

                panelSmile.add(b1);
                panelSmile.add(b2);
                panelSmile.add(b3);
                panelSmile.add(b4);
                panelSmile.add(b5);
                panelSmile.add(b6);
                panelSmile.add(b7);
                panelSmile.add(b8);
                panelSmile.add(b9);

                b1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        jTextField.setText(jTextField.getText() + ":)");
                    }
                });

                b2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        jTextField.setText(jTextField.getText() + ":(");
                    }
                });

                b3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        jTextField.setText(jTextField.getText() + ":/");
                    }
                });

                b4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        jTextField.setText(jTextField.getText() + "0___0");
                    }
                });

                b5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        jTextField.setText(jTextField.getText() + ":D");
                    }
                });

                b6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        jTextField.setText(jTextField.getText() + ":3");
                    }
                });

                b7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        jTextField.setText(jTextField.getText() + ":*");
                    }
                });

                b8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        jTextField.setText(jTextField.getText() + ":P");
                    }
                });

                b9.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        jTextField.setText(jTextField.getText() + ":0");
                    }
                });

            }
        });

        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                String text = jTextField.getText();
                jTextArea.append("[" + "Torvald12" + "] " + text + newline);
                //jTextField.selectAll();
                jTextField.setText("");
            }
        });

    }
}
