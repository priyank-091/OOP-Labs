import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Prob4 extends Frame {
    Button First, Second;
    TextField output;

    public Prob4() {
        setSize(700, 400);
        setLayout(null);
        output = new TextField();
        output.setBounds(20, 50, 300, 50);
        First = new Button("First");
        First.setBounds(20, 150, 150, 50);
        Second = new Button("Second");
        Second.setBounds(20, 250, 150, 50);
        add(output);
        add(First);
        add(Second);
        // First.addActionListener(this);
        setVisible(true);
        // this is used when ActionListener interface is not implemented.
        First.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String str = ae.getActionCommand();
                output.setText(str + " Pressed.");
            }
        });
        Second.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String str = ae.getActionCommand();
                output.setText(str + " Pressed.");
            }
        });
        // Second.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Prob4 p4 = new Prob4();
    }
}