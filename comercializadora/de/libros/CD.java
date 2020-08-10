
package comercializadora.de.libros;

/**
 *
 * @author Adriana
 */
public class CD {
    
    
    private String Titulo;
	private String Interprete;
	private int Aniopublicacion;
	private double Valorcd;
	private double Desc = 10;
	
	
	
	public CD(String titulo, double valorCd) {
		super();
		Titulo = titulo;
		Valorcd = valorCd;
		
	}
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getInterprete() {
		return Interprete;
	}
	public void setInterprete(String interprete) {
		Interprete = interprete;
	}
	public int getAniopublicacion() {
		return Aniopublicacion;
	}
	public void setAniopublicacion(int aniopublicacion) {
		Aniopublicacion = aniopublicacion;
	}
	public double getValorcd() {
		return Valorcd;
	}
	public void setValorCd(double valorcd) {
		Valorcd = valorcd;
	} 

	public double getValorcd1() {
		double total_pagar = 0;
		total_pagar = Valorcd * 0.09 - Desc / 100 ;
		
		return Valorcd + total_pagar;
		
	}
}

