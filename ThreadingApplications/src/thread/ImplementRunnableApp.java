package thread;
class Thred implements Runnable{

    @Override
    public void run() {
//        IO.println("vivek");
        for (int i=1;i<=10;i++)
        {
            try {
                Thread.sleep(10000);
                IO.println("vivek");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ImplementRunnableApp {

    static void main(String[] args) {

        Thred thred=new Thred();

        Thread thread=new Thread(thred);

        thread.start();

    }

}
