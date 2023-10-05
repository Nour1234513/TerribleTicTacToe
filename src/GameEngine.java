

public class GameEngine {
	Controller controller;
	
	static public int player = 0;
	
     boolean gameover = false;
    

   public GameEngine(Controller controller ){
	this.controller = controller;
   }

    
    public  boolean checkforwin(){
		int fleraInRad=0;
		for(int x=0; x<this.controller.board.rad-1;x+=1){
			for(int y=0;y<this.controller.board.rad-1;y+=1){
				if((controller.board.gameboard[x][y]==controller.board.gameboard[x][y+1])
				&&((controller.board.gameboard[x][y]=='X')||(controller.board.gameboard[x][y]=='O'))){
					fleraInRad+=1;
				}
				else {
					fleraInRad=0;
				}
				
			}
		if(fleraInRad==this.controller.board.rad-1)
			return true;
		}
		
		return false;
	}
/////////////////////////////////
	public  boolean checkV(){

		for(int x=0;x<this.controller.board.rad; x++){
			for(int i = 0; i < this.controller.board.rad; i++){
            	if(this.controller.board.gameboard[i][x] !='X')
                	break;
            	if(i == this.controller.board.rad-1){
                	return true;//report win for s
            	}
        	}
		}
		for(int x=0;x<this.controller.board.rad; x++){
			for(int i = 0; i < this.controller.board.rad; i++){
            	if(this.controller.board.gameboard[i][x] !='O')
                	break;
            	if(i == this.controller.board.rad-1){
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
            	if(this.controller.board.gameboard[x][i] !='X')
                	break;
            	if(i == this.controller.board.rad-1){
                	return true;//report win for s
            	}
        	}
		}
		for(int x=0;x<this.controller.board.rad; x++){
			for(int i = 0; i < this.controller.board.rad; i++){
            	if(this.controller.board.gameboard[x][i] !='O')
                	break;
            	if(i == this.controller.board.rad-1){
                	return true;//report win for s
            	}
        	}
		}
		return false;
	} 
//////////////////////////
	public boolean checkD(){
		for(int i = 0; i < this.controller.board.rad; i++){
			if(this.controller.board.gameboard[i][i] != 'X')
				break;
			if(i == this.controller.board.rad-1){
				return true;
			}
		}
		for(int i = 0; i < this.controller.board.rad; i++){
			if(this.controller.board.gameboard[i][i] != 'O')
				break;
			if(i == this.controller.board.rad-1){
				return true;
			}
		}
		return false;
	}
////////////////////////////////
	public boolean checkRD(){
		for(int i = 0; i < this.controller.board.rad; i++){
			if(this.controller.board.gameboard[i][(this.controller.board.rad-1)-i] != 'X')
				break;
			if(i == this.controller.board.rad-1){
				return true;//report win for s
			}
		}
		for(int i = 0; i < this.controller.board.rad; i++){
			if(this.controller.board.gameboard[i][(this.controller.board.rad-1)-i] != 'O')
				break;
			if(i == this.controller.board.rad-1){
				return true;//report win for s
			}
		}
		return false;
	}
}
