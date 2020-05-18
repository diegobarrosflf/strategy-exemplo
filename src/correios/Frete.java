package correios;

public class Frete {

	private TipoFrete tipo;

	public Frete(TipoFrete tipo) {
		this.tipo = tipo;
	}

	public double calcularPreco(int distancia) {

		double preco = 0;
		if (TipoFrete.NORMAL.equals(tipo)) {
			preco = distancia * 1.5 + 10;
		} else if (TipoFrete.SEDEX.equals(tipo)) {
			preco = distancia * 1.7 + 15;
		}

		return preco;
	}

}
