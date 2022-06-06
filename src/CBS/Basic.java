package CBS;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Basic extends JFrame{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Basic();
	}
	
	public Basic() {
		setDefaultLookAndFeelDecorated(true);
		
		new JFrame("Swing basic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Create a Swing window");
		label.setPreferredSize(new Dimension(175, 100));
		getContentPane().add(label,BorderLayout.CENTER);
		
		pack();
		
		setVisible(true);
	}

}
