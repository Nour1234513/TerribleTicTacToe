

public class GameEngine {
	Controller controller;
	int NumberOfSquaresToWin=3;
    boolean gameover = false;

   public GameEngine(Controller _controller ){
	this.controller = _controller;
   }

    
 
/////////////////////////////////
	public  boolean checkV(){
		int check=0;
		for(int x=0;x<this.controller.board.rad; x++){
			for(int i = 0; i < this.controller.board.rad; i++){
            	if(this.controller.board.gameboard[i][x] !=this.controller.player.tecken[this.controller.currentPlayer]){
					check=0;
				}
				else {check+=1;}
            	if(check == (NumberOfSquaresToWin<=this.controller.board.rad?NumberOfSquaresToWin:this.controller.board.rad)){
                	return true;//report win for s
            	}
        	}
		}
		return false;
	}

////////////////////////
	public  boolean checkH(){
		int check=0;
		for(int x=0;x<this.controller.board.rad; x++){
			for(int i = 0; i < this.controller.board.rad; i++){
            	if(this.controller.board.gameboard[x][i] !=this.controller.player.tecken[this.controller.currentPlayer])
                	check=0;
				else {check+=1;}
            	if(check == (NumberOfSquaresToWin<=this.controller.board.rad?NumberOfSquaresToWin:this.controller.board.rad)){
                	return true;//report win for s
            	}
        	}
		}
		return false;
	} 

//////////////////////////

	public boolean checkD(){
		int check=0;
		for(int i = 0; i < this.controller.board.rad; i++){
			if(this.controller.board.gameboard[i][i] != this.controller.player.tecken[this.controller.currentPlayer])
				check=0;
			else{check+=1;}
			if(check == (NumberOfSquaresToWin<=this.controller.board.rad?NumberOfSquaresToWin:this.controller.board.rad)){
				return true;
			}
		}
		
		return false;
	}
	
////////////////////////////////
	public boolean checkRD(){
		int check=0;
		for(int i = 0; i < this.controller.board.rad; i++){
			if(this.controller.board.gameboard[(this.controller.board.rad-1)-i][i] != this.controller.player.tecken[this.controller.currentPlayer])
				check=0;
			else{check+=1;}
			if(check == (NumberOfSquaresToWin<=this.controller.board.rad?NumberOfSquaresToWin:this.controller.board.rad)){
				return true;//report win for s
			}
		}		
		return false;
	}
////////////////////////////////
}
