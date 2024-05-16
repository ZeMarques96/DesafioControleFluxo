import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Primeiro parâmetro: ");
            int parametroUm = sc.nextInt();
            System.out.println("Segundo parâmetro: ");
            int parametroDois = sc.nextInt();

            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void contar(int x, int y) {
        if (x < y) {
            int contador = y - x;
            for (int i = 1; i <= contador; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } else {
            throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior que o primeiro. ");
        }
    }
}
