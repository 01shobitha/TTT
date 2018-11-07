package game;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class TicTacToeView extends JFrame {
	TTT t=new TTT();
	private JPanel contentPane;
	private Toolkit toolkit;
	public int[] VALUE=new int[3];


	/**
	 * Create the frame.
	 */
	public TicTacToeView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton one = new JButton("1");
		one.setBackground(Color.DARK_GRAY);
	//	one.setForeground(Color.RED);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t.WhichPlayer()==1)
					one.setBackground(Color.RED);
				else
					one.setBackground(Color.YELLOW);
				VALUE[0]=0;
				VALUE[1]=0;
				t.setVal(VALUE[1],VALUE[2]);
				t.Check();			
				
				}
		});
		contentPane.add(one);
		
		JButton two = new JButton("2");
		two.setBackground(Color.DARK_GRAY);
		VALUE=new int[2];
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t.WhichPlayer()==1)
					two.setBackground(Color.RED);
				else
					two.setBackground(Color.YELLOW);
				VALUE[0]=0;
				VALUE[1]=1;
				t.setVal(VALUE[1],VALUE[2]);
				
			}
		});
		contentPane.add(two);
		
		JButton three = new JButton("3");
		three.setBackground(Color.DARK_GRAY);
		VALUE=new int[2];
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t.WhichPlayer()==1)
					three.setBackground(Color.RED);
				else
					three.setBackground(Color.YELLOW);
				VALUE[0]=0;
				VALUE[1]=2;
				t.setVal(VALUE[1],VALUE[2]);
				
			}
		});
		contentPane.add(three);
		
		JButton four = new JButton("4");
		four.setBackground(Color.DARK_GRAY);
		VALUE=new int[2];
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t.WhichPlayer()==1)
					four.setBackground(Color.RED);
				else
					four.setBackground(Color.YELLOW);
				VALUE[0]=1;
				VALUE[1]=0;
				t.setVal(VALUE[1],VALUE[2]);
				
			}
		});
		contentPane.add(four);
		
		JButton five = new JButton("5");
		contentPane.add(five);
		five.setBackground(Color.DARK_GRAY);
		VALUE=new int[2];
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t.WhichPlayer()==1)
					five.setBackground(Color.RED);
				else
					five.setBackground(Color.YELLOW);
				VALUE[0]=1;
				VALUE[1]=1;
				t.setVal(VALUE[1],VALUE[2]);
				
			}
		});
		
		JButton six = new JButton("6");
		six.setBackground(Color.DARK_GRAY);
		VALUE=new int[2];
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t.WhichPlayer()==1)
					six.setBackground(Color.RED);
				else
					six.setBackground(Color.YELLOW);
				VALUE[0]=1;
				VALUE[1]=2;
				t.setVal(VALUE[1],VALUE[2]);
				
			}
		});
		contentPane.add(six);
		
		JButton seven = new JButton("7");
		seven.setBackground(Color.DARK_GRAY);
		VALUE=new int[2];
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t.WhichPlayer()==1)
					seven.setBackground(Color.RED);
				else
					seven.setBackground(Color.YELLOW);
				VALUE[0]=2;
				VALUE[1]=0;
				t.setVal(VALUE[1],VALUE[2]);
				
			}
		});
		contentPane.add(seven);
		
		JButton eight = new JButton("8");
		eight.setBackground(Color.DARK_GRAY);
		VALUE=new int[2];
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t.WhichPlayer()==1)
					eight.setBackground(Color.RED);
				else
					eight.setBackground(Color.YELLOW);
				VALUE[0]=2;
				VALUE[1]=1;
				t.setVal(VALUE[1],VALUE[2]);
				
			}
		});
		contentPane.add(eight);
		
		JButton nine = new JButton("9");
		nine.setBackground(Color.DARK_GRAY);
		VALUE=new int[2];
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t.WhichPlayer()==1)
					nine.setBackground(Color.RED);
				else if(t.WhichPlayer()==2)
					nine.setBackground(Color.YELLOW);
				VALUE[0]=2;
				VALUE[1]=2;
				t.setVal(VALUE[1],VALUE[2]);
				
			}
		});
		contentPane.add(nine);
	}

}
