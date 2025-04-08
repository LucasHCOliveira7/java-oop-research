public class ExemploExpressoesSwitch {
    public static void main(String[] args) {
        String dia = "SEGUNDA";

        // Expressão Switch
        int numeroDoDia = switch (dia) {
            case "SEGUNDA" -> 1;
            case "TERÇA" -> 2;
            case "QUARTA" -> 3;
            case "QUINTA" -> 4;
            case "SEXTA" -> 5;
            case "SÁBADO", "DOMINGO" -> 6;
            default -> throw new IllegalArgumentException("Dia inválido: " + dia);
        };

        System.out.println("Número do dia: " + numeroDoDia); // Saída: 1
    }
}
