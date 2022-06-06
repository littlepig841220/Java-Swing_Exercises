package CBS;

import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BoxLayout_example extends JFrame{
	private static final long serialVersionUID = 1L;
	private Container container = getContentPane();
	private JPanel jPanel,jPanel2;
	private JButton jButton,jButton2,jButton3,jButton4;
	private JTextField jTextField,jTextField2,jTextField3,jTextField4; 

	public static void main(String[] args) {
		new BoxLayout_example();
	}
	
	public BoxLayout_example() {
		jPanel = new JPanel();
		
		jPanel.setBorder(BorderFactory.createTitledBorder("Title 1"));
		jPanel.add(jButton = new JButton("Button 1"));
		jPanel.add(jButton2 = new JButton("Button 2"));
		jPanel.add(jButton3 = new JButton("Button 3"));
		jPanel.add(jButton4 = new JButton("Button 4"));
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
		
		jPanel2 = new JPanel();
		
		jPanel2.setBorder(BorderFactory.createTitledBorder("Title 2"));
		jPanel2.add(jTextField = new JTextField(5));
		jPanel2.add(jTextField2 = new JTextField(5));
		jPanel2.add(jTextField3 = new JTextField(5));
		jPanel2.add(jTextField4 = new JTextField(5));
		jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
		
		container.add(jPanel);
		container.add(jPanel2);
		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		
		setTitle("BoxLayout example");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
