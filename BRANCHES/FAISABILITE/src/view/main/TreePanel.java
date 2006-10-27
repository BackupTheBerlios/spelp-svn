package view.main;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import org.jdesktop.swingx.JXTree;

public class TreePanel extends JPanel {
	
	private JXTree tree = null ;
	
	public TreePanel(){
		super();
		this.setLayout(new BorderLayout());
		this.add(getTree(),BorderLayout.CENTER);
	}
	
	public JXTree getTree (){
		if (tree == null){
			tree = new JXTree();
		}
		return (tree);
	}
}
