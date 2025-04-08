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

- [Exemplo de Streams API](examples/StreamsExample.java)
- [Exemplo de Classes Seladas](examples/SealedClassesExample.java)
- [Exemplo de Expressões Switch](examples/SwitchExpressionsExample.java)
- [Exemplo de Threads Virtuais](examples/ExemploThreadsVirtuais.java)
- [Exemplo de Polimorfismo e Sobrecarga](examples/Exemplos.java)
- [Comandos da JDK](examples/JDKCommands.java)

## Como Executar

1. Certifique-se de ter o JDK 21 instalado.
2. Compile os exemplos com `gradle build`.
3. Execute os exemplos com `java -cp build/classes/java/main examples.<NomeDoExemplo>`.
