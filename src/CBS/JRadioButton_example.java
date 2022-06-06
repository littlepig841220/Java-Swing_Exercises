package CBS;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButton_example extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private static String string = "hana";
	private static String string2 = "mako";
	private static String string3 = "miho";
	private static String string4 = "saori";
	private static String string5 = "yukari";
	private JLabel picture;
	private JRadioButton jRadioButton, jRadioButton2, jRadioButton3, jRadioButton4, jRadioButton5;

	public static void main(String[] args) {
		new Current_JFrame("JRadioButton example", new JRadioButton_example(), null);
	}
	
	public JRadioButton_example() {
		super(new BorderLayout());
		
		jRadioButton = new JRadioButton(string);
		jRadioButton.setActionCommand(string);
		jRadioButton.setSelected(true);
		
		jRadioButton2 = new JRadioButton(string2);
		jRadioButton2.setActionCommand(string2);
		
		jRadioButton3 = new JRadioButton(string3);
		jRadioButton3.setActionCommand(string3);
		
		jRadioButton4 = new JRadioButton(string4);
		jRadioButton4.setActionCommand(string4);
		
		jRadioButton5 = new JRadioButton(string5);
		jRadioButton5.setActionCommand(string5);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton);
		buttonGroup.add(jRadioButton2);
		buttonGroup.add(jRadioButton3);
		buttonGroup.add(jRadioButton4);
		buttonGroup.add(jRadioButton5);
		
		jRadioButton.addActionListener(this);
		jRadioButton2.addActionListener(this);
		jRadioButton3.addActionListener(this);
		jRadioButton4.addActionListener(this);
		jRadioButton5.addActionListener(this);
		
		picture = new JLabel(create_icon("res/drawable/" + jRadioButton.getActionCommand() + ".jpg"));
		picture.setPreferredSize(new Dimension(177, 122));
		
		JPanel radioJPanel = new JPanel(new GridLayout(0, 1));
		
		radioJPanel.add(jRadioButton);
		radioJPanel.add(jRadioButton2);
		radioJPanel.add(jRadioButton3);
		radioJPanel.add(jRadioButton4);
		radioJPanel.add(jRadioButton5);
		
		add(radioJPanel, BorderLayout.LINE_START);
		add(picture, BorderLayout.CENTER);
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	}
	
	protected static ImageIcon create_icon(String path) {
		java.net.URL imaUrl = JRadioButton_example.class.getResource(path);
		return new ImageIcon(imaUrl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		picture.setIcon(create_icon("res/drawable/" + e.getActionCommand() + ".jpg"));
	}

}
