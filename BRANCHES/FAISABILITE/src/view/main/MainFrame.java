package view.main;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MainFrame extends JFrame{
	private JMenuBar menu = null;
	private JMenu menuFichier = null;
	private JMenuItem itemFichier = null ;
	private JMenuItem itemExit = null ;
	public static Dimension dimFrame ;
	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
       this.setJMenuBar(getMenu());
       dimFrame = Toolkit.getDefaultToolkit().getScreenSize();
       this.add(new TreePanel(),BorderLayout.CENTER);
       this.add(new InfoPanel(),BorderLayout.SOUTH);
			
	}

	/**
	 * This method initializes menu	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getMenu() {
		if (menu == null) {
			menu = new JMenuBar();
			
			menu.setPreferredSize(new Dimension(0, 20));
			menu.add(getMenuFichier());
			
		}
		return menu;
	}

	private JMenuItem getExitItem(){
		if (itemExit == null){
			itemExit = new JMenuItem("Quitter");
			itemExit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
						System.exit(0);
				}
			});
		}
		return (itemExit);
		
	}
	private JMenuItem getFichierItem(){
		if (itemFichier == null) {
			itemFichier = new JMenuItem("Ouvrir");
			itemFichier.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					JFileChooser opening = new JFileChooser();
					opening.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
					if (opening.showOpenDialog(MainFrame.this) == JFileChooser.CANCEL_OPTION){
						System.out.println("cancel");
					}
					else {
						System.out.println(opening.getSelectedFile());
					}
				}
				
			});
		}
		return itemFichier;
	}
	
	/**
	 * This method initializes menuFichier	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMenuFichier() {
		if (menuFichier == null) {
			menuFichier = new JMenu("Fichier");
			menuFichier.add(getFichierItem());
			menuFichier.add(getExitItem());
		}
		return menuFichier;
	}

	/**
	 * @param args ne sont pas utilises
	 */
	public static void main(String[] args) {
		MainFrame f = new MainFrame();
		
	}
	
	public MainFrame () {
		super("SPELP : Assistant d'execution de processus");
		this.setLayout(new BorderLayout());
		
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height);
		this.setLocation(0,0);
		
		initialize();
		this.setVisible(true);
	}

	public Dimension getDimFrame() {
		return dimFrame;
	}
		

}  //  @jve:decl-index=0:visual-constraint="10,10"
