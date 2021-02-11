package Observer;

public class CondicoesAtuais implements Observer, ExibirElemento {

	private float temperatura;
	private float umidade;
	private Subject climaDados;
	
	/**
	 * O construtor recebe o objeto ClimaDados (Subject) e o 
	 * usamos para registrar a exibi��o como um observador.
	 * */
	public CondicoesAtuais(Subject climaDados) {
		this.climaDados = climaDados;
		climaDados.registerObserver(this);
	}
	
	public void exibir() {
		System.out.println("CONDI��ES ATUAIS: " + temperatura + " �C E " + umidade + " % DE UMIDADE.");
	}
	
	public void update(float temp, float umid, float pressao) {
		temperatura = temp;
		umidade = umid;
		exibir();
	}
}
