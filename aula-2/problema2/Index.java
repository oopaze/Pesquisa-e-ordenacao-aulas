package problema2;

public class Index {
    public static void main(String[] args) {
        Integer expoente;
        Integer dividendo;
        float resultado = 0f;

        int i;
        for(i = 1; i <= 50; i++) {
            expoente = i;
            dividendo = 51 - i;

            resultado += Math.pow(2, expoente) / dividendo;

            System.out.println(Math.pow(2, expoente) + " / " + dividendo.toString());
        }

        System.out.println("O resultado é: " + resultado);
    }
}
