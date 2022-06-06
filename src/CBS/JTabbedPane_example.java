package CBS;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPane_example {
		
	public static void main(String[] args) {
		new JTabbedPane_example();
	}
	
	public JTabbedPane_example() {
		/*JFrame jFrame = new JFrame("JTabbedPane_example");
		//jFrame.getContentPane().setLayout(null);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		int x = (dimension.width-300) / 2;
		int y = dimension.height / 2;
		
		JTabbedPane jTabbedPane = new JTabbedPane();
		
		jTabbedPane.setBounds(0, 0, 300, 150);
		jTabbedPane.addTab("CV", null, null, "aircraft carrier");
		jTabbedPane.addTab("BB", null,null,"Battleship");
		jTabbedPane.addTab("DD", null, null, "destoryer");
		
		jFrame.setLocation(x,y);
		jFrame.setSize(300, 150);
		jFrame.getContentPane().add(jTabbedPane);
		jFrame.setVisible(true);*/
		//plan B
		
		Current_JFrame current_JFrame = new Current_JFrame("JTabbedPane_example", null, null);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		int x = (dimension.width-300) / 2;
		int y = dimension.height / 2;
		
		JTabbedPane jTabbedPane = new JTabbedPane();
		
		jTabbedPane.setBounds(0, 0, 300, 150);
		jTabbedPane.addTab("CV", null, null, "aircraft carrier");
		jTabbedPane.addTab("BB", null,null,"Battleship");
		jTabbedPane.addTab("DD", null, null, "destoryer");
		
		current_JFrame.setLocation(x,y);
		current_JFrame.setSize(300, 150);
		current_JFrame.getContentPane().add(jTabbedPane);
	}

}
