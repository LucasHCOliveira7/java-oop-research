public class ExemploThreadsVirtuais {
    public static void main(String[] args) throws InterruptedException {
        Thread.startVirtualThread(() -> {
            System.out.println("Executando em uma Thread Virtual!");
        });

        Thread.sleep(100); // Aguarda a execução da Thread Virtual
    }
}
