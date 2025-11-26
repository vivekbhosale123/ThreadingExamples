package thread;

class Table1 {

   synchronized public void setTable(int n) {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                IO.println(i * n);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class mythread12 extends Thread {

    Table table;

    public mythread12(Table table) {
        this.table = table;
    }

    public void run() {
        table.setTable(2);
    }

}

class mythread21 extends Thread {

    Table table;

    public mythread21(Table table) {
        this.table = table;
    }

    public void run() {
        table.setTable(3);
    }

}


public class AsynchronizationApp {

    static void main(String[] args) throws InterruptedException {

        Table table = new Table();

        mythread12 mythread12 = new mythread12(table);
        mythread21 mythread21 = new mythread21(table);

        mythread12.start();
        mythread12.join();
        mythread21.start();

    }
}
