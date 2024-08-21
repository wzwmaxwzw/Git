package product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String brand;
    private String name;
    private Boolean flag=false;

    public synchronized void setProduct(String brand,String name) throws InterruptedException {
        if(flag==true){
            wait();
        }
        this.setBrand(brand);
        Thread.sleep(100);
        this.setName(name);
        System.out.println("生产者生产了："+this.brand+"----->"+this.name);
        flag=true;
        notify();
    }


    public synchronized void getProduct() throws InterruptedException {
        if(flag==false){
            wait();
        }
        System.out.println("消费者消费了："+this.brand+"----->"+this.name);
        flag=false;
        notify();
    }




}
