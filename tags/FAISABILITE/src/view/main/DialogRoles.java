package view.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;

import parser.Parser;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.event.KeyEvent;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import java.awt.Font;

public class DialogRoles extends JDialog {

	private static final long serialVersionUID = 1L;
	
	public static int CHOIX_OK = 0 ;
	public static int CHOIX_CANCEL = 1 ;
	
	private int choice = 0 ;
	
	private JPanel jContentPane = null;

	private JLabel selectRole = null;

	private JComboBox listeRole = null;

	private JPanel jPanel = null;

	private JButton cancel = null;

	private JButton OK = null;

	private JScrollPane jScrollPane = null;

	private JEditorPane roleDesc = null;

	private JPanel north = null;

	private JPanel center = null;

	private JPanel south = null;

	/**
	 * @param owner
	 */
	public DialogRoles(Frame owner, Collection<MyModelElement> listRoles) {
		super(owner,true);
		initialize();
		for (Iterator i = listRoles.iterator();i.hasNext();){
			listeRole.addItem(i.next());
		}
		this.setVisible(true);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(330, 343);
		this.setTitle("Please choose your role");
		this.setResizable(false);
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {			
			selectRole = new JLabel();
			selectRole.setText("Please select your Role");
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getNorth(), BorderLayout.NORTH);
			jContentPane.add(getCenter(), BorderLayout.CENTER);
			jContentPane.add(getSouth(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	/**
	 * This method initializes listeRole	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getListeRole() {
		if (listeRole == null) {
			listeRole = new JComboBox();
			listeRole.setPreferredSize(new Dimension(31, 20));
			listeRole.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					DialogRoles.this.setDescription(Parser.getInstance().getDescriptionByRole(((MyModelElement)listeRole.getSelectedItem()).getRealName()));
				}
			});
		}
		return listeRole;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridy = 0;
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(getJPanel(), BoxLayout.X_AXIS));
			jPanel.setPreferredSize(new Dimension(68, 30));
			jPanel.add(getCancel(), null);
			jPanel.add(getOK(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes cancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getCancel() {
		if (cancel == null) {
			cancel = new JButton();
			cancel.setPreferredSize(new Dimension(80, 20));
			cancel.setMnemonic(KeyEvent.VK_UNDEFINED);
			cancel.setText("Cancel");
			cancel.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					choice = DialogRoles.CHOIX_CANCEL ;
					DialogRoles.this.setVisible(false);
				}
			});
		}
		return cancel;
	}

	/**
	 * This method initializes OK	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOK() {
		if (OK == null) {
			OK = new JButton();
			OK.setPreferredSize(new Dimension(80, 20));
			OK.setHorizontalAlignment(SwingConstants.CENTER);
			OK.setText("OK");
			OK.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					choice = DialogRoles.CHOIX_OK ;
					DialogRoles.this.setVisible(false);
				}
			});
		}
		return OK;
	}

	public int getChoix(){
		return (choice);
		
	}
	
	public MyModelElement getModelElement(){
		return ((MyModelElement)listeRole.getSelectedItem());
	}
	
	public String getRealRole(){
		return ((MyModelElement)listeRole.getSelectedItem()).getRealName();
	}
	
	public String getRole(){
		return ((MyModelElement)listeRole.getSelectedItem()).toString();
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
			jScrollPane.setViewportView(getRoleDesc());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes roleDesc	
	 * 	
	 * @return javax.swing.JEditorPane	
	 */
	private JEditorPane getRoleDesc() {
		if (roleDesc == null) {
			roleDesc = new JEditorPane();
			roleDesc.setEditable(false);
			roleDesc.setContentType("text/html");
			roleDesc.setBackground(SystemColor.control);
		}
		return roleDesc;
	}
	
	public void setDescription(String message){
		roleDesc.setText(message);
		roleDesc.setCaretPosition(1); // revient au debut du texte
	}

	/**
	 * This method initializes north	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getNorth() {
		if (north == null) {
			BorderLayout borderLayout1 = new BorderLayout();
			borderLayout1.setVgap(1);
			north = new JPanel();
			north.setLayout(borderLayout1);
			north.add(selectRole, BorderLayout.NORTH);
			north.add(getListeRole(), BorderLayout.SOUTH);
		}
		return north;
	}

	/**
	 * This method initializes center	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getCenter() {
		if (center == null) {
			BorderLayout borderLayout = new BorderLayout();
			center = new JPanel();
			center.setLayout(borderLayout);
			center.add(getJScrollPane(), BorderLayout.CENTER);
		}
		return center;
	}

	/**
	 * This method initializes south	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getSouth() {
		if (south == null) {
			south = new JPanel();
			south.setLayout(new BorderLayout());
			south.add(getJPanel(), BorderLayout.NORTH);
		}
		return south;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
