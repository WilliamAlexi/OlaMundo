
import java.util.Scanner;

public class joda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu Peso");
        int peso = scanner.nextInt();
        System.out.println("Qual sua altura?");
        float altura = scanner.nextFloat();

        int imc = (int) (peso / (altura * altura));

        if (imc >= 18 && imc <= 24) {
            System.out.println("PESO IDEAL ");
        }
        if (imc >= 25 && imc <= 29) {
            System.out.println("SOBRE PESO ");
        }
        if (imc >= 30 && imc <= 34) {
            System.out.println("OBESIDADE GRAU I");
        }
        if (imc >= 35 && imc <= 39) {
            System.out.println("OBESIDADE GRAU II");
        }
        if (imc >= 40) {
            System.out.println("OBESIDADE GRAU III");

        }


    }
}
