package empresa;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Cofrinho{
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void add (Moeda m) {
		listaMoedas.add(m);
		
		
	}
	public void remover(Moeda m) {
		boolean r=false;
		//Metodo de confirmação para remoção do valor
		for(Moeda e: listaMoedas) {
			if(m.equals(e)) {
			r=true;
			}
			
		}
		if(r==true) {
			listaMoedas.remove(m);
			System.out.println("Removido!");
		}
		else {
			System.out.println("Erro ao Remover, valor nao encontrado.");
		}
		
	}
	void totalConverido() {	
		double total=0;
		for (Moeda m: listaMoedas) {
			total+=m.converter();
			}
		System.out.println("****Total em Reais e : R$"+new DecimalFormat(".##").format(total)+"****");//tramento saida com 2 digitos apos a virgula
		System.out.println("_________________");
	}
	
	void listagemMoeda() {
		for(Moeda m: listaMoedas){
			System.out.println(m);
			System.out.println("_____________________");
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(listaMoedas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cofrinho other = (Cofrinho) obj;
		return Objects.equals(listaMoedas, other.listaMoedas);
	}
	
	
}
