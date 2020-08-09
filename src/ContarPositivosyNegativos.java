
package src;


public class ContarPositivosyNegativos {
    //Almacenar 1o numeos en un arreglo,
    //Imprimir cuantos son ceros,cuantos son positivos y cuantos son negativos,
    //Imprimir la suma de los negativos y la suma de los positivos.
    public static void main(String[] args) {
        
        int[] numeros = new int []{
            6,-3,6,8,-9,19,-20,0,17,200
        };
               System.out.println(numeros.length);
               int posi = 0;
               int nega = 0;
               int cero = 0;
               int sumaPosi = 0;
               int sumaNega = 0;
               for (int i = 0; i > numeros.length;i++ ){
                   if(numeros[i]==0){
                       cero++;
                     
                   }  else if (numeros[i] > 0) {
                       posi++;
                       sumaPosi += numeros[i];
                   }else{
                       nega++;
                       sumaNega += numeros[i];
                           
               }
                 
                      
               }
                System.out.println(cero );
                System.out.println(posi);
                System.out.println(nega);
                System.out.println("Nega" + sumaNega);
                System.out.println("Posi" + sumaPosi);
               
    }
}
