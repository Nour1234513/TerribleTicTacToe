

public class GameEngine {
	Controller controller;
	int NumberOfSquaresToWin=3;
    boolean gameover = false;

   public GameEngine(Controller _controller ){
	this.controller = _controller;
   }

    
 
/////////////////////////////////
	public  boolean checkV(){

		for(int x=0;x<this.controller.board.rad; x++){
			for(int i = 0; i < this.controller.board.rad; i++){
            	if(this.controller.board.gameboard[i][x] !=this.controller.player.tecken[this.controller.currentPlayer])
                	break;
            	if(i == (NumberOfSquaresToWin<=this.controller.board.rad?NumberOfSquaresToWin:this.controller.board.rad)-1){
                	return true;//report win for s
            	}
        	}
		}
		return false;
	}

////////////////////////
	public  boolean checkH(){
		
		for(int x=0;x<this.controller.board.rad; x++){
			for(int i = 0; i < this.controller.board.rad; i++){
            	if(this.controller.board.gameboard[x][i] !=this.controller.player.tecken[this.controller.currentPlayer])
                	break;
            	if(i == (NumberOfSquaresToWin<=this.controller.board.rad?NumberOfSquaresToWin:this.controller.board.rad)-1){
                	return true;//report win for s
            	}
        	}
		}
		return false;
	} 

//////////////////////////

	public boolean checkD(){

		for(int i = 0; i < this.controller.board.rad; i++){
			if(this.controller.board.gameboard[i][i] != this.controller.player.tecken[this.controller.currentPlayer])
				break;
			if(i == (NumberOfSquaresToWin<=this.controller.board.rad?NumberOfSquaresToWin:this.controller.board.rad)-1){
				return true;
			}
		}
		
		return false;
	}
	
////////////////////////////////
	public boolean checkRD(){
		for(int i = 0; i < this.controller.board.rad; i++){
			if(this.controller.board.gameboard[i][(this.controller.board.rad-1)-i] != this.controller.player.tecken[this.controller.currentPlayer])
				break;
			if(i == (NumberOfSquaresToWin<=this.controller.board.rad?NumberOfSquaresToWin:this.controller.board.rad)-1){
				return true;//report win for s
			}
		}		
		return false;
	}
////////////////////////////////
}
