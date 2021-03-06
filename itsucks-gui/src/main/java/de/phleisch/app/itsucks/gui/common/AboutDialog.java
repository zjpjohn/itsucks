/*
 * AboutDialog.java
 *
 * Created on __DATE__, __TIME__
 */

package de.phleisch.app.itsucks.gui.common;

/**
 *
 * @author  __USER__
 */
public class AboutDialog extends javax.swing.JDialog {

	private static final long serialVersionUID = -8645177838505144881L;

	/** Creates new form AboutDialog */
	public AboutDialog(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutPanel = new de.phleisch.app.itsucks.gui.common.panel.AboutPanel();
        buttonPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About ItSucks");
        setLocationByPlatform(true);
        setName("aboutDialog"); // NOI18N

        closeButton.setText("Woah!");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(closeButton);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(buttonPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
            .add(aboutPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(aboutPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	//GEN-FIRST:event_jButton1ActionPerformed
	private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.phleisch.app.itsucks.gui.common.panel.AboutPanel aboutPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton closeButton;
    // End of variables declaration//GEN-END:variables

}