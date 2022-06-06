package CBS;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextField_example extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JTextField jTextField;
	private JTextArea jTextArea;

	public static void main(String[] args){
		new Current_JFrame("JTextField example", new JTextField_example(), null);
	}
	
	public JTextField_example() {
		super(new GridBagLayout());
		
		jTextField = new JTextField(30);
		jTextField.addActionListener(this);
		
		jTextArea = new JTextArea(10, 30);
		jTextArea.setEditable(false);
		JScrollPane jScrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.weightx = 2.0;
		gridBagConstraints.weighty = 2.0;
		add(jScrollPane, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		add(jTextField, gridBagConstraints);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String textString = jTextField.getText();
		jTextArea.append(textString + "\n");
		jTextField.selectAll();
		
		jTextArea.setCaretPosition(jTextArea.getDocument().getLength());
	}

}
