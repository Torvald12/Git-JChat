package main;

import java.awt.GridLayout;
import java.util.StringTokenizer;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TalkPropertiesDialog {

    private boolean status;

    private final JLabel jlNickName;
    private final JLabel jlNameTalk;
    private final JLabel jlIP;
    private final JLabel jlPort;

    private final JTextField jtfNickName;
    private final JTextField jtfTalkName;
    private final JTextField jtfIP;
    private final JTextField jtfPort;

    private final JCheckBox jcbToBeServer;

    public TalkPropertiesDialog() {
        jlNickName = new JLabel("Псевдонім:");
        jlNameTalk = new JLabel("Назва бесіди:");
        jlIP = new JLabel("IP: ");
        jlPort = new JLabel("Порт: ");

        jtfNickName = new JTextField(10);
        jtfTalkName = new JTextField(10);
        jtfIP = new JTextField(10);
        jtfPort = new JTextField(10);

        jcbToBeServer = new JCheckBox("Бути сервером", false);
    }

    public boolean showDialog() {
        Object[] options = {"Застосувати", "Скасувати"};

        JPanel jPanel = new JPanel(new GridLayout(0, 2, 0, 10));

        jPanel.add(jlNickName);
        jPanel.add(jtfNickName);
        jPanel.add(jlNameTalk);
        jPanel.add(jtfTalkName);
        jPanel.add(jlIP);
        jPanel.add(jtfIP);
        jPanel.add(jlPort);
        jPanel.add(jtfPort);
        jPanel.add(jcbToBeServer);

        int result = JOptionPane.showOptionDialog(null, jPanel, "Параметри", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        this.status = (result == 0);
        return status;
    }

    public String getNickName() {
        return jtfNickName.getText();
    }

    public String getTalkName() {
        return jtfTalkName.getText();
    }

    public byte[] getIpAdd() {
        StringTokenizer tokenizer = new StringTokenizer(jtfIP.getText(), ".");
        String strIpAdd[] = new String[4];
        for (int i = 0; i < strIpAdd.length; i++) {
            strIpAdd[i] = tokenizer.nextToken();
        }
        byte ipAdd[] = new byte[4];

        if (!jtfIP.getText().trim().equals("")) {
            for (int i = 0; i < 4; i++) {
                ipAdd[i] = Byte.parseByte(strIpAdd[i]);
            }
        }
        return ipAdd;
    }

    public int getPort() {
        return Integer.parseInt(jtfPort.getText());
    }

    public boolean isServer() {
        return jcbToBeServer.isCursorSet();
    }

    public boolean getStatus() {
        return status;
    }
}
