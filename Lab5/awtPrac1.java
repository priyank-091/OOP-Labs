import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class awtPrac1 extends Frame {
    public awtPrac1() {
        Button b = new Button("Click me!");
        b.setBounds(30, 100, 80, 30);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setTitle("getTitle()");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        awtPrac1 f = new awtPrac1();
    }
}
