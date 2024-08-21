package product;

public class CustomerRunnable implements Runnable{

    private Product p;


    public CustomerRunnable(Product p) {
        this.p = p;
    }

    @Override
    public void run() {

        for(int i=1;i<=10;i++){
            try{
                p.getProduct();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
