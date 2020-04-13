public class Imovel {

	private String endereco;
	private double valorAluguel;

	private Proprietario proprietario = null;

	public Proprietario getProprietario() {
		return this.proprietario;
	};

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	};

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public void imprime() {

		System.out.println(
				" Endereço: " + endereco + "  Valor Aluguel: " + valorAluguel + "  Proprietário: " + proprietario);

	}

	public Imovel(String endereco, double valorAluguel, Proprietario proprietario) {

		this(endereco, valorAluguel);
		this.setProprietario(proprietario);
	}

	public Imovel(String endereco, double valorAluguel) {
		this.setEndereco(endereco);

		this.setValorAluguel(valorAluguel);
	}

}
