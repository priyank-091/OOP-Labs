import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class awtPrac2 {
    public static void main(String[] args) {
        Frame f = new Frame("Button preview");
        Button b = new Button("Click me");
        b.setBounds(50, 100, 80, 30);
        f.add(b);
        // set size, layout and visibility of frame
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        Label buttonLabel = new Label("Useless Label", Label.LEFT);
        buttonLabel.setBounds(50, 150, 80, 30);
        f.add(buttonLabel);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
                System.exit(0);
            }
        });
    }
}
