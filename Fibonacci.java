import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o numero
        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        // Verifica se o numero pertence à sequência de Fibonacci
        if (isFibonacci(number)) {
            System.out.println(number + " este número pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    // Método para verificar se o número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num) {
        // Se o número for negativo, não pode ser parte da sequência de Fibonacci
        if (num < 0) {
            return false;
        }

        // Calcula Fibonacci e verifica se o número está na sequência
        int a = 0, b = 1;
        
        // A sequência começa com 0 e 1
        if (num == a || num == b) {
            return true;
        }

        int c = a + b;

        // Continua gerando Fibonacci até que o valor seja maior ou igual ao número informado
        while (c <= num) {
            if (c == num) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        // Se o número não foi encontrado na sequência
        return false;
    }
}
