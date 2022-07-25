package ex5;

import java.util.Scanner;

public class DVD extends Midia{

	private int faixas;
	
	public DVD() {
		super();
	}
	
	public DVD(int codigo, double prco, String nome) {
		super(codigo, prco, nome);
	
	}

	public String getTipo() {
		return "DVD: ";
	}
	
	public String getDEtalhes() {
		return super.getDetalhes() + "\n" + "Numeros de faixas: " + faixas;
	}
	public void setFaixas(int fai) {
		faixas = (fai > 0) ? fai : 0;
	}
	
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de faixas: ");
		int fai = sc.nextInt();
		
		setFaixas(fai);
	}
	
	
}
