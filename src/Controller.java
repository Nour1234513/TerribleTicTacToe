import java.lang.String;

public class Controller {
    GameEngine gameEngine;
    ViewS view; 
    Board board;
    Player player;
    int currentPlayer=0;

    public Controller(){
        this.board = new Board(); 
        this.view = new ViewS(this);  
        this.player= new Player();
        this.gameEngine = new GameEngine(this);
    }

////////////////////////////////////
    void buttonClicked(int x,int y){
        if(!this.gameEngine.gameover){

            if(this.view.buttons[x][y].getText()==" "){
            this.board.gameboard[x][y]=this.player.tecken[currentPlayer];
            this.view.buttons[x][y].setText(Character.toString( this.player.tecken[currentPlayer]));

                if(Winner()){
                    String s;
                    s="Player ";
                    s+= currentPlayer+1;
                    s+= " won";
                    setTextInLabel(s);
                    this.gameEngine.gameover=true;
                }
            nextTurn();
            }
             
        }
    }

///////////////////////////////////

    void setTextInLabel(String s){
        view.myLabel.setText(s);
    }

/////////////////////////////////
    void nextTurn(){
        currentPlayer=(currentPlayer+1)%player.nummberOfPlayer;
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
 
///////////////////////////////
}
