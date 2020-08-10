
package comercializadora.de.libros;

/**
 *
 * @author Adriana
 */
public class Libros {
    private String Nombre;
	private String Autor;
	private int Aniopublicacion;
	private String Editorial;
	private int ISBN;
	private double Valor;
	private double Desc = 20;
	
	
	public Libros(String nombre, double valor) {
		super();
		Nombre = nombre;
		Valor = valor;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getAniopublicacion() {
		return Aniopublicacion;
	}

	public void setAniopublicacion(int aniopublicacion) {
		Aniopublicacion = aniopublicacion;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}
	
	public double getValor1() {
		double total_pagar = 0;
		total_pagar = Valor * 0.09 - Desc / 100 ;
		
		return Valor + total_pagar;
	}
}
    

