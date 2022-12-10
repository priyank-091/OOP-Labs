import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class prob2 extends Frame implements ActionListener {
    String msg = "";
    TextField name, password;
    Button submit;

    public prob2() {
        // Frame frame = new Frame();
        setSize(700, 500);
        setLayout(null);
        name = new TextField();
        name.setBounds(150, 70, 200, 50);
        Label nameLabel = new Label("Name: ", Label.RIGHT);
        Label passLabel = new Label("Password: ", Label.RIGHT);
        nameLabel.setBounds(50, 70, 100, 50);
        password = new TextField();
        passLabel.setBounds(50, 200, 100, 50);
        password.setEchoChar('?');
        password.setBounds(150, 200, 200, 50);

        submit = new Button("Submit");
        submit.setBounds(20, 350, 100, 50);
        Label label = new Label("Please login");
        label.setBounds(150, 350, 100, 50);
        add(name);
        add(nameLabel);
        add(password);
        add(passLabel);
        add(submit);
        add(label);
        setVisible(true);
        submit.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String personName = name.getText();
        String personId = password.getText();
        msg = "Name: " + personName + " Password: " + personId;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 420);
    }

    public static void main(String[] args) {
        prob2 p2 = new prob2();
    }
}
