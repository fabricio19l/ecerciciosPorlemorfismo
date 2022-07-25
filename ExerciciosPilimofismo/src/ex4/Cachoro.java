package ex4;

public class Cachorro extends Animais{

	public Cachorro(String nome) {
		super(nome);
	}
	public void imprime() {
		System.out.println("O cachorro "+this.getNome());
		Movimento();
		System.out.println("em quatro patas");
		falar();
		System.out.println();
	
}
	
	
}
