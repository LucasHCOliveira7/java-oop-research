// Exemplo de Polimorfismo: Sobrecarga e Sobrescrita
class Animal {
    void emitirSom() {
        System.out.println("Algum som genérico de animal");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Latido");
    }
}

class Calculadora {
    // Sobrecarga de métodos
    int somar(int a, int b) {
        return a + b;
    }

    double somar(double a, double b) {
        return a + b;
    }
}

public class Exemplos {
    public static void main(String[] args) {
        // Exemplo de Polimorfismo: Sobrescrita
        Animal meuCachorro = new Cachorro();
        meuCachorro.emitirSom(); // Saída: Latido

        // Exemplo de Polimorfismo: Sobrecarga
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(5, 10)); // Saída: 15
        System.out.println(calculadora.somar(5.5, 10.5)); // Saída: 16.0

        // Exemplo de Garbage Collector
        System.out.println("Solicitando Garbage Collector...");
        System.gc(); // Solicita a execução do Garbage Collector
    }
}
