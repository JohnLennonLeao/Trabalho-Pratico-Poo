package empresa;

public class Euro extends Moeda {
	
	public Euro(double valor) {
		super(valor);
		
	}
	
	public static void info(){
		System.out.println("Valor de Euro E$1,00 e igual R$5,50");
	}
	
	public double converter() {
		double valorReal = valor*5.50;
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
		return "Aplicado Euro E$:" + valor + " convertido para Reais R$:"+ converter();
	}
	
}
