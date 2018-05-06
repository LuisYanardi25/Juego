import javax.swing.JOptionPane;

/**
 * 
 * @LuisYanardiSiccatto Luis Yanardi Siccatto <lsiccatto@gmail.com>
 */
public class juego {
    
    public static void main(String[] args) {
        
       JOptionPane.showMessageDialog(null,"Bienvenido a adivinar numero");
        int numero_sup=100;
        int numero_inf=1;
   
        int randomNum = GenerarNumeroAleatorio(numero_sup,numero_inf);
        
       int intento=0;
      
       String[] options = {"Yo", "Vos","Terminar Juego"};
       
       int opcion;
do {
    opcion = JOptionPane.showOptionDialog(null, "Quien quiere que adivine el número", "Adivinar Número", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
     
    if(opcion==0){
                JOptionPane.showMessageDialog(null,"Adivine un numero entre 1-100");
              do{
                try{
                        intento = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero: "));
                        do{
                            if(intento<1 || intento>100){
                                JOptionPane.showMessageDialog(null,"Ingreso un numero fuera del Rango");
                                intento = Integer.parseInt(JOptionPane.showInputDialog(null,"Intentelo de nuevo entre 1 y 100  : "));
                            }
                        }while(intento>100 ||  intento<1);
                        
                        if(intento>=1 && intento<=100){
                            if(intento==randomNum){
                                JOptionPane.showMessageDialog(null,"Adivinaste! :) era: " + randomNum );
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
                    
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Ingreso un caracter NO NUMERICO");      
                }         
              }while(intento!=randomNum); 
              
             
                        
      }else if(opcion==1){      
                int numeroAleatorio = GenerarNumeroAleatorio(numero_sup,numero_inf); ;
                char s;
                do{
                    s = JOptionPane.showInputDialog(null,"Es este?: " +  numeroAleatorio).charAt(0);
                        switch (s) {
                            case '+':
                                numero_inf=numeroAleatorio;
                                numeroAleatorio+=((numero_sup-numero_inf))/2;
                                //                                numeroAleatorio = GenerarNumeroAleatorio(numero_sup,numero_inf);
                                JOptionPane.showMessageDialog(null,"Es mayor");
                                break;
                            case '-':
                                // numero_inf= numeroAleatorio;
                              numero_sup=numeroAleatorio;
                             numeroAleatorio-=((numero_sup-numero_inf))/2;
                                //                                 numeroAleatorio = GenerarNumeroAleatorio(numero_sup,numero_inf);
                                
                                JOptionPane.showMessageDialog(null,"Es menor");
                                break;
                            case '=':
                                JOptionPane.showMessageDialog(null,"ADIVINE!! YEAAH era este: " +  numeroAleatorio);
                                break;
                            default:
                                break;
                        }           
                }while(s != '=');
               
      }else{
                System.exit(1);
        }
     }while(opcion != 2); 
}
    
    
    private static int GenerarNumeroAleatorio(int numero_sup, int numero_inf){
        
        return  ((int)(Math.random()* numero_sup) + numero_inf );
    }
}