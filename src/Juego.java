import javax.swing.JOptionPane;

/**
 * 
 * @LuisYanardiSiccatto Luis Yanardi Siccatto <lsiccatto@gmail.com>
 */
public class Juego {
    
    public static void main(String[] args) {
        
       JOptionPane.showMessageDialog(null,"Bienvenido a adivinar numero");
       //Llamo al metodo, donde genero un numero Aleatorio con Math.random
       //Utilizando las cotas

       String[] options = {"Usuario", "Computadora","Terminar Juego"};
       
       int opcion;
     
   do{  // Asi pregunta el programa si el Usuario quiere adivinar o la computadora  
       opcion = JOptionPane.showOptionDialog(null, "Quien quiere que adivine el número", "Adivinar Número", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
       //Bucle para que el programa solo se pueda terminar,si se selecciona "Terminar juego"
       
           switch (opcion) {
               case 0:
                   LaCompu A = new LaCompu();
                   A.Computadora(opcion);
                   break;
               case 1:
                   Usuario B = new Usuario();
                   B.Humano(opcion);
                   break;
               case 2:
                   System.exit(1);
               default:
                   break;
           }
       
   }while(opcion!=2);   

  }
   
    
}      
