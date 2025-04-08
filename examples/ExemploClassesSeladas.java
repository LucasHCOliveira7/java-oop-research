// Classe selada
sealed class Forma permits Circulo, Retangulo { }

final class Circulo extends Forma {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

final class Retangulo extends Forma {
    double largura, altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    double calcularArea() {
        return largura * altura;
    }
}

public class ExemploClassesSeladas {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(4, 6);

        System.out.println("Área do círculo: " + ((Circulo) circulo).calcularArea()); // Saída: 78.53981633974483
        System.out.println("Área do retângulo: " + ((Retangulo) retangulo).calcularArea()); // Saída: 24.0
    }
}
