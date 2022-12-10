import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class prob1 {
    public prob1() {
        JFrame jfm = new JFrame("Jframe Demo");
        jfm.setLayout(null);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setVisible(true);
        jfm.setSize(400, 500);
        JButton jb = new JButton("Click me!");
        jb.setBounds(150, 200, 100, 100);
        jfm.add(jb);
    }

    public static void main(String[] args) {
        prob1 p1 = new prob1();
    }
}
