
package src;
import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[]args){
        int numero;
        
        System.out.println("Leer numero:");
        Scanner in = new Scanner(System.in);
        numero = in.nextInt();
        
        int[] numeros = new int[5];
        
        numeros[0] = 1;
        numeros[1] = 10;
        numeros[2] = 100;
        numeros[3] = 1000;
        numeros[4] = 10000;
        
        int posicion = -1;
        
        for(int i = 0; i < numeros.length; i++ ) {
            if(numero == numeros [i]){
                posicion = i;
            }
            
        }
        if(posicion != -1){
            System.out.println("El numero encontrado en:" + posicion);
        } else {
            System.out.println("El numero" + numero + "no encontrado");
            
        }
    }
}