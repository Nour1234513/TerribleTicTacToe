

public class GameEngine {
	Controller controller;
	
	static public int player = 0;
	
     boolean gameover = false;
    

   public GameEngine(Controller controller ){
	this.controller = controller;
   }

    public  boolean checkifP2win() {
		boolean win = false;
		
		if(this.controller.board.gameboard[0][0] == 'X' 
		&& this.controller.board.gameboard[0][1] == 'X' 
		&& this.controller.board.gameboard[0][2] == 'X')
			win = true;
		if(this.controller.board.gameboard[1][0] == 'X' 
		&& this.controller.board.gameboard[1][1] == 'X' 
		&& this.controller.board.gameboard[1][2] == 'X')
			win = true;
		if(this.controller.board.gameboard[2][0] == 'X'
		 && this.controller.board.gameboard[2][1] == 'X'
		  && this.controller.board.gameboard[2][2] == 'X')
			win = true;

		if(this.controller.board.gameboard[0][0] == 'X'
		&& this.controller.board.gameboard[1][0] == 'X'
		&& this.controller.board.gameboard[2][0] == 'X')
			win = true;
		if(this.controller.board.gameboard[0][1] == 'X' 
		&& this.controller.board.gameboard[1][1] == 'X' 
		&& this.controller.board.gameboard[2][1] == 'X')
			win = true;
		if(this.controller.board.gameboard[0][2] == 'X' 
		&& this.controller.board.gameboard[1][2] == 'X' 
		&& this.controller.board.gameboard[2][2] == 'X')
			win = true;

		if(this.controller.board.gameboard[0][0] == 'X' 
		&& this.controller.board.gameboard[1][1] == 'X' 
		&& this.controller.board.gameboard[2][2] == 'X')
			win = true;
		if(this.controller.board.gameboard[0][2] == 'X' 
		&& this.controller.board.gameboard[1][1] == 'X' 
		&& this.controller.board.gameboard[2][0] == 'X')
			win = true;
		
		return win;	
	}

    public  boolean checkifP1win() {
		boolean win = false;
		
		
		if(this.controller.board.gameboard[0][0] == 'O' 
		&& this.controller.board.gameboard[0][1] == 'O' 
		&& this.controller.board.gameboard[0][2] == 'O')
			win = true;
		if(this.controller.board.gameboard[1][0] == 'O' 
		&& this.controller.board.gameboard[1][1] == 'O' 
		&& this.controller.board.gameboard[1][2] == 'O')
			win = true;
		if(this.controller.board.gameboard[2][0] == 'O' 
		&& this.controller.board.gameboard[2][1] == 'O' 
		&& this.controller.board.gameboard[2][2] == 'O')
			win = true;

		if(this.controller.board.gameboard[0][0] == 'O' 
		&& this.controller.board.gameboard[1][0] == 'O' 
		&& this.controller.board.gameboard[2][0] == 'O')
			win = true;
		if(this.controller.board.gameboard[0][1] == 'O' 
		&& this.controller.board.gameboard[1][1] == 'O' 
		&& this.controller.board.gameboard[2][1] == 'O')
			win = true;
		if(this.controller.board.gameboard[0][2] == 'O' 
		&& this.controller.board.gameboard[1][2] == 'O' 
		&& this.controller.board.gameboard[2][2] == 'O')
			win = true;

		if(this.controller.board.gameboard[0][0] == 'O' 
		&& this.controller.board.gameboard[1][1] == 'O' 
		&& this.controller.board.gameboard[2][2] == 'O')
			win = true;
		if(this.controller.board.gameboard[0][2] == 'O' 
		&& this.controller.board.gameboard[1][1] == 'O' 
		&& this.controller.board.gameboard[2][0] == 'O')
			win = true;
		
		return win;
	}
    
     
}
