/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Pichau
 */
public class Soma implements  Calc  {
    
   @Override
   public String Calcular(int val1, int val2){
               String txt = String.valueOf(val1+val2);
               return txt;
   }
}
