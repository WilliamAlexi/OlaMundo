import java.sql.SQLOutput;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA");
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - DIVISÃO");
        System.out.println("4 - MULTIPLICAÇÃO");
        int opcaoEscolhida = scanner.nextInt();

        if (opcaoEscolhida == 1 || opcaoEscolhida == 2 || opcaoEscolhida == 3 || opcaoEscolhida == 4) {

            System.out.println("Fale o primeiro valor:");
            int primeiroValor = scanner.nextInt();
            System.out.println("Fale o segundo valor:");
            int segundoValor = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println(primeiroValor + segundoValor);
                    break;
                case 2:
                    System.out.println(primeiroValor - segundoValor);
                    break;
                case 3:
                    System.out.println(primeiroValor / segundoValor);
                    break;
                case 4:
                    System.out.println(primeiroValor * segundoValor);
                    break;

            }
        } else {
            System.out.println("Opção Invalida");
        }
    }
}
