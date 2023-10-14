import java.lang.String;

public class Controller {
    GameEngine gameEngine;
    ViewS view; 
    Board board;
    Player player;
    ViewS view2;
    int currentPlayer=0;

   

    public Controller(){
        this.board = new Board(); 
        this.view = new ViewS(this,0) ;
        this.player= new Player();
        this.gameEngine = new GameEngine(this);
        this.view2=new ViewS(this, 1);
    }

////////////////////////////////////
    void buttonClicked(int x,int y,int id){
        if(!this.gameEngine.gameover){
            if(this.board.gameboard[x][y]==' '){
                if(view2.viewId==id&&id==currentPlayer){
                    makeAMove(x,y);
                    nextTurn();
                }
                if(view.viewId==id&&currentPlayer==id){
                    makeAMove(x,y);
                    nextTurn();  
                }
            }
        }
    }
    

///////////////////////////////////

    void setTextInLabel(String s){
        view.myLabel.setText(s);
        view2.myLabel.setText(s);
    }

/////////////////////////////////
    void nextTurn(){
        currentPlayer=(currentPlayer+1)%player.nummberOfPlayer;
    }

 //////////////////////////////   
    
///////////////////////////////
 void makeAMove(int x, int y){
    this.board.gameboard[x][y]=this.player.tecken[currentPlayer];
    this.view.buttons[x][y].setText(Character.toString( this.player.tecken[currentPlayer]));
    this.view2.buttons[x][y].setText(Character.toString( this.player.tecken[currentPlayer]));
    if(this.gameEngine.winner()){
        setTextInLabel("player "+ (currentPlayer+1) +" Won");
        this.gameEngine.gameover=true;
    }
}
///////////////////////////////
}
