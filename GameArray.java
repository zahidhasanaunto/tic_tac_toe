

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class GameArray {
    GamePanel gameFrame;
    int GArray[][];
    boolean TurnPlayer;
    JButton Pressed;
    
    public GameArray(GamePanel g){
        GArray = new int[3][3];
        
        gameFrame = g;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                GArray[i][j] = 0;
            }
        }
    }
    public void InitArray(int i, int j, int Marker){
        GArray[i][j] = Marker;
        CheckWin(Marker);
    }
    public void CheckWin(int Marker){
        if((GArray[0][0] == Marker && GArray[0][1] == Marker && GArray[0][2] == Marker) || (GArray[1][0] == Marker && GArray[1][1] == Marker && GArray[1][2] == Marker) || (GArray[2][0] == Marker && GArray[2][1] == Marker && GArray[2][2] == Marker)){
            if(Marker == 1){
                JOptionPane.showMessageDialog(gameFrame, "Player 1 win");
            } else if (Marker == 2){
                JOptionPane.showMessageDialog(gameFrame, "Player 2 win");
            }
            gameFrame.DisableAll(false);
        } else if((GArray[0][0] == Marker && GArray[1][0] == Marker && GArray[2][0] == Marker) || (GArray[0][1] == Marker && GArray[1][1] == Marker && GArray[2][1] == Marker) || (GArray[0][2] == Marker && GArray[1][2] == Marker && GArray[2][2] == Marker)){
            if(Marker == 1){
                JOptionPane.showMessageDialog(gameFrame, "Player 1 win");
            } else if (Marker == 2){
                JOptionPane.showMessageDialog(gameFrame, "Player 2 win");
            }
            gameFrame.DisableAll(false);
        } else if((GArray[0][0] == Marker && GArray[1][1] == Marker && GArray[2][2] == Marker) || (GArray[2][0] == Marker && GArray[1][1] == Marker && GArray[0][2] == Marker)){
            if(Marker == 1){
                JOptionPane.showMessageDialog(gameFrame, "Player 1 win");
            } else if (Marker == 2){
                JOptionPane.showMessageDialog(gameFrame, "Player 2 win");
            }
            gameFrame.DisableAll(false);
        } 
    }
}






















