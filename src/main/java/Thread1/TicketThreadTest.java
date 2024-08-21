package Thread1;

public class TicketThreadTest {
    public static void main(String[] args) {
        TicketThread t1 = new TicketThread("窗口一");
        TicketThread t2 = new TicketThread("窗口二");
        TicketThread t3 = new TicketThread("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
