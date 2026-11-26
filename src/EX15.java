public class EX15 {
    public static void main(String[] args) {
        int variavelMain = 50;

        if (variavelMain > 10) {
            int variavelIf = 100;
            System.out.println("Dentro do if - variavelMain: " + variavelMain);
            System.out.println("Dentro do if - variavelIf: " + variavelIf);
        }

        System.out.println("Fora do if - variavelMain: " + variavelMain);
        // System.out.println(variavelIf); // Erro de compilação: variavelIf não existe fora do bloco if
    }
}
