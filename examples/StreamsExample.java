import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Lucas", "Maria", "João", "Ana");

        // Filtrar nomes que começam com "L" e imprimir
        nomes.stream()
             .filter(nome -> nome.startsWith("L"))
             .forEach(System.out::println); // Saída: Lucas

        // Contar nomes com mais de 3 caracteres
        long quantidade = nomes.stream()
                                .filter(nome -> nome.length() > 3)
                                .count();
        System.out.println("Nomes com mais de 3 caracteres: " + quantidade); // Saída: 3
    }
}
