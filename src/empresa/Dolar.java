package empresa;

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		super(valor);
		}
	
	public static void info(){
		System.out.println("Valor de Dolar $1,00 e igual R$5,10");
	}

	public double converter() {
		double valorReal = valor*5.10;
		return valorReal;
		
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Aplicado Dolar $:" + valor + " convertido para Reais R$:" + converter();
	}
}
