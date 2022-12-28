package empresa;

public class Real extends Moeda {
	
	public Real(double valor) {
		super(valor);
		
	}
	
	public static void info() {
		System.out.println("Valor de Real R$1,00 e igual R$1,00");
	}
	
	public double converter() {
		Double valorReal=valor;
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
		return "Aplicado Real R$" + valor + " convertido para Reais R$:" + converter();
	}

	
	
	
}
