/** Projeto nº3: Implementando formas no espaço **/

public class Main {
	// Classe auxiliar para simular o plano cartesiano.
	public static class Coordenada{
		// Uso float para receber coordenadas pois ao calcular centros e distâncias
		// é uma recorrência frequente, porém, caso queira trabalhar com imagens 
		// e matrizes precisarei trabalhar com inteiros para conseguir percorrer 
		// as posições dos dados da matriz.
		
		float x;
		float y;
	}
	
	// Classe geral contendo os cantos que definem qualquer retângulo e o valor de sua área.
	public static class Retangulo{
		Coordenada canto_SE = new Coordenada(); // canto SUPERIOR ESQUERDO.
		Coordenada canto_ID = new Coordenada(); // canto INFERIOR DIREITO.
		Coordenada centro = new Coordenada(); // ponto central do retangulo.
		int area; // área do retangulo.
		
		
		// Objeto que facilita a criação de retângulos e contém algumas
		// informações obtidas pela posição de seus cantos opostos.
		
		public Retangulo(int xID, int yID, int xSE, int ySE) {
			// Argumentos x e y fazem referência a dados de coordenada.
			// O sufixo ID quer dizer INFERIOR DIREITO e SE diz SUPERIOR ESQUERDO.
			canto_ID.x = xID;
			canto_SE.x = xSE;
			canto_SE.y = ySE;
			canto_ID.y = yID;
			
			centro.x = (xID - xSE) / 2;
			centro.y = (ySE - xID) / 2;
			
			// Apenas nos interessa o valor absoluto da área.
			area = Math.abs((canto_ID.x - canto_SE.x) * (canto_SE.y - canto_ID.y));
			
		}


	}
	
    public static void main(String[] args) {

    	
    	}
    	
    	
    }
}