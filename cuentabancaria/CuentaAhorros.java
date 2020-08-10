
package cuentabancaria;

/**
 *
 * @author Adriana
 */
public class CuentaAhorros extends CuentaBancaria {
	
	@Override
	public void deposito(double dinero) {
		
		double totalDeposito = dinero < 1000 ? dinero + dinero *0.02: dinero;
		this.saldo += totalDeposito;
		//super.deposito(totalDeposito);
		//Suma saldo total, super llama desde el método padre
	
		}
	
	public void imprimirSaldo() {
		System.out.println("Saldo: "+ getSaldo());
	}
}

