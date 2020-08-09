
package src;



public class MayorArreglo {
       public static void main(String[] args) {
           int [] numeros = new int [] {28, 70, 34, 67, 59, 11, 7 };
           int mayor = numeros [0];
           
           for (int x = 1; x < numeros.length;x++ ){
               if (numeros [x] > mayor){
                   mayor = numeros[x];
               }
           }
           
         System.out.println("El mayor es:" + mayor);
           
      }
  }      