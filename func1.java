
public class Main {
	public static class Coordenada{
		int x;
		int y;
	}
	
	public static class Retangulo{
		Coordenada canto_SE = new Coordenada();
		Coordenada canto_ID = new Coordenada();
		int area;
		
		public Retangulo(int xID, int yID, int xSE, int ySE) {
			canto_ID.x = xID;
			canto_SE.x = xSE;
			canto_SE.y = ySE;
			canto_ID.y = yID;
			
			area = Math.abs((canto_ID.x - canto_SE.x) * (canto_SE.y - canto_ID.y));
		}

	}
	
    public static void main(String[] args) {

//    	rect_A.canto_ID.x = 1;
//    	rect_A.canto_ID.y = 2;
//    	rect_A.canto_SE.x = 3;
//    	rect_A.canto_SE.y = 4;
    	
//    	Retangulo rect_A = new Retangulo(1,2,3,4);
//    	
//    	Retangulo rect_B = new Retangulo(7,11,13,19);
    	
    	int n_retangulos = 10;
    	Retangulo[] rects = new Retangulo[n_retangulos];
    	
    	int i = 0;
    	while(i < n_retangulos) {
    		rects[i] = new Retangulo(i,i,i*3,i*2);
    		System.out.println("Area do retangulo "+i+" = "+rects[i].area);
    		i++;
    	}
    	
    	
    }
}