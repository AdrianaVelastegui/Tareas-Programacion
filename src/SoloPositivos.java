
package src;
import java.util.Scanner;

public class SoloPositivos {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Leer número ("+i+"): ");
            Scanner in=new Scanner(System.in);
            int numero= in.nextInt();
            if (numero>0) 
                System.out.print("Número: "+numero);
        }
        
    }
    
}
