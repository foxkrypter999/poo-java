/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author denis
 */
class Fibo {
    int calculaFibonacci(int x){
        int calculaFibonacci = x;
        if(x == 0){
            return 0;
        }else if( x == 1){
            return 1;
        }else{
            calculaFibonacci = (calculaFibonacci(x-1)) + (calculaFibonacci(x-2));
            return calculaFibonacci;
        }
    }
}
