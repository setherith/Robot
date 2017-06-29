package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JButton;

public class Interface {

	private JFrame frmRobotV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmRobotV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frmRobotV = new JFrame();
		frmRobotV.setTitle("Robot v1.0");
		frmRobotV.setResizable(false);
		frmRobotV.setBounds(100, 100, 450, 213);
		frmRobotV.setLocationRelativeTo(null);
		frmRobotV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmRobotV.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLoad = new JMenuItem("Load...");
		mnFile.add(mntmLoad);
		
		JMenuItem mntmSave = new JMenuItem("Save...");
		mnFile.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAbout = new JMenuItem("About...");
		mnAbout.add(mntmAbout);
		frmRobotV.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(6, 6, 438, 118);
		frmRobotV.getContentPane().add(list);
		
		JButton btnRecord = new JButton("Record");
		btnRecord.setBounds(6, 136, 117, 29);
		frmRobotV.getContentPane().add(btnRecord);
		
		JButton btnReplay = new JButton("Replay");
		btnReplay.setBounds(327, 136, 117, 29);
		frmRobotV.getContentPane().add(btnReplay);
	}
}
