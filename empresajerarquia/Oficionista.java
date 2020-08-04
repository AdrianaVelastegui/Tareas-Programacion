/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajerarquia;

/**
 *
 * @author Adriana
 */
public class Oficionista extends Empleado{
     private int numeroDeIdentificacion;
    private int codigoArea;

    public Oficionista(int numeroDeIdentificacion, int codigoArea, String nombresYapellidos, double cedula) {
        super(nombresYapellidos, cedula);
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.codigoArea = codigoArea;
    }

    public Oficionista(double salario) {
        super(salario);
        
    }
    

    public double salarioOficionista(){
        return salario;
    }
}
