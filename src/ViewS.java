import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ViewS implements ActionListener  {
    ActionListener actionListener;
    private Controller controller;
    JButton [][] buttons;
    JLabel myLabel = new JLabel();
    JPanel myTextPanel = new JPanel();
    JPanel myButtonPanel = new JPanel();
    JFrame frame = new JFrame("TerribleTicTacToe");
    JPanel myMainPanel = new JPanel();


        ViewS (Controller _controller){

        this.controller =_controller;
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        myButtonPanel.setLayout(new GridLayout(this.controller.board.rad,this.controller.board.rad));
        buttons =new JButton[this.controller.board.rad][this.controller.board.rad];

        for(int x=0;x<this.controller.board.rad;x+=1){
            for(int y=0;y<this.controller.board.rad;y+=1){
            buttons[x][y]=new JButton(" ");
            buttons[x][y].setPreferredSize(new Dimension(50,50)); 
            buttons[x][y].addActionListener(this);
            myButtonPanel.add(buttons[x][y]);
            }      
        }
        
        
        myTextPanel.setLayout(new GridLayout(1,1));
        myTextPanel.setPreferredSize(new Dimension(150,50));
       
        myTextPanel.add(myLabel);
        
        
        myMainPanel.setLayout(new BoxLayout(myMainPanel, BoxLayout.Y_AXIS));
        myMainPanel.add(myButtonPanel);
        myMainPanel.add(myTextPanel);

       frame.getContentPane().add(myMainPanel); 
      

            
    frame.pack();
    frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
         for (int i = 0; i < this.controller.board.rad; i++){
             for (int j= 0; j < this.controller.board.rad; j++){
                if (e.getSource() == buttons[i][j]){
                    this.controller.buttonClicked(i, j);//my particular action for that button
                }                                       
            }
        }
    }
}