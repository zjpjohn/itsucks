/*
 * DownloadJobStatusTablePanel.java
 *
 * Created on __DATE__, __TIME__
 */

package de.phleisch.app.itsucks.gui.job.panel;

import javax.swing.JPanel;
import javax.swing.table.TableColumnModel;

import de.phleisch.app.itsucks.gui.util.DownloadJobTableModel;
import de.phleisch.app.itsucks.job.download.impl.UrlDownloadJob;

/**
 *
 * @author  __USER__
 */
public class DownloadJobStatusTablePanel extends JPanel {

	private static final long serialVersionUID = 3808425383728480173L;

	private DownloadJobTableModel mDownloadStatusTableModel = null;

	/** Creates new form DownloadJobStatusTablePanel */
	public DownloadJobStatusTablePanel() {
		mDownloadStatusTableModel = new DownloadJobTableModel();
		
		init();
	}

	protected void init() {
		initComponents();
		initPreferredColumnWidth();		
	}
	
	private void initPreferredColumnWidth() {
		
		TableColumnModel columnModel = this.jDownloadJobStatusTable.getColumnModel();
		
		columnModel.getColumn(DownloadJobTableModel.COLUMN_ID).setPreferredWidth(5);
		columnModel.getColumn(DownloadJobTableModel.COLUMN_URL).setPreferredWidth(300);
		columnModel.getColumn(DownloadJobTableModel.COLUMN_STATE).setPreferredWidth(25);
		columnModel.getColumn(DownloadJobTableModel.COLUMN_PROGRESS).setPreferredWidth(20);
		columnModel.getColumn(DownloadJobTableModel.COLUMN_KILOBYTES).setPreferredWidth(30);
		columnModel.getColumn(DownloadJobTableModel.COLUMN_PRIORITY).setPreferredWidth(10);
		columnModel.getColumn(DownloadJobTableModel.COLUMN_DEPTH).setPreferredWidth(10);
		columnModel.getColumn(DownloadJobTableModel.COLUMN_RESULT).setPreferredWidth(40);
	}
	
	public void addDownloadJob(UrlDownloadJob job) {
		mDownloadStatusTableModel.addDownloadJob(job);
	}

	public void removeAllDownloadJobs() {
		mDownloadStatusTableModel.removeAllDownloadJobs();
	}

	public void removeDownloadJob(UrlDownloadJob job) {
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