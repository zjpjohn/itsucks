/*
 * DownloadJobStatusTablePanel.java
 *
 * Created on __DATE__, __TIME__
 */

package de.phleisch.app.itsucks.gui.panel;

import de.phleisch.app.itsucks.gui.util.DownloadJobTableModel;
import de.phleisch.app.itsucks.io.DownloadJob;

/**
 *
 * @author  __USER__
 */
public class DownloadJobStatusTablePanel extends javax.swing.JPanel {

	private static final long serialVersionUID = 3808425383728480173L;

	private DownloadJobTableModel mDownloadStatusTableModel = null;

	/** Creates new form DownloadJobStatusTablePanel */
	public DownloadJobStatusTablePanel() {
		mDownloadStatusTableModel = new DownloadJobTableModel();

		initComponents();
	}
	
	public void addDownloadJob(DownloadJob job) {
		mDownloadStatusTableModel.addDownloadJob(job);
	}

	public void removeAllDownloadJobs() {
		mDownloadStatusTableModel.removeAllDownloadJobs();
	}

	public void removeDownloadJob(DownloadJob job) {
		mDownloadStatusTableModel.removeDownloadJob(job);
	}
	
	public void shutdown() {
		removeAllDownloadJobs();
		mDownloadStatusTableModel.stop();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc=" Generated Code ">
	private void initComponents() {
		jDownloadJobStatusScrollPane = new javax.swing.JScrollPane();
		jDownloadJobStatusTable = new javax.swing.JTable();

		jDownloadJobStatusTable.setModel(mDownloadStatusTableModel);
		jDownloadJobStatusScrollPane.setViewportView(jDownloadJobStatusTable);

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(
				jDownloadJobStatusScrollPane,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(
				jDownloadJobStatusScrollPane,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 300,
				Short.MAX_VALUE));
	}// </editor-fold>//GEN-END:initComponents

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JScrollPane jDownloadJobStatusScrollPane;
	private javax.swing.JTable jDownloadJobStatusTable;
	// End of variables declaration//GEN-END:variables

}