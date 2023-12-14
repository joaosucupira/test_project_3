public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int[] trocados = {a, b,3,4,5,6,7,8,9};

        System.out.println("Antes da troca: a = " + trocados[0] + ", b = " + trocados[1]);
        
        trocarValores(trocados,2,3);

        
        a = trocados[2];
        b = trocados[3];

        System.out.println("Após a troca: a = " + a + ", b = " + b);
    }

    public static void trocarValores(int[] valores, int indcA, int indcB) {
        int temp = valores[indcA];
        valores[indcA] = valores[indcB];
        valores[indcB] = temp;
    }
}