package correios.com.strategy.normal;

import correios.com.strategy.Frete;

public class FreteNormal implements Frete{

	public double calcularPreco(int distancia) {

		return distancia * 1.5 + 10;

	}

}
