import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic oMatic=new OrderMatic();
        List<Thread>list=new ArrayList<>();
        for(int i=0;i<100;i++){
            Thread t=new Thread(oMatic);
            list.add(t);
            t.start();
        }
        for(Thread t:list){
            t.join();
        }
        System.out.println(oMatic.getOrderNo());
        

    }
}
