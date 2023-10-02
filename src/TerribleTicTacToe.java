
import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

public class TerribleTicTacToe {

	static public int player = 0;
	static public char[][] board = new char[3][3];

	static boolean gameover = false;
	
	public static boolean checkifP1win() {
		boolean win = false;
		
		
		if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
			win = true;
		if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
			win = true;
		if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
			win = true;

		if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
			win = true;
		if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
			win = true;
		if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
			win = true;

		if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
			win = true;
		if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
			win = true;
		
		return win;
	}

	public static boolean checkifP2win() {
		boolean win = false;
		
		if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
			win = true;
		if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
			win = true;
		if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
			win = true;

		if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
			win = true;
		if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
			win = true;
		if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
			win = true;

		if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
			win = true;
		if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
			win = true;
		
		return win;	
	}
	
	public static void main(String[] args) {
		
		for(int x = 0; x < 3; x++)
			for(int y = 0; y < 3; y++) {
				board[x][y] = ' ';
			}
		
        JFrame frame = new JFrame("TerribleTicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel myButtonPanel = new JPanel();
        
        myButtonPanel.setLayout(new GridLayout(3,3));
        
        JButton button1 = new JButton(" ");
        button1.setPreferredSize(new Dimension(50,50));
        myButtonPanel.add(button1);
        JButton button2 = new JButton(" ");
        myButtonPanel.add(button2);
        JButton button3 = new JButton(" ");
        myButtonPanel.add(button3);
        JButton button4 = new JButton(" ");
        myButtonPanel.add(button4);
        JButton button5 = new JButton(" ");
        myButtonPanel.add(button5);
        JButton button6 = new JButton(" ");
        myButtonPanel.add(button6);
        JButton button7 = new JButton(" ");
        myButtonPanel.add(button7);
        JButton button8 = new JButton(" ");
        myButtonPanel.add(button8);
        JButton button9 = new JButton(" ");
        myButtonPanel.add(button9);

        JPanel myTextPanel = new JPanel();
        myTextPanel.setLayout(new GridLayout(1,1));
        myTextPanel.setPreferredSize(new Dimension(150,50));
        JLabel myLabel = new JLabel("player 1's turn", SwingConstants.CENTER);
        myTextPanel.add(myLabel);
        
        JPanel myMainPanel = new JPanel();
        myMainPanel.setLayout(new BoxLayout(myMainPanel, BoxLayout.Y_AXIS));
        myMainPanel.add(myButtonPanel);
        myMainPanel.add(myTextPanel);
       
        frame.getContentPane().add(myMainPanel);
        
        
        button1.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		if(button1.getText() != " " || gameover) return;
        		if(player == 0) {
               		button1.setText("O");
               		board[0][0] = 'O';
               		if(checkifP1win()) {
               			myLabel.setText("player 1 won!");
               			gameover = true;
               			return;
               		}
        		 	player = 1;
            		myLabel.setText("player 2's turn");
        		}
        		else {
               		button1.setText("X");
               		board[0][0] = 'X';
               		if(checkifP2win()) {
               			myLabel.setText("player 2 won!");
               			gameover = true;
               			return;
               		}
        			player = 0;
            		myLabel.setText("player 1's turn");
        		}

        	}
        });
        button2.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		if(button2.getText() != " " || gameover) return;
        		if(player == 0) {
               		button2.setText("O");
               		board[0][1] = 'O';
               		if(checkifP1win()) {
               			myLabel.setText("player 1 won!");
               			gameover = true;
               			return;
               		}
        		 	player = 1;
            		myLabel.setText("player 2's turn");
        		}
        		else {
               		button2.setText("X");
               		board[0][1] = 'X';
               		if(checkifP2win()) {
               			myLabel.setText("player 2 won!");
               			gameover = true;
               			return;
               		}
        			player = 0;
            		myLabel.setText("player 1's turn");
        		}

        	}
        });
        button3.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		if(button3.getText() != " " || gameover) return;
        		if(player == 0) {
               		button3.setText("O");
               		board[0][2] = 'O';
               		if(checkifP1win()) {
               			myLabel.setText("player 1 won!");
               			gameover = true;
               			return;
               		}
        		 	player = 1;
            		myLabel.setText("player 2's turn");
        		}
        		else {
               		button3.setText("X");
               		board[0][2] = 'X';
               		if(checkifP2win()) {
               			myLabel.setText("player 2 won!");
               			gameover = true;
               			return;
               		}
        			player = 0;
            		myLabel.setText("player 1's turn");
        		}

        	}
        });

        
        button4.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		if(button4.getText() != " " || gameover) return;
        		if(player == 0) {
               		button4.setText("O");
               		board[1][0] = 'O';
               		if(checkifP1win()) {
               			myLabel.setText("player 1 won!");
               			gameover = true;
               			return;
               		}
        		 	player = 1;
            		myLabel.setText("player 2's turn");
        		}
        		else {
               		button4.setText("X");
               		board[1][0] = 'X';
               		if(checkifP2win()) {
               			myLabel.setText("player 2 won!");
               			gameover = true;
               			return;
               		}
        			player = 0;
            		myLabel.setText("player 1's turn");
        		}

        	}
        });
        button5.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		if(button5.getText() != " " || gameover) return;
        		if(player == 0) {
               		button5.setText("O");
               		board[1][1] = 'O';
               		if(checkifP1win()) {
               			myLabel.setText("player 1 won!");
               			gameover = true;
               			return;
               		}
        		 	player = 1;
            		myLabel.setText("player 2's turn");
        		}
        		else {
               		button5.setText("X");
               		board[1][1] = 'X';
               		if(checkifP2win()) {
               			myLabel.setText("player 2 won!");
               			gameover = true;
               			return;
               		}
        			player = 0;
            		myLabel.setText("player 1's turn");
        		}
        	}
        });
        button6.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		if(button6.getText() != " " || gameover) return;
        		if(player == 0) {
               		button6.setText("O");
               		board[1][2] = 'O';
               		if(checkifP1win()) {
               			myLabel.setText("player 1 won!");
               			gameover = true;
               			return;
               		}
        		 	player = 1;
            		myLabel.setText("player 2's turn");
        		}
        		else {
               		button6.setText("X");
               		board[1][2] = 'X';
               		if(checkifP2win()) {
               			myLabel.setText("player 2 won!");
               			gameover = true;
               			return;
               		}
        			player = 0;
            		myLabel.setText("player 1's turn");
        		}

        	}
        });

        
        button7.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		if(button7.getText() != " " || gameover) return;
        		if(player == 0) {
               		button7.setText("O");
               		board[2][0] = 'O';
               		if(checkifP1win()) {
               			myLabel.setText("player 1 won!");
               			gameover = true;
               			return;
               		}
        		 	player = 1;
            		myLabel.setText("player 2's turn");
        		}
        		else {
               		button7.setText("X");
               		board[2][0] = 'X';
               		if(checkifP2win()) {
               			myLabel.setText("player 2 won!");
               			gameover = true;
               			return;
               		}
        			player = 0;
            		myLabel.setText("player 1's turn");
        		}

        	}
        });
        button8.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		if(button8.getText() != " " || gameover) return;
        		if(player == 0) {
               		button8.setText("O");
               		board[2][1] = 'O';
               		if(checkifP1win()) {
               			myLabel.setText("player 1 won!");
               			gameover = true;
               			return;
               		}
        		 	player = 1;
            		myLabel.setText("player 2's turn");
        		}
        		else {
               		button8.setText("X");
               		board[2][1] = 'X';
               		if(checkifP2win()) {
               			myLabel.setText("player 2 won!");
               			gameover = true;
               			return;
               		}
        			player = 0;
            		myLabel.setText("player 1's turn");
        		}
        	}
        });
        button9.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		if(button9.getText() != " " || gameover) return;
        		if(player == 0) {
               		button9.setText("O");
               		board[2][2] = 'O';
               		if(checkifP1win()) {
               			myLabel.setText("player 1 won!");
               			gameover = true;
               			return;
               		}
        		 	player = 1;
            		myLabel.setText("player 2's turn");
        		}
        		else {
               		button9.setText("X");
               		board[2][2] = 'X';
               		if(checkifP2win()) {
               			myLabel.setText("player 2 won!");
               			gameover = true;
               			return;
               		}
        			player = 0;
            		myLabel.setText("player 1's turn");
        		}

        	}
        });
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
	}

}
