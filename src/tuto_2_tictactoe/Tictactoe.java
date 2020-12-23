/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto_2_tictactoe;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Owner
 */
public class Tictactoe {
    
        Grid game = new Grid();
        
        public void playPlayer(){

            int number;
            String str;
            
            do{
             
             str = JOptionPane.showInputDialog("Enter a number.");
            number = Integer.parseInt(str);     
            }while(game.checkPlace(number)==0);

            
            game.addCross(number);
        }
        
        public void playComputer(){
            Random randomGenerator = new Random();
            int number;
            do{
            number = randomGenerator.nextInt(9);     
            }while(game.checkPlace(number+1)==0);
            game.addCircle(number+1);
        }
        
        public void printGame()
        {
            JOptionPane.showMessageDialog(null, "Your move is recorded\nNow the computer will play\n" + game.displayGrid());
        }
        public int winGame(){
            
            for(int i=0;i<3;i++)
            if(game.isCross(i)==1 && game.isCross(i+1)==1 && game.isCross(i+2)==1  ){
                JOptionPane.showMessageDialog(null, "Cross win" );
                return 1;
            }
            for(int i=0;i<3;i++)
            if(game.isCross(i)==1 && game.isCross(i+3)==1 && game.isCross(i+6)==1  ){
                JOptionPane.showMessageDialog(null, "Cross win" );
                return 1;
            }
            
            if(game.isCross(4)==1 && game.isCross(0)==1 && game.isCross(8)==1  ){
                JOptionPane.showMessageDialog(null, "Cross win" );
                return 1;
            }
            if(game.isCross(4)==1 && game.isCross(2)==1 && game.isCross(6)==1  ){
                JOptionPane.showMessageDialog(null, "Cross win" );
                return 1;
            }
            
            /***************************************************************************************************************************/
            for(int i=0;i<3;i++)
            if(game.isCircle(i)==1 && game.isCircle(i+1)==1 && game.isCircle(i+2)==1  ){
                JOptionPane.showMessageDialog(null, "Circle win" );
                return 1;
            }
            for(int i=0;i<3;i++)
            if(game.isCircle(i)==1 && game.isCircle(i+3)==1 && game.isCircle(i+6)==1  ){
                JOptionPane.showMessageDialog(null, "Circle win" );
                return 1;
            }
            
            if(game.isCircle(4)==1 && game.isCircle(0)==1 && game.isCircle(8)==1  ){
                JOptionPane.showMessageDialog(null, "Circle win" );
                return 1;
            }
            if(game.isCircle(4)==1 && game.isCircle(2)==1 && game.isCircle(6)==1  ){
                JOptionPane.showMessageDialog(null, "Circle win" );
                return 1;
            }
            
            for(int i=0;i<9;i++)
            {}
            return 0;
        }
}
