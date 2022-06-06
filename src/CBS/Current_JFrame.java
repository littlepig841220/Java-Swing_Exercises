package CBS;

import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Current_JFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	public JPanel panel;
	public Integer sizeX,sizeY;

	public Current_JFrame(String title, JPanel jPanel, LayoutManager layoutManager) {
		if (jPanel != null) {
			panel = jPanel;
			
			panel.setOpaque(true);
			setContentPane(panel);
		}
		
		if (layoutManager != null) {
			getContentPane().setLayout(layoutManager);
		}
		
		if (sizeX != null && sizeY != null) {
			setLocation(sizeX, sizeY);
		}
		
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle(title);
		
		pack();
		
		setVisible(true);
	}
}
