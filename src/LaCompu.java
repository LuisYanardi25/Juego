
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agustin <lsiccatto@gmail.com>
 */
public class LaCompu {
    
    Numero number = new Numero();
    int x = number.GenerarNumeroAleatorio();
    
    
    public int Computadora(int Opcion){
       int intento=0;
       
        switch (Opcion) {
               case 0:
                   JOptionPane.showMessageDialog(null,"Adivine un numero entre 1-100");
                   do{
                       try{
                           intento = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero: "));
                           do{
                                // Verifico que el dato ingresado este entre 1 y 100
                               if(intento<1 || intento>100){
                                   JOptionPane.showMessageDialog(null,"Ingreso un numero fuera del Rango");
                                   intento = Integer.parseInt(JOptionPane.showInputDialog(null,"Intentelo de nuevo entre 1 y 100  : "));
                               }
                           }while(intento>100 ||  intento<1);
                           
                           if(intento>=1 && intento<=100){
                               if(intento==x){
                                   JOptionPane.showMessageDialog(null,"Adivinaste! era: " + x );
                               }else{
                                   if(intento<x){
                                       JOptionPane.showMessageDialog(null,"Mas!");
                                   }else{
                                       if(intento>x){
                                           JOptionPane.showMessageDialog(null,"Menos!");
                                       }
                                   }
                               }
                           }
                           //Atrapo el error al ingresar un valor No Numerico
                       }catch(NumberFormatException ex){
                           JOptionPane.showMessageDialog(null,"Ingreso un caracter NO NUMERICO");
                       }
                   }while(intento!=x);
            
               break;
        }
         return intento;      
    
  }  
}
