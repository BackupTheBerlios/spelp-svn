package view.main;

import java.awt.BorderLayout;
import java.awt.SystemColor;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.JXTaskPane;

public class InfoPanel extends JXPanel {
	private JXTaskPane tasks = null ;
	private JLabel editor = null;
	public InfoPanel () {
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
		this.setLayout(new BorderLayout());
		this.add(getTasks(),BorderLayout.CENTER);
	}


	public JXTaskPane getTasks (){
		if (tasks == null){
			tasks = new JXTaskPane();
			tasks.setTitle("Informations");
			tasks.setExpanded(false);
			editor = new JLabel("no information");
			tasks.add(editor);
			
		}
		return tasks ;
	}
	
	public void setInfo(String i){
		editor.setText(i);
	}
}
