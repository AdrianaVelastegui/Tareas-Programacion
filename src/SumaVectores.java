
package src;


public class SumaVectores {
    public static void main(String[] args){
       int Vector1 [] = {12, 3, 7, 5,18};
       int suma1 = 0;
       
       int Vector2 [] = { 8,5,13,26, 77};
       int suma2 = 0;
       
       for(int i = 0; i < Vector1.length; i++){
           suma1 += suma2 + Vector1[i];
       }
       for(int i = 0; i < Vector2.length; i++) {
           suma1 += suma2 + Vector2 [i];
       }
       if (suma1 > suma2){
           System.out.println("Vector 1 es mayor" + suma1);
       }    else if (suma2 > suma1){
           System.out.println("Vector 2 es mayor" + suma2);
       }    else {
           System.out.println("Los vectores son iguales");
       }
         
       
         
    }
}
    
