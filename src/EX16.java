public class EX16 {
    public static void main(String[] args) {
        int[] numeros = {12, 25, 30, 44, 58};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 44) {
                System.out.println("Valor 44 encontrado na posição (índice): " + i);
                break;
            }
        }
    }
}
