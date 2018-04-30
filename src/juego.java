
import java.util.InputMismatchException;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 * 
 * @LuisYanardiSiccatto Sammy Guergachi <lsiccatto@gmail.com>
 */
public class juego {
    
    public static void main(String[] args) {
        
       JOptionPane.showMessageDialog(null,"Bienvenido a adivinar numero");
        
       int randomNum = GenerarNumeroAleatorio();
        
       int intento=0;
      
       String[] options = {"Yo", "Vos"};
       
       int opcion = JOptionPane.showOptionDialog(null, "Quien quiere que adivine el número", "Adivinar Número", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
//       int opcion=JOptionPane.showConfirmDialog(null,"Listo para comenzar?","Listo?",JOptionPane.YES_NO_OPTION);
        
    
         
   
       if(opcion==0){
  JOptionPane.showMessageDialog(null,"El numero que intenta adivinar es....");  
      try{  
          do{ 
              intento = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero: "));
            do{  
              if(intento<0 || intento>5){
               JOptionPane.showMessageDialog(null,"Ingreso un numero fuera del Rango");
               intento = Integer.parseInt(JOptionPane.showInputDialog(null,"Intentelo de nuevo entre 0 y 5: "));
             }
            }while(intento>5);    
           if(intento>=0 && intento<=5){    
              
                if(intento==randomNum){
                 JOptionPane.showMessageDialog(null,"Adivinaste! :) es: " + randomNum );
             }else{
                 if(intento<randomNum){
                    JOptionPane.showMessageDialog(null,"Mas!");
                 }else{
                     if(intento>randomNum){
                         JOptionPane.showMessageDialog(null,"Menos!");
                     }
                 }
             }          
           } 
          }while(intento!=randomNum);
      }catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(null,"Ingreso un caracter NO NUMERICO");
          
      }                
       }else{
           int numeroAleatorio =(int)(( Math.random()* 10 ) + 1 );
           
           char s = JOptionPane.showInputDialog(null,"Intento, el numero es?: " + numeroAleatorio).charAt(0);
            
           int numero_sup = 10;
            int numero_inf = 0;
          
            do{
              
                    if(numeroAleatorio>0 ||  numeroAleatorio<10){                     
                    
                         if(s =='+'){
                                numero_sup= numeroAleatorio;
                               
                                 numeroAleatorio +=((numero_sup-numero_inf)/2);
                                JOptionPane.showMessageDialog(null,"Mas cierto");
                                
                                s = JOptionPane.showInputDialog(null,"Es este?: " +  numeroAleatorio).charAt(0);
                           }else{
                            
                             if(s=='-'){
                                 numero_inf= numeroAleatorio;
                                
                                 numeroAleatorio -=((numero_sup-numero_inf)/2);
                                
                                 JOptionPane.showMessageDialog(null,"Menos cierto");
                                
                                 s = JOptionPane.showInputDialog(null,"Es este?: " +  numeroAleatorio).charAt(0);
 
                              }else
                                if(s=='='){
                                      JOptionPane.showMessageDialog(null,"ADIVINE!! YEAAH era este: " +  numeroAleatorio);
                                }
                           }
                   }else{
                       JOptionPane.showMessageDialog(null,"Intento de nuevo");
                        }
        
        }while(s != '=');
           }
     
     
    
     } 
    
    
    private static int GenerarNumeroAleatorio(){
        return  ((int)(Math.random()* 10 ) + 1 );
    }
}