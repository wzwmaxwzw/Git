package product;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        ProducerRunnable producerRunnable = new ProducerRunnable(product);
        CustomerRunnable customerRunnable = new CustomerRunnable(product);
        Thread thread1 = new Thread(producerRunnable);
        Thread thread2 = new Thread(customerRunnable);
        thread1.start();
        thread2.start();
    }
}
