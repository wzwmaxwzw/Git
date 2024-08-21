package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketRunnable implements Runnable{

    private int ticketNum=10;

    Lock lock=new ReentrantLock();

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            lock.lock();
            try{
                if(ticketNum>0){
                    System.out.println("我从"+Thread.currentThread().getName()+"买到了"+"第"+ticketNum--+"火车票");
                }
                lock.unlock();
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
