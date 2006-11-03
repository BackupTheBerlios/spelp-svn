package view.htmlViewer;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JEditorPane;
import javax.swing.JFrame;

import view.main.MainFrame;

public class HTMLViewer extends JFrame {
	private static HTMLViewer instance = null;
	private String HTMLCode; // Le code HTML affiché 

	private JEditorPane myEditorPane;
	
	private HTMLViewer() {
		super("HTMLViewer");
		
		this.setLayout(new BorderLayout());
		
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2);
		this.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 3,0);
		
		this.myEditorPane = new JEditorPane();
		this.myEditorPane.setVisible(true);
		this.myEditorPane.setEditable(false);
		this.myEditorPane.setOpaque(false);
		this.myEditorPane.setContentType("text/html");
		this.myEditorPane.setFocusable(false);
		
		this.getContentPane().add(this.myEditorPane);
	}
	
	/**
	 * Modifie le texte affiché par le HTMLViewer
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.HTMLCode = message;
		this.myEditorPane.setText(this.HTMLCode);
	}
	
	
	
	/**
	 * 
	 * @return l'instance HTMLViewer
	 */
	public static HTMLViewer getInstance() {
		if (HTMLViewer.instance == null)
			HTMLViewer.instance = new HTMLViewer();
		
		return HTMLViewer.instance;
	}
}
