package GUI_Design;

import Public_Data.User_Data;

import javax.swing.*;
import java.awt.*;

/**
 * Created by JASON_ on 2015/6/25.
 */
public class Login_Dialog extends JDialog{
    private JLabel lbl;
    private JTextField EnterStuID;
    private JPasswordField EnterPasswd;
    private JButton Enter;
    private JButton Register;

    private ImageIcon pic;
    private Font font;


    private User_Data user;

    public Login_Dialog(){
        setLayout(null);
        font = new Font("微軟正黑體", Font.BOLD, 26);

        lbl = new JLabel("輸入學號:");
        lbl.setFont(font);
        lbl.setBounds(50, 30, 200, 100);
        this.getContentPane().add(lbl);

        lbl = new JLabel("輸入密碼:");
        lbl.setFont(font);
        lbl.setBounds(50, 130, 200, 100);
        this.getContentPane().add(lbl);

        EnterStuID = new JTextField();
        EnterStuID.setFont(font);
        EnterStuID.setBounds(170, 55, 200, 50);
        this.getContentPane().add(EnterStuID);

        EnterPasswd = new JPasswordField();
        EnterPasswd.setFont(font);
        EnterPasswd.setBounds(170, 155, 200, 50);
        this.getContentPane().add(EnterPasswd);

        Enter = new JButton("確認");
        Enter.setFont(font);
        Enter.setBounds(90, 230, 100, 40);
        this.getContentPane().add(Enter);

        Register = new JButton("註冊");
        Register.setFont(font);
        Register.setBounds(240, 230, 100, 40);
        this.getContentPane().add(Register);

        this.setSize(450, 400);
    }

}
