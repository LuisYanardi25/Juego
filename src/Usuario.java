
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
public class Usuario {
      
    Numero numero2= new Numero();
      int y = numero2.GenerarNumeroAleatorio();
    
      private char s;
    
    public int Humano(int Opcion){
       
        do{
            s = JOptionPane.showInputDialog(null,"Es este?: " +  y).charAt(0);
        switch (s) {
                           case '+':
                               //Asigono el numero generado,a la cota inferior y resto las cotas, las divido
                               //y las sumo y reasigno a numero aleatorio. Entonces se da un nuevo numero y se mueve 
                               //la cota al numero aleatorio nuevo
                               numero2.setNumero_inf(y);
                               y+=(numero2.getNumero_sup()- numero2.getNumero_inf())/2;
                               JOptionPane.showMessageDialog(null,"Es mayor");
                               break;
                           case '-':
                             //Aca hago lo mismo solo que lo asigno a la cota inferior y muevo la cota inf 
                               // hasta el nuevo numero, entonces el programa tira un numero entre las dos cotas
                               //que se hicieron anteriormente
                               numero2.setNumero_sup(y);
                               y -=((numero2.getNumero_sup()-numero2.getNumero_inf()))/2;
     
                               JOptionPane.showMessageDialog(null,"Es menor");
                               break;
                           case '=':
                               JOptionPane.showMessageDialog(null,"ADIVINE!! YEAAH era este: " + y);
                               break;
                           default:
                               break;
                       }
                   }while(s != '=');
  
        return Opcion;
    }
}
