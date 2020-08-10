
package comercializadora.de.libros;

/**
 *
 * @author Adriana
 */
public class ComercializadoraDeLibros {

    
    public static void main(String[] args) {
        
        Libros lbr1 = new Libros("CAIN", 28);
	Libros lbr2 = new Libros("AFTER", 24);
		
		CD CD1 = new CD("X19X", 15);
		CD CD2 = new CD("TORCHES", 20);

       
		System.out.println("USTED TIENE QUE CANCELAR POR EL LIBRO CAIN :" + lbr1.getValor1() +  "$");
		System.out.println("EL LIBRO AFTER CUESTA : " + lbr2.getValor1() +  "$"); 
		
		System.out.println("                                                 ");
		
		System.out.println("EL VALOR DEL CD DE  ES X19X ES: " + CD1.getValorcd1() +  "$");
              
		System.out.println("EL VALOR DEL CD DE TORCHES ES : "  + CD2.getValorcd1() +  "$");
	}

}
    
    

