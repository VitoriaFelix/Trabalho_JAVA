
public class Proprietario {

	private String nome;

	public String getNome() {
		return this.nome;
	};

	public void setNome(String nome) {
		this.nome = nome;
	};

	public Proprietario(String nome) {

		this.setNome(nome);

	}

	public void imprime() {

		System.out.println(" Nome: " + nome);
	}
}
