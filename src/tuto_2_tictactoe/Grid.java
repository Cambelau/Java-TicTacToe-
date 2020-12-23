/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto_2_tictactoe;

/**
 *
 * @author Owner
 */
public class Grid {
    
    public String[] matrice = {"1" ,"2","3", "4","5","6","7","8","9"};
    
    public void addCross(int num){
        matrice[num-1]="X";
    } 
    
    public int  checkPlace(int num){
        if("X".equals(matrice[num-1]) || "O".equals(matrice[num-1]))
            return 0;
        else return 1;
    }
    
    public void addCircle(int num){
        matrice[num-1]="O";
    }  
    public String displayGrid(){
        
        String chaine = "";
        for (int i=0;i<9;i++){
            chaine+= matrice[i]  + "  ";
            if((i+1)%3==0)
                chaine+="\n";
        }
        return chaine;
    }
    
    public int isCross(int i){
        if("X".equals(matrice[i]))
            return 1;
        else return 0;
    }
    
    public int isCircle(int i){
        if("O".equals(matrice[i]))
            return 1;
        else return 0;
    }
}
