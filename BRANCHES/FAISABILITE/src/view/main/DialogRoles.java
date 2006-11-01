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

	/**
	 * @param owner
	 */
	public DialogRoles(Frame owner, Collection<String> listRoles) {
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
		this.setSize(330, 104);
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
		if (jContentPane == null) {			selectRole = new JLabel();
			selectRole.setText("Please select your Role");
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(selectRole, BorderLayout.NORTH);
			jContentPane.add(getListeRole(), BorderLayout.CENTER);
			jContentPane.add(getJPanel(), BorderLayout.SOUTH);
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
			jPanel.setLayout(null);
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
			cancel.setBounds(new Rectangle(149, 8, 80, 20));
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
			OK.setBounds(new Rectangle(239, 8, 80, 20));
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
	
	
	
	public String getRole(){
		return ((String)listeRole.getSelectedItem());
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
