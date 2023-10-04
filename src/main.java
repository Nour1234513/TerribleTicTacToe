public class main {
    
public static void main(String[] args) {

		Controller controller = new Controller();
        
		for(int x = 0; x < 3; x++)
			for(int y = 0; y < 3; y++) {
				controller.board.gameboard[x][y] = ' ';
			}
    }
}
