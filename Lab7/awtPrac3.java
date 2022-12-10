import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class awtPrac3 extends Frame implements ActionListener {
    TextField tf1, tf2, tf3;
    Button b1, b2;

    public awtPrac3() {
        setSize(300, 300);
        setLayout(null);
        tf1 = new TextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new TextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new TextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);
        b1 = new Button("+");
        b2 = new Button("-");
        b1.setBounds(50, 200, 50, 50);
        b2.setBounds(120, 200, 50, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        int num3 = 0;
        if (ae.getSource() == b1) {
            num3 = num1 + num2;
        } else if (ae.getSource() == b2) {
            num3 = num1 - num2;
        }
        String res = Integer.toString(num3);// String.valueOf()
        tf3.setText(res);
    }

    public static void main(String[] args) {
        awtPrac3 a3 = new awtPrac3();
    }
}
