/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oitorainhasjava;

/**
 *
 * @author denis
 */

public class Tabuleiro {

 public static int tabuleiro[][];
 public int numRainhas;
 public static int aux = 0;

 public Tabuleiro() {
  numRainhas = 0;
  tabuleiro = new int[8][8];
 }
 public void encheZeros(){
     for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
             tabuleiro[i][j] = 0;
         }
     }
 }

 public static void colocaRainha(int posicao){
      if(aux >= 0 && aux < 8 ){
        tabuleiro [posicao][aux] = 1;
        aux ++;
        }
 }
public static int get(int x, int y) {
    if (x < 0 || y < 0 || x > 7 || y > 7) { return -1;}
    return tabuleiro[x][y];
}

 public void printBoard() {
  for (int j = 0; j < 8; j++) {
   for (int k = 0; k < 8; k++) {
    System.out.print(this.get(j,k) + " "); 
   }
   System.out.println();
  }
     System.out.println("============================================");
 }
 
public void pinta(){
    for( int k = 0 ; k < 8 * 2 ; k++ ) {
        for( int j = 0 ; j <= k ; j++ ) {
            int i = k - j;
            if( i < 8 && j < 8 ) {
                System.out.print( tabuleiro[i][j] + " " );
            }
        }
        System.out.println();
    }
}

 //==================================================================
 
public void verifica(){
    
    
    // for para verificar diagonais
    for( int k = 0 ; k < 8 * 2 ; k++ ) {
        int temp = 0;
        for( int j = 0 ; j <= k ; j++ ) {
            int i = k - j;
            if( i < 8 && j < 8 ) {
                //System.out.print( tabuleiro[i][j] + " " );
                if(tabuleiro[i][j] == 1){
                    temp++;
                    if(temp >= 2 ){
                        System.out.println("false");
                    }
         
                }
            }
        }
        //System.out.println();
    }
    
    // for para verificar vertical e horizontal

    for (int i = 0; i < 8; i++) {
        int acres = 0;
        for (int j = 0; j < 8; j++) {
            //System.out.print( tabuleiro[i][j] + " " );
            if(tabuleiro[i][j] == 1){
                    acres++;
                    if(acres >= 2 ){
                        System.out.println("false");
                    }
         
                }
        }
       // System.out.println("");
    }
    
}
  
 //===================================================================
 public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.encheZeros();
        colocaRainha(2);
        colocaRainha(2);
        colocaRainha(7);
        colocaRainha(0);
        colocaRainha(3);
        colocaRainha(6);
        colocaRainha(4);
        colocaRainha(1);
        tabuleiro.printBoard();
        tabuleiro.verifica();
        
           
 }
} 

