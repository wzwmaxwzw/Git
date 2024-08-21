package String;

public class StringSyn2 implements Runnable{
    private String str="Hello";
    @Override
    public void run() {
        synchronized (str){
            System.out.println("StringSyn2 get lock");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("StringSyn2 exit");
        }
    }
}
