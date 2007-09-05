/*
 * DownloadJobSimpleRulesPanel.java
 *
 * Created on __DATE__, __TIME__
 */

package de.phleisch.app.itsucks.gui2.panel;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  __USER__
 */
public class DownloadJobSimpleRulesPanel extends javax.swing.JPanel {

	protected DefaultTableModel hostnameFilterTableModel;
	protected DefaultTableModel saveToDiskFilterTabelModel;
	
	/** Creates new form DownloadJobSimpleRulesPanel */
	public DownloadJobSimpleRulesPanel() {
		
		hostnameFilterTableModel = new DefaultTableModel();
		hostnameFilterTableModel.addColumn("Hostname Filter");
		saveToDiskFilterTabelModel = new DefaultTableModel();
		saveToDiskFilterTabelModel.addColumn("'Save to disk' Filter");
		
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc=" Generated Code ">
	private void initComponents() {
		limitsPanel = new javax.swing.JPanel();
		recursionDepthLabel = new javax.swing.JLabel();
		recursionDepthTextField = new javax.swing.JTextField();
		linksToFollowLabel = new javax.swing.JLabel();
		linksToFollowTextField = new javax.swing.JTextField();
		urlPrefixFilterPanel = new javax.swing.JPanel();
		urlPrefixFilterLabel = new javax.swing.JLabel();
		urlPrefixCheckBox = new javax.swing.JCheckBox();
		urlPrefixFieldLabel = new javax.swing.JLabel();
		urlPrefixTextField = new javax.swing.JTextField();
		hostnameFilterPanel = new javax.swing.JPanel();
		hostnameFilterLabel = new javax.swing.JLabel();
		hostnameFilterScrollPane = new javax.swing.JScrollPane();
		hostnameFilterTable = new javax.swing.JTable();
		hostnameFilterAddButton = new javax.swing.JButton();
		hostnameFilterRemoveButton = new javax.swing.JButton();
		saveToDiskFilterPanel = new javax.swing.JPanel();
		saveToDiskFilterLabel = new javax.swing.JLabel();
		saveToDiskPane = new javax.swing.JScrollPane();
		saveToDiskTable = new javax.swing.JTable();
		saveToDiskAddButton = new javax.swing.JButton();
		saveToDiskRemoveButton = new javax.swing.JButton();

		limitsPanel.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Limits"));
		recursionDepthLabel.setFont(new java.awt.Font("Dialog", 0, 12));
		recursionDepthLabel
				.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		recursionDepthLabel.setText("Max. recursion depth:");
		recursionDepthLabel
				.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

		recursionDepthTextField
				.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

		linksToFollowLabel.setFont(new java.awt.Font("Dialog", 0, 12));
		linksToFollowLabel
				.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		linksToFollowLabel.setText("Max. links to follow:");
		linksToFollowLabel
				.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

		linksToFollowTextField
				.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

		org.jdesktop.layout.GroupLayout limitsPanelLayout = new org.jdesktop.layout.GroupLayout(
				limitsPanel);
		limitsPanel.setLayout(limitsPanelLayout);
		limitsPanelLayout
				.setHorizontalGroup(limitsPanelLayout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								limitsPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.add(
												limitsPanelLayout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																recursionDepthLabel)
														.add(linksToFollowLabel))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												limitsPanelLayout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING,
																false)
														.add(
																recursionDepthTextField)
														.add(
																linksToFollowTextField,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																74,
																Short.MAX_VALUE))
										.addContainerGap(319, Short.MAX_VALUE)));

		limitsPanelLayout.linkSize(new java.awt.Component[] {
				linksToFollowLabel, recursionDepthLabel },
				org.jdesktop.layout.GroupLayout.HORIZONTAL);

		limitsPanelLayout
				.setVerticalGroup(limitsPanelLayout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								limitsPanelLayout
										.createSequentialGroup()
										.add(
												limitsPanelLayout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(
																recursionDepthLabel)
														.add(
																recursionDepthTextField,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												limitsPanelLayout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(linksToFollowLabel)
														.add(
																linksToFollowTextField,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		urlPrefixFilterPanel.setBorder(javax.swing.BorderFactory
				.createTitledBorder("URL prefix Filter"));
		urlPrefixFilterLabel.setFont(new java.awt.Font("Dialog", 0, 12));
		urlPrefixFilterLabel
				.setText("<html>Set a URL prefix filter to follow only links starting with the defined prefix.<br>Example: Enter \"http://www.example.com/section1/\" to allow only links from this folder.</html>");

		urlPrefixCheckBox.setFont(new java.awt.Font("Dialog", 0, 12));
		urlPrefixCheckBox.setText("Enable 'URL prefix Filter'");
		urlPrefixCheckBox.setBorder(javax.swing.BorderFactory
				.createEmptyBorder(0, 0, 0, 0));
		urlPrefixCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
		urlPrefixCheckBox
				.addChangeListener(new javax.swing.event.ChangeListener() {
					public void stateChanged(javax.swing.event.ChangeEvent evt) {
						urlPrefixCheckBoxStateChanged(evt);
					}
				});

		urlPrefixFieldLabel.setFont(new java.awt.Font("Dialog", 0, 12));
		urlPrefixFieldLabel.setText("URL prefix:");
		urlPrefixFieldLabel.setEnabled(false);

		urlPrefixTextField.setText("http://");
		urlPrefixTextField.setEnabled(false);

		org.jdesktop.layout.GroupLayout urlPrefixFilterPanelLayout = new org.jdesktop.layout.GroupLayout(
				urlPrefixFilterPanel);
		urlPrefixFilterPanel.setLayout(urlPrefixFilterPanelLayout);
		urlPrefixFilterPanelLayout
				.setHorizontalGroup(urlPrefixFilterPanelLayout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								urlPrefixFilterPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.add(
												urlPrefixFilterPanelLayout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																urlPrefixFilterLabel,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																520,
																Short.MAX_VALUE)
														.add(
																urlPrefixFilterPanelLayout
																		.createSequentialGroup()
																		.add(
																				urlPrefixFieldLabel)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				urlPrefixTextField,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				279,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
														.add(urlPrefixCheckBox))
										.addContainerGap()));
		urlPrefixFilterPanelLayout
				.setVerticalGroup(urlPrefixFilterPanelLayout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								urlPrefixFilterPanelLayout
										.createSequentialGroup()
										.add(urlPrefixFilterLabel)
										.add(14, 14, 14)
										.add(urlPrefixCheckBox)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												urlPrefixFilterPanelLayout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(
																urlPrefixTextField,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(
																urlPrefixFieldLabel))
										.addContainerGap(
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		hostnameFilterPanel.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Hostname Filter"));
		hostnameFilterLabel.setFont(new java.awt.Font("Dialog", 0, 12));
		hostnameFilterLabel
				.setText("<html>Enter an regular expression which fully matches the hostname. Default is to allow all hostnames. Double click an item to edit.<br>Example: Enter \".*example\\.com\" to match all subdomains from examples.com.</html>");

		hostnameFilterTable.setModel(hostnameFilterTableModel);
		hostnameFilterScrollPane.setViewportView(hostnameFilterTable);

		hostnameFilterAddButton.setText("+");
		hostnameFilterAddButton.setMargin(new java.awt.Insets(2, 4, 2, 4));

		hostnameFilterRemoveButton.setText("-");
		hostnameFilterRemoveButton.setMargin(new java.awt.Insets(2, 4, 2, 4));

		org.jdesktop.layout.GroupLayout hostnameFilterPanelLayout = new org.jdesktop.layout.GroupLayout(
				hostnameFilterPanel);
		hostnameFilterPanel.setLayout(hostnameFilterPanelLayout);
		hostnameFilterPanelLayout
				.setHorizontalGroup(hostnameFilterPanelLayout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								hostnameFilterPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.add(
												hostnameFilterPanelLayout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																org.jdesktop.layout.GroupLayout.TRAILING,
																hostnameFilterPanelLayout
																		.createSequentialGroup()
																		.add(
																				hostnameFilterScrollPane,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				490,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				hostnameFilterPanelLayout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								hostnameFilterRemoveButton)
																						.add(
																								hostnameFilterAddButton,
																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)))
														.add(
																hostnameFilterLabel,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																520,
																Short.MAX_VALUE))
										.addContainerGap()));

		hostnameFilterPanelLayout.linkSize(new java.awt.Component[] {
				hostnameFilterAddButton, hostnameFilterRemoveButton },
				org.jdesktop.layout.GroupLayout.HORIZONTAL);

		hostnameFilterPanelLayout
				.setVerticalGroup(hostnameFilterPanelLayout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								hostnameFilterPanelLayout
										.createSequentialGroup()
										.add(hostnameFilterLabel)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												hostnameFilterPanelLayout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																hostnameFilterPanelLayout
																		.createSequentialGroup()
																		.add(
																				hostnameFilterAddButton)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				hostnameFilterRemoveButton))
														.add(
																hostnameFilterScrollPane,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																56,
																Short.MAX_VALUE))
										.addContainerGap()));

		hostnameFilterPanelLayout.linkSize(new java.awt.Component[] {
				hostnameFilterAddButton, hostnameFilterRemoveButton },
				org.jdesktop.layout.GroupLayout.VERTICAL);

		saveToDiskFilterPanel.setBorder(javax.swing.BorderFactory
				.createTitledBorder("'Save to Disk' Filter"));
		saveToDiskFilterLabel.setFont(new java.awt.Font("Dialog", 0, 12));
		saveToDiskFilterLabel
				.setText("<html>Enter an regular expression which fully matches the files you want to save on your disk. Default is to save all files. Double click an item to edit.<br>Example: Enter \".*jpg\" to save all jpeg's.</html>");

		saveToDiskTable.setModel(saveToDiskFilterTabelModel);
		saveToDiskPane.setViewportView(saveToDiskTable);

		saveToDiskAddButton.setText("+");
		saveToDiskAddButton.setMargin(new java.awt.Insets(2, 4, 2, 4));

		saveToDiskRemoveButton.setText("-");
		saveToDiskRemoveButton.setMargin(new java.awt.Insets(2, 4, 2, 4));
		saveToDiskRemoveButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						saveToDiskRemoveButtonActionPerformed(evt);
					}
				});

		org.jdesktop.layout.GroupLayout saveToDiskFilterPanelLayout = new org.jdesktop.layout.GroupLayout(
				saveToDiskFilterPanel);
		saveToDiskFilterPanel.setLayout(saveToDiskFilterPanelLayout);
		saveToDiskFilterPanelLayout
				.setHorizontalGroup(saveToDiskFilterPanelLayout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								saveToDiskFilterPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.add(
												saveToDiskFilterPanelLayout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																org.jdesktop.layout.GroupLayout.TRAILING,
																saveToDiskFilterPanelLayout
																		.createSequentialGroup()
																		.add(
																				saveToDiskPane,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				490,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				saveToDiskFilterPanelLayout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								saveToDiskRemoveButton)
																						.add(
																								saveToDiskAddButton)))
														.add(
																saveToDiskFilterLabel,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																520,
																Short.MAX_VALUE))
										.addContainerGap()));

		saveToDiskFilterPanelLayout.linkSize(new java.awt.Component[] {
				saveToDiskAddButton, saveToDiskRemoveButton },
				org.jdesktop.layout.GroupLayout.HORIZONTAL);

		saveToDiskFilterPanelLayout
				.setVerticalGroup(saveToDiskFilterPanelLayout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								saveToDiskFilterPanelLayout
										.createSequentialGroup()
										.add(saveToDiskFilterLabel)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												saveToDiskFilterPanelLayout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																saveToDiskFilterPanelLayout
																		.createSequentialGroup()
																		.add(
																				saveToDiskAddButton)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				saveToDiskRemoveButton))
														.add(
																saveToDiskPane,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																56,
																Short.MAX_VALUE))
										.addContainerGap()));

		saveToDiskFilterPanelLayout.linkSize(new java.awt.Component[] {
				saveToDiskAddButton, saveToDiskRemoveButton },
				org.jdesktop.layout.GroupLayout.VERTICAL);

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(
				org.jdesktop.layout.GroupLayout.TRAILING,
				layout.createSequentialGroup().addContainerGap().add(
						layout.createParallelGroup(
								org.jdesktop.layout.GroupLayout.TRAILING).add(
								org.jdesktop.layout.GroupLayout.LEADING,
								limitsPanel,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).add(
								org.jdesktop.layout.GroupLayout.LEADING,
								urlPrefixFilterPanel,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).add(
								org.jdesktop.layout.GroupLayout.LEADING,
								hostnameFilterPanel,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).add(
								org.jdesktop.layout.GroupLayout.LEADING,
								saveToDiskFilterPanel,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(
				layout.createSequentialGroup().addContainerGap().add(
						limitsPanel,
						org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
						org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
						org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(
								org.jdesktop.layout.LayoutStyle.RELATED).add(
								urlPrefixFilterPanel,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(
								org.jdesktop.layout.LayoutStyle.RELATED).add(
								hostnameFilterPanel,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addPreferredGap(
								org.jdesktop.layout.LayoutStyle.RELATED).add(
								saveToDiskFilterPanel,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));
	}// </editor-fold>//GEN-END:initComponents

	//GEN-FIRST:event_urlPrefixCheckBoxStateChanged
	private void urlPrefixCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {
		boolean enabled = urlPrefixCheckBox.isSelected();

		urlPrefixFieldLabel.setEnabled(enabled);
		urlPrefixTextField.setEnabled(enabled);

	}//GEN-LAST:event_urlPrefixCheckBoxStateChanged

	//GEN-FIRST:event_saveToDiskRemoveButtonActionPerformed
	private void saveToDiskRemoveButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}//GEN-LAST:event_saveToDiskRemoveButtonActionPerformed

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	protected javax.swing.JButton hostnameFilterAddButton;
	protected javax.swing.JLabel hostnameFilterLabel;
	protected javax.swing.JPanel hostnameFilterPanel;
	protected javax.swing.JButton hostnameFilterRemoveButton;
	protected javax.swing.JScrollPane hostnameFilterScrollPane;
	protected javax.swing.JTable hostnameFilterTable;
	protected javax.swing.JPanel limitsPanel;
	protected javax.swing.JLabel linksToFollowLabel;
	protected javax.swing.JTextField linksToFollowTextField;
	protected javax.swing.JLabel recursionDepthLabel;
	protected javax.swing.JTextField recursionDepthTextField;
	protected javax.swing.JButton saveToDiskAddButton;
	protected javax.swing.JLabel saveToDiskFilterLabel;
	protected javax.swing.JPanel saveToDiskFilterPanel;
	protected javax.swing.JScrollPane saveToDiskPane;
	protected javax.swing.JButton saveToDiskRemoveButton;
	protected javax.swing.JTable saveToDiskTable;
	protected javax.swing.JCheckBox urlPrefixCheckBox;
	protected javax.swing.JLabel urlPrefixFieldLabel;
	protected javax.swing.JLabel urlPrefixFilterLabel;
	protected javax.swing.JPanel urlPrefixFilterPanel;
	protected javax.swing.JTextField urlPrefixTextField;
	// End of variables declaration//GEN-END:variables

}