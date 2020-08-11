
package inventario;


import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void Mostrar(ArrayList<Libros> li) {
		System.out.println("Inventario");
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
	}
	  public static void Buscarcodigo(ArrayList<Libros> li) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Solicite codigo del libro: ");
		int codigoingresado = entrada.nextInt();
		for (int i=0;i<li.size();i++) {
			if (codigoingresado == li.get(i).getCodigo()) {
				System.out.println(li.get(i));	
			}
			
		}
	}
	
       public static void ComprarLibro (ArrayList<Libros> li) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Solicite Codigo del libro");
		int codigoingresado = entrada.nextInt();
		int cantidad;
		for (int i=0;i<li.size();i++) {
			if (codigoingresado == li.get(i).getCodigo()) {
				cantidad = li.get(i).getCantidadexistente();
				if(cantidad > 1) {
					cantidad -= 1;
					System.out.println("Gracias por su Compra");
					li.get(i).setCantidadexistente(cantidad);
					Actualizar(li);
				}else {
					cantidad = 0;
					System.out.println("Gracias por su Compra");
					System.out.println("El libro solicitado se agoto");
					li.get(i).setCantidadexistente(cantidad);
					Actualizar(li);
				}
			}
		}
	}
		
	public static void Actualizar(ArrayList<Libros> li) {
		
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
	}
		
	public static void librosMasCaros (ArrayList<Libros> li) {
		System.out.println("Analizando libros con precios mas altos");
	}
	
	
		public static void main(String[] args) {
			
			ArrayList<Libros> libros = new ArrayList<>();
			
			Libros l1 = new Libros(7052, 2, "RAYUELA", "JULIO CORTAZAR", 42.65);
			Libros l2 = new Libros(7061, 1, "BAJO LA MISMA ESTRELLA", "JHON GREEN", 23.65);
			Libros l3 = new Libros(7080, 3, "CUMBRES BORRACOSAS","EMILY BRONTE",35.75);
			Libros l4 = new Libros(7035, 4, "AFTER" , "ANNA TODD",24.99);
			Libros l5 = new Libros(7032, 5, "ODISEA" , "HOMERO",25.75);
			
			
			
			libros.add(l1);
			libros.add(l2);
			libros.add(l3); 
			libros.add(l4);
			libros.add(l5);
			
			Mostrar(libros);
 }
}