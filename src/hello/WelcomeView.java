package hello;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import game.TicTacToeView;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeView extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private Toolkit toolkit;


	/**
	 * Create the frame.
	 */
	public WelcomeView() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel(" TicTacToe");
		
		btnNewButton = new JButton("PLAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TicTacToeView frame = new TicTacToeView();
				frame.setVisible(true);
				
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(148)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
					.addGap(137))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(156)
					.addComponent(btnNewButton)
					.addContainerGap(158, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(78)
					.addComponent(btnNewButton)
					.addContainerGap(143, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
