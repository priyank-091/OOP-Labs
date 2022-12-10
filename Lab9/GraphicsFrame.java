import java.util.*;
import java.awt.*;
import java.awt.event.*;

class GraphicsFrame extends Frame {

	boolean reactVisible = false;

	public GraphicsFrame(){	
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		Button b1 = new Button("Draw Rectrangle");
		b1.setBounds(200,450,200,100);
		add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				reactVisible = !reactVisible;
				repaint();
			}
		});

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		
	}
	public void paint(Graphics g){
		if(reactVisible == true){
			g.drawRect(200,200,200,80);
		}
	}

	public static void main(String[] args){
		GraphicsFrame gf = new GraphicsFrame();
	}
}
