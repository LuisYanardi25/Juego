/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Agustin <lsiccatto@gmail.com>
 */
public class Numero {
 //Defino las cotas para crear un numero dentro de este rango
       ///
     private  int numero_sup=100;
     private   int numero_inf=1;
     private int numeroAleatorio;
        
        public int GenerarNumeroAleatorio(){
              numeroAleatorio =((int)(Math.random()* numero_sup) + numero_inf );
        return  numeroAleatorio;
    }

    public int getNumero_sup() {
        return numero_sup;
    }

    public void setNumero_sup(int numero_sup) {
        this.numero_sup = numero_sup;
    }

    public int getNumero_inf() {
        return numero_inf;
    }

    public void setNumero_inf(int numero_inf) {
        this.numero_inf = numero_inf;
    }
        
        
        
}
