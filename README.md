# java-oop-research
Pesquisa individual sobre os principais conceitos da linguagem Java, recursos da JDK, ferramentas, gerenciamento de memória, JVM e conceitos fundamentais de orientação a objetos (OO).

## Questões

1. **O que é Java?**  
   Java é uma linguagem de programação de alto nível, orientada a objetos e baseada em classes. Ela foi projetada para ser portátil, o que significa que o mesmo código pode ser executado em diferentes plataformas sem modificações, graças à JVM (Java Virtual Machine). Java é amplamente utilizado para o desenvolvimento de aplicações desktop, web, móveis e sistemas embarcados.

2. **O que é a JDK (Java Development Toolkit) usada no desenvolvimento Java e quais as principais ferramentas providas?**  
   A JDK é um conjunto de ferramentas e bibliotecas necessárias para o desenvolvimento de aplicações Java. Ela inclui o compilador `javac`, o interpretador `java`, ferramentas de depuração, documentação (`javadoc`), gerenciamento de pacotes (`jar`), entre outras.

3. **O que é a JRE (Java Runtime Environment) usada no desenvolvimento Java e qual a principal diferença em relação à JDK?**  
   A JRE é o ambiente necessário para executar aplicações Java. Ela inclui a JVM e bibliotecas padrão, mas não possui ferramentas de desenvolvimento como o compilador. A diferença principal é que a JDK é usada para desenvolver e executar, enquanto a JRE é apenas para executar.

4. **Qual o propósito do recurso de JNI (Java Native Interface) existente na JDK?**  
   O JNI permite que código Java interaja com bibliotecas nativas escritas em outras linguagens, como C ou C++. Isso é útil para acessar funcionalidades específicas do sistema operacional ou bibliotecas de terceiros.

5. **Qual a principal diferença da tecnologia Java da linguagem C/C++ em relação ao gerenciamento de memória?**  
   Em Java, o gerenciamento de memória é automático, realizado pelo Garbage Collector, que libera memória ocupada por objetos não utilizados. Em C/C++, o programador é responsável por alocar e liberar memória manualmente, o que pode levar a erros como vazamentos de memória.

6. **O que é o HotSpot? De que forma ele auxilia na otimização de performance de uma aplicação Java? Ilustre e exemplifique.**  
   O HotSpot é a implementação da JVM que inclui otimizações como compilação Just-In-Time (JIT) e análise de desempenho em tempo de execução. Ele identifica partes críticas do código e as otimiza para execução mais rápida.

7. **O que é o JIT (Just In Time) Compiler? De que forma ele auxilia na otimização de performance de uma aplicação Java?**  
   O JIT é um componente da JVM que compila bytecode em código nativo durante a execução, melhorando o desempenho ao evitar a interpretação repetitiva do bytecode.

8. **Descreva e exemplifique uma instrução de execução de cada um dos comandos abaixo existentes na JDK (elaborar uma tabela):**

   | Comando   | Descrição                                                                 | Exemplo de Uso                     |
   |-----------|---------------------------------------------------------------------------|------------------------------------|
   | `javap`   | Exibe informações sobre classes compiladas.                              | `javap -c MinhaClasse`            |
   | `jdeps`   | Analisa dependências de classes e pacotes.                               | `jdeps MinhaClasse.class`         |
   | `javadoc` | Gera documentação a partir de comentários no código.                    | `javadoc -d docs MinhaClasse.java`|
   | `jar`     | Empacota arquivos em um arquivo JAR.                                     | `jar cf app.jar *.class`          |
   | `jstat`   | Monitora estatísticas de desempenho da JVM.                              | `jstat -gc <pid>`                 |
   | `javah`   | Gera cabeçalhos para integração JNI (obsoleto).                          | `javah MinhaClasse`               |
   | `jconsole`| Ferramenta gráfica para monitorar a JVM.                                 | `jconsole`                        |
   | `jvisualvm`| Ferramenta gráfica para análise de desempenho.                         | `jvisualvm`                       |
   | `extcheck`| Verifica conflitos de versões de extensões.                              | `extcheck arquivo.jar`            |
   | `jarsigner`| Assina digitalmente arquivos JAR.                                       | `jarsigner -verify app.jar`       |
   | `keytool` | Gerencia chaves e certificados.                                          | `keytool -genkey -alias minhaChave`|
   | `jjs`     | Executa scripts JavaScript no ambiente Java (obsoleto).                 | `jjs script.js`                   |

9. **Quais os principais recursos que foram introduzidos na linguagem de programação Java nas seguintes versões: JDK 5, JDK 8, JDK 11, JDK 14, JDK 17 e JDK 21 (estruture em uma tabela).**

   | Versão | Recursos Principais                                                                 |
   |--------|-------------------------------------------------------------------------------------|
   | JDK 5  | Generics, Annotations, Enums, Autoboxing/Unboxing.                                 |
   | JDK 8  | Lambdas, Streams API, Date/Time API, Default Methods.                              |
   | JDK 11 | Strings multiline, HTTP Client API, Remoção do JavaFX.                             |
   | JDK 14 | Switch Expressions, NullPointerException aprimorado.                               |
   | JDK 17 | Sealed Classes, Pattern Matching para `switch`.                                    |
   | JDK 21 | Virtual Threads, Sequenced Collections, melhorias de desempenho.                   |

10. **Quais as outras linguagens de programação, além da linguagem Java, podem ser executadas através da JVM?**  
    Kotlin, Scala, Groovy, Clojure, JRuby, Jython, entre outras.

11. **Na sua opinião, quais as principais vantagens e desvantagens da linguagem Java em relação à Python e C (estruture em uma tabela).**

    | Comparação | Vantagens Java                          | Desvantagens Java                     |
    |------------|-----------------------------------------|---------------------------------------|
    | Python     | Portabilidade, desempenho superior.     | Sintaxe mais verbosa.                 |
    | C          | Gerenciamento automático de memória.    | Menor controle sobre hardware.        |

12. **Quais as principais vantagens e desvantagens da herança múltipla em uma linguagem de programação? Utilize C++ ou Python como exemplo.**  
    - Vantagens: Reutilização de código, maior flexibilidade.  
    - Desvantagens: Ambiguidade no acesso a métodos (exemplo: problema do diamante em C++).

13. **Conceitualmente o que é Polimorfismo e quais são os principais tipos existentes na literatura? Descreva cada um deles.**  
    Polimorfismo é a capacidade de um objeto assumir diferentes formas. Tipos:  
    - Sobrecarga: Mesma classe, métodos com assinaturas diferentes.  
    - Sobrescrita: Subclasses redefinem métodos da superclasse.

14. **Qual a diferença entre sobrecarga e sobrescrita de métodos?**  
    - Sobrecarga: Mesma classe, métodos com o mesmo nome, mas assinaturas diferentes.  
    - Sobrescrita: Subclasse redefine um método da superclasse com a mesma assinatura.

## Exemplos de Código

### Os 4 Pilares da Programação Orientada a Objetos (POO)

1. **Abstração:** Esconder detalhes complexos e mostrar apenas o necessário.
   ```java
   public class Carro {
      void ligar() {
         System.out.println("Carro ligado");
      }
   }
   ```

2. **Encapsulamento:** Proteger os dados, usando private e acessando por get/set.
   ```java
   class Pessoa {
      private String nome;
      public String getNome() { return nome; }
      public void setNome(String nome) { this.nome = nome; }
   }
   ```

3. **Herança:** Uma classe herda atributos e métodos de outra.
   ```java
   class Animal {
      void fazerSom() { System.out.println("Som genérico"); }
   }

   class Cachorro extends Animal {
      void fazerSom() { System.out.println("Latido"); }
   }
   ```

4. **Polimorfismo:** Um mesmo método se comporta de formas diferentes.
   ```java
   Animal a = new Cachorro(); 
   a.fazerSom(); // imprime "Latido"
   ```

### Exercícios Dado em Sala / Fragmentos dos Exercícios

Suponha um exemplo simples que junta POO com lógica:
```java
class Conta {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
```

### Fluxos de Controle

if/else:
```java
int idade = 18;
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

while:
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

for:
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### Modificadores Principais
   - **public:** acessível de qualquer lugar.
   - **private:** acessível só dentro da classe.
   - **protected:** acessível na classe e em subclasses.
   - **default (sem nada):** acessível dentro do mesmo pacote.

```java
public class Pessoa {
    private String nome; // só dentro da classe
    protected int idade; // na classe e subclasses
}
```

### Arrays

Array é uma estrutura para armazenar múltiplos valores do mesmo tipo.
```java
int[] numeros = new int[5]; // array com 5 posições
numeros[0] = 10;
System.out.println(numeros[0]);
```

### Switch Case
Boa alternativa ao if para múltiplas opções:

```java
int dia = 2;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda");
        break;
    default:
        System.out.println("Outro dia");
}
```

### Implementação, Membro de Classe, Construtores, Métodos

Classe com construtor e métodos:
```java
public class Pessoa {
    private String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método
    public void dizerOla() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

Membro de Classe (atributo estático):
```java
public class Contador {
    public static int total = 0; // Membro de classe

    public Contador() {
        total++;
    }
}
```

### Herança

```java
class Funcionario {
    String nome;

    public void trabalhar() {
        System.out.println("Trabalhando...");
    }
}

class Gerente extends Funcionario {
    public void trabalhar() {
        System.out.println("Gerenciando...");
    }
}
```