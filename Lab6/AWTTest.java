import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTTest {

    AWTTest() {
        Frame frame = new Frame("My Frame");
        frame.setSize(700, 500);

        frame.add(new Label("Buttons"));
        frame.add(new TextField());
        frame.add(new Button("ONE"));
        frame.add(new Checkbox("book"));
        frame.add(new Checkbox("bag"));
        frame.add(new Checkbox("laptop"));

        Choice c = new Choice();
        c.addItem("OS");
        c.addItem("OOPS");
        frame.add(c);

        List l = new List();
        l.add("Ram");
        l.add("Mohan");
        l.add("John");
        TextArea textArea = new TextArea();
        textArea.setSize(30, 40);
        frame.add(textArea);
        frame.add(l);

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}