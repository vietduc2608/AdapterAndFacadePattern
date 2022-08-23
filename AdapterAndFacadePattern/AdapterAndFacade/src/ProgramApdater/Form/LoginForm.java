package ProgramApdater.Form;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LoginForm extends JFrame {
    public void init() {
        JFrame jFrameLogin = new JFrame("Form Login");
        JButton jButtonLogin = new JButton("Login");
        jButtonLogin.setBounds(50, 100, 95, 30);
        jFrameLogin.setSize(400, 400);
        jFrameLogin.setLayout(null);
        jFrameLogin.setVisible(true);
        jFrameLogin.add(jButtonLogin);

    }

}
