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
import java.io.File;
import java.io.FileFilter;
import java.util.Vector;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import org.jdesktop.swingx.JXTree;

public class MainFrame extends JFrame{
	private JMenuBar menu = null;
	private JMenu menuFichier = null;
	private JMenuItem itemFichier = null ;
	private JMenuItem itemExit = null ;
	private TreePanel tp = null ;
	public static Dimension dimFrame ;
	public static File XML = null ;
	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
       this.setJMenuBar(getMenu());
       dimFrame = Toolkit.getDefaultToolkit().getScreenSize();
       tp = new TreePanel();
       MainFrame.this.add(tp,BorderLayout.CENTER);
       //this.add(new InfoPanel(),BorderLayout.SOUTH);
			
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
			itemExit = new JMenuItem("Exit");
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
			itemFichier = new JMenuItem("Open");
			itemFichier.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					String myHome = "." + File.separator ;
					System.out.println(myHome);
					JFileChooser opening = new JFileChooser(myHome);
					opening.setFileFilter(new myFileFilter());
					opening.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
					if (opening.showOpenDialog(MainFrame.this) == JFileChooser.CANCEL_OPTION){
						System.out.println("cancel");
					}
					else {
						MainFrame.XML = opening.getSelectedFile() ;
						Vector<String> v = new Vector<String>();
						v.add("tester");
						v.add("developer");
						DialogRoles d = new DialogRoles(MainFrame.this,v);
						if (d.getChoix() == DialogRoles.CHOIX_OK){
							System.out.println("coucou");
							JXTree t = new JXTree() ;
							MainFrame.this.tp.putTree(t);	
						}
						
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
			menuFichier = new JMenu("File");
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
		super("SPELP : Process Execution Assistant");
		this.setLayout(new BorderLayout());
		
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/4, Toolkit.getDefaultToolkit().getScreenSize().height/3);
		this.setLocation(0,0);
		
		initialize();
		this.setVisible(true);
	}

	public Dimension getDimFrame() {
		return dimFrame;
	}
		
	private class myFileFilter extends javax.swing.filechooser.FileFilter{

		@Override
		public boolean accept(File arg0) {
			return(arg0.getName().endsWith("xml")||arg0.getName().endsWith("XML")||arg0.isDirectory());
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return "XML files export from EPF (*.XML)";
		}
		
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
