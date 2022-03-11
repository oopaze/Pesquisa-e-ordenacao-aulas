package problema1;

public class Index {
    public static void main(String[] args) {
        double numeroDecima = 0;
        double numeroDebaixo = 0;
        double resultado = 0;

        int i;
        for(i = 1; i <= 50; i++) {
            numeroDecima = (i * 2) - 1;
            numeroDebaixo = i; 
            resultado += numeroDecima / numeroDebaixo;
        }

        System.out.println("O valor é: " + resultado);
    }
}