package thread;

public class TicketRunnable implements Runnable{
   private int ticketNum=10;
//    Object obj=new Object();

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            synchronized (TicketRunnable.class){
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
