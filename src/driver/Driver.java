package driver;
import java.awt.EventQueue;

import game.TTT;
import game.TicTacToeView;
import hello.WelcomeView;

public class Driver {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeView frame = new WelcomeView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		TTT t=new TTT();
		
		t.setVal(0,0);
		t.setVal(1,1);
		t.setVal(0,1);
		t.setVal(1,2);
		t.setVal(2,1);
		t.Check();
	}
	
}
