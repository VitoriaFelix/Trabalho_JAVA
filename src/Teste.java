
public class Teste {
	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("Vitoria");
		proprietario.imprime();

		Imovel imovel1 = new Imovel("Rua Unip", 2300, proprietario);

		Imovel imovel2 = new Imovel("Avenida Santos", 1800);

		PontoComercial pontoComercial = new PontoComercial("Avenida Paz", 5000, proprietario, 12);

		imovel1.imprime();
		imovel2.imprime();
		pontoComercial.imprime();

	}
}
