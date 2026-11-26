public class EX18 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40};
        int total = 0;

        for (int numero : numeros) {
            total += numero;
        }

        System.out.println("Soma total dos 8 elementos: " + total);
    }
}
