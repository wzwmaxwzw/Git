package product;

public class ProducerRunnable implements Runnable{
    private Product p;

    public ProducerRunnable(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            if(i%2==0){
                try{
                    p.setProduct("费列罗","巧克力");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else {
                try{
                    p.setProduct("哈尔滨","啤酒");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
