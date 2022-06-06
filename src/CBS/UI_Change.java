package CBS;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class UI_Change extends JFrame{
	private static final long serialVersionUID = 1L;
	private JRadioButton jRadioButton = new JRadioButton("Default UI");
	private JRadioButton jRadioButton2 = new JRadioButton("Unix");
	private JRadioButton jRadioButton3 = new JRadioButton("Windows");
	
	
	
	public static void main(String[] args) {
		new UI_Change();
	}
	
	public UI_Change() {
		setTitle("Change Swing UI");
		
		getContentPane().add(new jp(),BorderLayout.CENTER);
		
		pack();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class jp extends JPanel implements ActionListener{
		private static final long serialVersionUID = 1L;
		
		public jp() {
			add(new JTextField("Text Field"));
			add(new JButton("Button"));
			add(new JRadioButton("Select"));
			add(new JCheckBox("Check"));
			add(new JLabel("Label"));
			add(new JList<>(new String[] {
					"1","2","3"
			}));
			add(new JScrollBar(SwingConstants.HORIZONTAL));
			
			ButtonGroup buttonGroup = new ButtonGroup();
			buttonGroup.add(jRadioButton);
			buttonGroup.add(jRadioButton2);
			buttonGroup.add(jRadioButton3);
			
			jRadioButton.addActionListener(this);
			jRadioButton2.addActionListener(this);
			jRadioButton3.addActionListener(this);
			
			add(jRadioButton);
			add(jRadioButton2);
			add(jRadioButton3);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				if(e.getSource() == jRadioButton) {
					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
				}else if(e.getSource() == jRadioButton2) {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				}else if(e.getSource() == jRadioButton3) {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
				e2.printStackTrace();
			}
			
			SwingUtilities.updateComponentTreeUI(getContentPane());
		}
		
	}
}


