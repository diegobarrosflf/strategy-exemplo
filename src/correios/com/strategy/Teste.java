package correios.com.strategy;

import java.util.Arrays;
import java.util.List;

import correios.com.strategy.normal.FreteNormal;
import correios.com.strategy.normal.FreteSedex;

public class Teste {

	public static void main(String[] args) {
		
		int distancia = 120;
		
		Frete f1 = new FreteNormal();
		Frete f2 = new FreteSedex();
		Frete f3 = new FreteNormal();
		Frete f4 = new FreteSedex();
	
		List<Frete> fretes = Arrays.asList(f1,f2,f3,f4);
		
		System.out.println("Strategy");
		
		for(Frete f : fretes) {
			System.out.println(f.calcularPreco(distancia));
		}
		

	}

}
