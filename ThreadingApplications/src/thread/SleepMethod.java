package thread;

class thread1 extends Thread{

    @Override
    public void run() {

        try {
            for (int i=0;i<=5;i++)
            {
                Thread.sleep(10000);
                IO.println("vivek");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
public class SleepMethod {

    static void main(String[] args) {

        thread1 thread1=new thread1();

        thread1.start();
    }

}
