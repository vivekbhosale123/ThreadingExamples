package thread;

class Table {

    public void setTable(int n) {
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

class mythread1 extends Thread {

    Table table;

    public mythread1(Table table) {
        this.table = table;
    }

    public void run() {
        table.setTable(2);
    }

}

class mythread2 extends Thread {

    Table table;

    public mythread2(Table table) {
        this.table = table;
    }

    public void run() {
        table.setTable(3);
    }

}


public class SynchronizationApp {

    static void main(String[] args) {

        Table table = new Table();

        mythread1 mythread1 = new mythread1(table);
        mythread2 mythread2 = new mythread2(table);

        mythread1.start();
        mythread2.start();
    }

}
