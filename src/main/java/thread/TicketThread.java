package thread;

public class TicketThread extends Thread{
    public static int ticketNum=10;

//    String s="abc";

    public TicketThread() {
    }

    public TicketThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            synchronized (TicketThread.class){
                if(ticketNum>0){
                    System.out.println("我从"+Thread.currentThread().getName()+"买到了"+"第"+ticketNum--+"火车票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
