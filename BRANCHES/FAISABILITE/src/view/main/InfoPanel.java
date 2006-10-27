package view.main;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.JXTaskPane;

public class InfoPanel extends JXPanel {
	private JXTaskPane tasks = null ;
	
	public InfoPanel () {
		this.setLayout(new BorderLayout());
		this.add(getTasks() );
	}
	
	public JXTaskPane getTasks (){
		if (tasks == null){
			tasks = new JXTaskPane();
			tasks.setTitle("Informations");
			tasks.add(new JLabel("info 1"));
		}
		return tasks ;
	}
}
