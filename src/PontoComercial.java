
public class PontoComercial extends Imovel {
	private int qtdeVagas;

	public int getQtdeVagas() {
		return qtdeVagas;
	}

	public void setQtdeVagas(int qtdeVagas) {
		this.qtdeVagas = qtdeVagas;
	}

	public PontoComercial(String endereco, double valorAluguel, Proprietario proprietario, int qtdeVagas) {

		super(endereco, valorAluguel, proprietario);
		this.setQtdeVagas(qtdeVagas);
	}

	public void imprime() {
		super.imprime();
		System.out.println(" Quantidade de Vagas: " + qtdeVagas);
	}
}
