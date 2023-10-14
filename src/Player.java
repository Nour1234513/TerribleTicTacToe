public class Player {
     
    Controller controller;
    int nummberOfPlayer = 2;
    char [] tecken = new char [nummberOfPlayer];
    Player (){
        for(int x=0; x<nummberOfPlayer;x+=1){
            tecken[x]= (char)('A'+x);
        }     
    }
}
