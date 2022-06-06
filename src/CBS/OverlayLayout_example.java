package CBS;

import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.OverlayLayout;

public class OverlayLayout_example extends JFrame{
	private static final long serialVersionUID = 1L;
	private Container container = getContentPane();
	private JButton jButton;
	private JLabel jLabel;
	private ImageIcon imageIcon = new ImageIcon(OverlayLayout_example.class.getResource("res/drawable/hana.jpg"));
	private JTextArea jTextArea;

	public static void main(String[] args) {
		new OverlayLayout_example();
	}
	
	public OverlayLayout_example() {
		jButton = new JButton("I'm Hana. Please click me.");
		jButton.setBorder(BorderFactory.createRaisedBevelBorder());
		
		jLabel = new JLabel(imageIcon);
		jLabel.setBorder(BorderFactory.createTitledBorder("JLabel area"));
		
		jTextArea = new JTextArea(1, 5);
		jTextArea.setBorder(BorderFactory.createTitledBorder("JTextArea area"));
		jTextArea.setBackground(Color.yellow);
		
		container.add(jButton);
		container.add(jLabel);
		container.add(jTextArea);
		container.setLayout(new OverlayLayout(container));
		
		setTitle("OverlayLayout example");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
