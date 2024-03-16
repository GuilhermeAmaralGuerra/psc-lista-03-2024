import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        num3 = input.nextDouble();

        double maiorNum;
        maiorNum = Math.max(num1, Math.max(num2, num3));

        double menorNum;
        menorNum = Math.min(num1, Math.min(num2, num3));

        double media;
        media = (num1 + num2 + num3) / 3;

        System.out.println("O maior número entre esses três é: " + maiorNum);
        System.out.println("O menor número entre esses três é: " + menorNum);
        System.out.println("A média desse três números é: " + media);

        input.close();       
    }
}