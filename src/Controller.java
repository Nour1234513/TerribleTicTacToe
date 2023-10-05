


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
 //////////////////////////////   
    boolean Winner(){
        if(this.gameEngine.checkD()||this.gameEngine.checkH()||this.gameEngine.checkRD()||this.gameEngine.checkV()){
            return true;
            }
            else {
                return false;
            }
        }
    
///////////////////////////////
    void setXO(int x,int y,String z){
        if(this.view.buttons[x][y].getText()==" "){
            this.view.buttons[x][y].setText(z);

            if(Winner()){
                if(this.gameEngine.player==0)
                    setTextInLabel("Player 1 won");
                else {
                    setTextInLabel("Player 2 won");
                }
                this.gameEngine.gameover=true;
            }
            nextTurn();
        }
    }
///////////////////////////////
}
