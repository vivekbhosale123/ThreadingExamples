package thread;

class thread2 extends Thread{

    @Override
    public void run() {
        IO.println("vivek");
    }
}
public class SimpleThread {

    static void main(String[] args) {

        thread2 thread2=new thread2();

        thread2.start();
//        thread2.start();
    }

}
