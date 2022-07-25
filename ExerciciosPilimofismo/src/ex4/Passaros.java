package ex4;

public class Passaros extends Animais {


	public Passaros(String nome) {
		super(nome);
	}
	public void imprime() {
		System.out.println("O passaro "+this.getNome());
		Movimento();
		System.out.println("voando");
		falar();
		System.out.println("piu-piu");
	
}
}