public class OrderMatic implements Runnable{
    private int orderNo=0;



    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sync();

    }
    public synchronized void sync(){
        this.orderNo++;
        System.out.println(Thread.currentThread().getName()+"- OrderNO==>"+orderNo);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
