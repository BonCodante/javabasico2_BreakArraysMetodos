public class EX17 {
    public static void main(String[] args) {
        int[] valores = {10, -5, 20, -3, 15, -8, 5};
        int somaPositivos = 0;

        for (int valor : valores) {
            if (valor < 0) {
                continue;
            }
            somaPositivos += valor;
        }

        System.out.println("Soma dos valores positivos: " + somaPositivos);
    }
}
