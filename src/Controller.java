


public class Controller {
    GameEngine gameEngine;
    ViewS view; 
    Board board;
    
    public Controller(){
        this.board = new Board();
        this.gameEngine = new GameEngine(this);
        this.view = new ViewS(this);  
        
    }
////////////////////////////////////
    void buttonClicked(int x,int y){
        if(!this.gameEngine.gameover){
            if(this.gameEngine.player == 0) { 
                this.board.gameboard[x][y] = 'O';   	                
            }
            else {    
            this.board.gameboard[x][y] = 'X';
            }
        setXO(x, y,(this.gameEngine.player==0?"O":"X"));
        nextTurn();
        }
    }

///////////////////////////////////

    void setTextInLabel(String s){
        view.myLabel.setText(s);
    }

/////////////////////////////////
    void nextTurn(){
        this.gameEngine.player=(this.gameEngine.player+1)%2;
    }
///////////////////////////////
    void setXO(int x,int y,String z){
        this.view.buttons[x][y].setText(z);
    if(this.gameEngine.checkifP1win()){
        setTextInLabel("player 1 won");
        this.gameEngine.gameover=true;
       }
    if(this.gameEngine.checkifP2win()){
        setTextInLabel("Player 2 won");
        this.gameEngine.gameover=true;
        }
    }
///////////////////////////////
}
