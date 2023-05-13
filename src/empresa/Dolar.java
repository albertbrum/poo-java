package empresa;

import java.util.Objects;

public class Dolar extends Moeda{
	double valor;
	
	
	
	@Override
	public String toString() {
		return "Dolar [ Valor = " + valor + " - Valor Convertido em Reais: " 
	+ calculaConversao() + " ]";
	}



	public Dolar(double valor) {
		super(valor);
		this.valor = valor;
	}
	
	

	@Override
	double calculaConversao() {
		double totalConvertido = 5 * valor;
		return totalConvertido;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(valor);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}



	
}