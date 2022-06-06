package CBS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JButton_example extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JButton jButton, jButton2, jButton3;

	public static void main(String[] args) {
		new Current_JFrame("JButton example", new JButton_example(), null);
		//new JButton_example(); //plan B
	}
	
	public JButton_example() {
		jButton = new JButton("Disable the middle button");
		jButton.setVerticalTextPosition(AbstractButton.CENTER);
		jButton.setHorizontalTextPosition(AbstractButton.LEADING);
		jButton.setMnemonic(KeyEvent.VK_D);
		jButton.setActionCommand("dis");
		
		jButton2 = new JButton("Middle Button");
		jButton2.setVerticalTextPosition(AbstractButton.BOTTOM);
		jButton2.setHorizontalTextPosition(AbstractButton.CENTER);
		jButton2.setMnemonic(KeyEvent.VK_M);
		
		jButton3 = new JButton("Enable the middle button");
		jButton3.setMnemonic(KeyEvent.VK_E);
		jButton3.setActionCommand("en");
		jButton3.setEnabled(false);
		
		jButton.addActionListener(this);
		jButton2.addActionListener(this);
		jButton3.addActionListener(this);
		
		add(jButton);
		add(jButton2);
		add(jButton3);
		
		//new Current_JFrame("JButton example", this);//plan B
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("dis")) {
			jButton.setEnabled(false);
			jButton2.setEnabled(false);
			jButton3.setEnabled(true);
		}else {
			jButton.setEnabled(true);
			jButton2.setEnabled(true);
			jButton3.setEnabled(false);
		}
	}

}
