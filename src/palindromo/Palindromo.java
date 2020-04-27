/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author joser
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Indices
        int izq, der;
        
        char [] palindromo;
        System.out.println("Palabra:");
        String palabra = entrada.nextLine();
        
        //Separar los caracteres de la palabra
        palindromo = palabra.toCharArray();
        
        //De izquierda a derecha
        izq=0;
        //De derecha a izquierda(el tamaño se decrementa en uno para que no empiece desde la posicion 0)
        der=palindromo.length -1;
        
        //Bucle para detectar si la palabra no es un palindromo
        while(izq < der){
            if (palindromo[izq] == palindromo[der]) {
                //Leera de derecha a izquierda, para ello se tiene que decrementar
                der--;
                //Leera de izquierda a derecha, para ello se tiene que incrementar
                izq++;
            }else{
                System.out.println("La palabra no es un palindromo");
                break;
            }
        }
        
        //Condicional para detectar que la palabra si es un palindromo
        if (izq == der) {
            System.out.println("La palabra es un palindromo");
        }
    }
    
}
