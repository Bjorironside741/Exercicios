import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Scanner;

public class VerificarLetra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que insira uma palavra
        System.out.print("Digite uma palavra para verificar a letra 'a': ");
        String input = scanner.nextLine();

        // Verifica a quantidade de ocorrências da letra
        int count = countOccurrencesOfLetters(input);

        // Exibe a quantidade de ocorrências
        if (count > 0) {
            System.out.println("A letra A (maiúsculas ou minúsculas) aparecem " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra A (maiúsculas ou minúsculas) não estão presentes na string.");
        }

        scanner.close();
    }

    // Método para contar ocorrências da letra
    public static int countOccurrencesOfLetters(String str) {
        int count = 0;

        // Normaliza a string para remover acentos
        String normalizedStr = Normalizer.normalize(str, Form.NFD).replaceAll("\\p{M}", "");
        
        // Converte a string para minúsculas para simplificar a verificação
        normalizedStr = normalizedStr.toLowerCase();

        // Contagem das letras relevantes
        for (char c : normalizedStr.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        return count;
    }
}