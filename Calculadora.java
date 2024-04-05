import java.util.Scanner;

public class Calculadora{

    public static int somar(int n1, int n2){
        return n1 + n2;
    }

    public static int subtrair(int n1, int n2){
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2){
        return n1 * n2;
    }

    public static int dividir(int n1, int n2){
        return n1 / n2;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual operação matemática você deseja? [1] Soma [2] Subtração [3] Multiplicação [4] Divisão: ");

        int operacao = scanner.nextInt();

        if(operacao == 1){

            System.out.println("Você escolheu soma!");

            System.out.println("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            int resultado = somar(n1, n2);

            System.out.println(n1 + " + " + n2 + " = " + resultado);

            scanner.close();

        } else if(operacao == 2){

            System.out.println("Você escolheu subtração!");

            System.out.println("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            int resultado = subtrair(n1, n2);

            System.out.println(n1 + " - " + n2 + " = " + resultado);

            scanner.close();

        } else if(operacao == 3){

            System.out.println("Você escolheu multiplicação!");

            System.out.println("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            int resultado = multiplicar(n1, n2);

            System.out.println(n1 + " x " + n2 + " = " + resultado);

            scanner.close();

        } else if(operacao == 4){

            System.out.println("Você escolheu divisão!");

            System.out.println("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            int resultado = dividir(n1, n2);

            System.out.println(n1 + " / " + n2 + " = " + resultado);

            scanner.close();

        } else{

            System.out.println("Operação Inválida!");

        }

        scanner.close();

    }
}