package correios;

public class Teste {

	public static void main(String[] args) {
		
		int distancia = 120;
		
		Frete f1 = new Frete(TipoFrete.NORMAL);
		Frete f2 = new Frete(TipoFrete.SEDEX);
		
		System.out.println("Valor total do frete 1: " + f1.calcularPreco(distancia));
		System.out.println("Valor total do frete 2: " + f2.calcularPreco(distancia));

	}

}
