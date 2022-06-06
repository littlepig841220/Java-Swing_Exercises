package CBS;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JCheckBox_example extends JPanel implements ItemListener{
	private static final long serialVersionUID = 1L;
	private JCheckBox jCheckBox, jCheckBox2, jCheckBox3, jCheckBox4;
	private JTextField jTextField;

	public static void main(String[] args) {
		new Current_JFrame("JCheckBox_example", new JCheckBox_example(), new FlowLayout());
	}
	
	public JCheckBox_example() {
		add(jCheckBox = new JCheckBox("1"));
		add(jCheckBox2 = new JCheckBox("2"));
		add(jCheckBox3 = new JCheckBox("3"));
		add(jCheckBox4 = new JCheckBox("4"));
		add(jTextField = new JTextField(20));
		
		jCheckBox.addItemListener(this);
		jCheckBox2.addItemListener(this);
		jCheckBox3.addItemListener(this);
		jCheckBox4.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getItemSelectable() == jCheckBox) {
			jTextField.setText("1");
		}else if (e.getItemSelectable() == jCheckBox2) {
			jTextField.setText("2");
		}else if (e.getItemSelectable() == jCheckBox3) {
			jTextField.setText("3");
		}else if (e.getItemSelectable() == jCheckBox4) {
			jTextField.setText("4");
		}
	}

}
