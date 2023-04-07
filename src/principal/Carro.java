package principal;

public class Carro {

//atributos
	String marca;
	String modelo;
	int velocidadeMax;
	int velocidadeMin = 0;
	int velocidadeAtual = 0;
	
//metodos
	void acelerar(int km) {
		if(km <= velocidadeMax) {
			velocidadeAtual = km;
			System.out.println("O "+modelo+" está a "+velocidadeAtual+" km/h");
		} else {
			System.out.println("O "+modelo+" não suporta essa velocidade");
		}
	}
	
	void frear() {
		for(int i = velocidadeAtual; i > velocidadeMin; i--) {
			velocidadeAtual = i;
		}
		
		System.out.println("O "+modelo+" está a "+velocidadeAtual+" km/h e se mantem ligado");
	}
	
	void desligar() {
		velocidadeAtual = 0;
		System.out.println("O "+modelo+" está desligado");
	}
}
