package CBS;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class JList_example extends JPanel{
	private static final long serialVersionUID = 1L;
	private JList jList;
	private DefaultListModel defaultListModel;
	
	public static void main(String[] args) {
		new Current_JFrame("JList_example", new JList_example(), null);
	}
	
	public JList_example() {
		super(new BorderLayout());
		
		defaultListModel = new DefaultListModel<>();
		
		defaultListModel.addElement("Violin");
		defaultListModel.addElement("Flute");
		defaultListModel.addElement("Oboe");
		defaultListModel.addElement("Paino");
		
		jList = new JList(defaultListModel);
		
		jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jList.setSelectedIndex(0);
		jList.setVisibleRowCount(5);
		
		JScrollPane jScrollPane = new JScrollPane(jList);
		
		add(jScrollPane,BorderLayout.CENTER);
	}

}
