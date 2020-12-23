    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto_2_tictactoe;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class Tuto_2_Tictactoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Tictactoe etienne = new Tictactoe();
            
            
            do{
                
                etienne.playPlayer();
                etienne.printGame();
                etienne.playComputer();
                etienne.printGame();
                
            }while(etienne.winGame()==0);
            
    }
    
}
