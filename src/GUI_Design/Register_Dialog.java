package GUI_Design;

import Public_Data.User_Data;

import javax.swing.*;
import java.awt.*;

/**
 * Created by JASON_ on 2015/6/25.
 */
public class Register_Dialog extends JDialog {
    private JLabel lbl;
    private JTextField EnterName;
    private JTextField EnterStuID;
    private JPasswordField EnterPasswd;
    private JPasswordField EnterPasswd2;
    private JTextField EnterSerial;
    private JButton Enter;
    private JButton Register;

    private ImageIcon pic;
    private Font font;


    private User_Data user;

    public Register_Dialog() {
        setLayout(null);
        font = new Font("微軟正黑體", Font.BOLD, 18);

        lbl = new JLabel("輸入姓名:");
        lbl.setFont(font);
        lbl.setBounds(60, 30, 200, 100);
        this.getContentPane().add(lbl);

        lbl = new JLabel("輸入學號:");
        lbl.setFont(font);
        lbl.setBounds(60, 80, 200, 100);
        this.getContentPane().add(lbl);

        lbl = new JLabel("輸入密碼:");
        lbl.setFont(font);
        lbl.setBounds(60, 130, 200, 100);
        this.getContentPane().add(lbl);

        lbl = new JLabel("再輸密碼:");
        lbl.setFont(font);
        lbl.setBounds(60, 180, 200, 100);
        this.getContentPane().add(lbl);

        lbl = new JLabel("輸入序號:");
        lbl.setFont(font);
        lbl.setBounds(60, 230, 200, 100);
        this.getContentPane().add(lbl);

        EnterName = new JTextField();
        EnterName.setFont(font);
        EnterName.setHorizontalAlignment(JTextField.CENTER);
        EnterName.setBounds(170, 65, 200, 30);
        this.getContentPane().add(EnterName);

        EnterStuID = new JTextField();
        EnterStuID.setFont(font);
        EnterStuID.setHorizontalAlignment(JTextField.CENTER);
        EnterStuID.setBounds(170, 115, 200, 30);
        this.getContentPane().add(EnterStuID);

        EnterPasswd = new JPasswordField();
        EnterPasswd.setFont(font);
        EnterPasswd.setHorizontalAlignment(JTextField.CENTER);
        EnterPasswd.setBounds(170, 165, 200, 30);
        this.getContentPane().add(EnterPasswd);

        EnterPasswd2 = new JPasswordField();
        EnterPasswd2.setFont(font);
        EnterPasswd2.setHorizontalAlignment(JTextField.CENTER);
        EnterPasswd2.setBounds(170, 215, 200, 30);
        this.getContentPane().add(EnterPasswd2);

        EnterSerial = new JTextField();
        EnterSerial.setFont(font);
        EnterSerial.setHorizontalAlignment(JTextField.CENTER);
        EnterSerial.setBounds(170, 265, 200, 30);
        this.getContentPane().add(EnterSerial);

        Register = new JButton("註冊");
        Register.setFont(font);
        Register.setBounds(240, 320, 100, 40);
        this.getContentPane().add(Register);

        this.setSize(450, 450);
    }
}
