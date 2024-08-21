package String;

public class StringTest {
    public static void main(String[] args) {
        StringSyn1 stringSyn1 = new StringSyn1();
        StringSyn2 stringSyn2 = new StringSyn2();

        Thread t1 = new Thread(stringSyn1);
        Thread t2 = new Thread(stringSyn2);
        t1.start();
        t2.start();

    }
}
