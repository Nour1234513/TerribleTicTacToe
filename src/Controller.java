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
            if(view2.viewId==id&&id==currentPlayer){
            if(this.view2.buttons[x][y].getText()==" "){
                move(x,y);

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
            if(view.viewId==id&&currentPlayer==id){
            if(this.view.buttons[x][y].getText()==" "){
                move(x,y);
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
    boolean Winner(){
        if(this.gameEngine.checkD()||this.gameEngine.checkH()||this.gameEngine.checkRD()||this.gameEngine.checkV()){
            return true;
            }
            else {
                return false;
            }
        }
    
///////////////////////////////
 void move(int x, int y){
    this.board.gameboard[x][y]=this.player.tecken[currentPlayer];
    this.view.buttons[x][y].setText(Character.toString( this.player.tecken[currentPlayer]));
    this.view2.buttons[x][y].setText(Character.toString( this.player.tecken[currentPlayer]));
    if(Winner()){
                    String s;
                    s="Player ";
                    s+= currentPlayer+1;
                    s+= " won";
                    setTextInLabel(s);
                    this.gameEngine.gameover=true;
                }
 }
///////////////////////////////
}
