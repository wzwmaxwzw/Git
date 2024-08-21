package Thread1;

public class TicketThread extends Thread{

    private static int ticketNum=10;

    public TicketThread(){

    }

    public TicketThread(String msg){
        super(msg);
    }

    public static synchronized void buyTicket(){
        if(ticketNum>0){
            System.out.println("我从"+Thread.currentThread().getName()+"买到了"+"第"+ticketNum--+"火车票");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
       for(int i=0;i<100;i++){
           buyTicket();
       }
    }
}
