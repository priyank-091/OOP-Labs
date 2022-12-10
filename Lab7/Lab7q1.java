import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Lab7q1 extends Frame {
    private String msg = "";
    TextField name, password;

    public Lab7q1() {
        setSize(700, 500);
        setLayout(null);
        Label nameLabel = new Label("Name: ", Label.LEFT);
        Label passLabel = new Label("Password: ", Label.LEFT);
        nameLabel.setBounds(50, 70, 100, 25);
        passLabel.setBounds(50, 200, 100, 25);
        name = new TextField();
        password = new TextField();
        password.setEchoChar('*');
        name.setBounds(150, 70, 100, 25);
        password.setBounds(150, 200, 100, 25);
        Button submitBtn = new Button("Submit");
        submitBtn.setBounds(20, 300, 50, 25);
        Label dummy = new Label();
        add(nameLabel);
        add(passLabel);
        add(password);
        add(submitBtn);
        add(name);
        setVisible(true);
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String personName = name.getText();
                String personPass = password.getText();
                if (personName.equals("bits") && personPass.equals("bitspilani")) {
                    msg = "SUCCESS";
                } else {
                    msg = "FAILED";
                }
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 300);
    }

    public static void main(String[] args) {
        Lab7q1 p1 = new Lab7q1();
    }
}
