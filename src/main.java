public class main {
    
public static void main(String[] args) {

		Controller controller = new Controller();
        for(int x=0 ; x< controller.board.rad;x+=1){
          for(int y=0 ; y< controller.board.rad;y+=1){
            controller.board.gameboard[x][y]=' ';
          }
        }
    }
}
