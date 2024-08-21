package Thread1;



public class TicketRunnableTest {
    public static void main(String[] args) {
        TicketRunnable ticketRunnable = new TicketRunnable();
        Thread thread1 = new Thread(ticketRunnable, "窗口一");
        Thread thread2 = new Thread(ticketRunnable, "窗口二");
        Thread thread3 = new Thread(ticketRunnable, "窗口三");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
