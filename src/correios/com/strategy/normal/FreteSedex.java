package correios.com.strategy.normal;

import correios.com.strategy.Frete;

public class FreteSedex implements Frete{

	public double calcularPreco(int distancia) {

		return distancia * 1.7 + 15;

	}

}
