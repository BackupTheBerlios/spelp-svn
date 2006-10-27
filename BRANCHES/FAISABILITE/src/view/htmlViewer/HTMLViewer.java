package view.htmlViewer;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JEditorPane;
import javax.swing.JFrame;

import view.main.MainFrame;

public class HTMLViewer extends JFrame {
	
	public HTMLViewer() {
		super("HTMLViewer");
		
		this.setLayout(new BorderLayout());
		
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2);
		this.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 3,0);
		
		initialize();
		this.setVisible(true);
		
		JEditorPane EP1 = new JEditorPane("text/html","<p><a href='Bidule.htm'>Bidule.htm</a></p>");
		EP1.setVisible(true);
		this.getContentPane().add(EP1);
	}
	
	private void initialize() {
		
	}
	
	public static void main(String[] args) {
		HTMLViewer f = new HTMLViewer();
	}
}
