package principal;

public class Principal {
	public static void main(String[] args) {

//instanciando a classe
		Carro car1 = new Carro();
		
		car1.marca = "Fiat";
		car1.modelo = "Uno";
		car1.velocidadeMax = 160;
		
		car1.acelerar(80);
		
		Carro car2 = new Carro();
		
		car2.marca = "Volkswagen";
		car2.modelo = "Fusca";
		car2.velocidadeMax = 180;
		
		car2.acelerar(140);
	}
	
	
}
