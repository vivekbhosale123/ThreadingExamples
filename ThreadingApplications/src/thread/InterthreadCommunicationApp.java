package thread;

class Customer {

    int custAccoutBalance=1000;

   synchronized public void withdraw(int amount)
    {
        IO.println(" amount is going to withdraw "+amount);

        if(amount>custAccoutBalance)
        {
            IO.println("insufficient fund plz wait for some time to deposit money");

            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        custAccoutBalance-=amount;

        IO.println("amount withdraw successfully");

    }

   synchronized public void deposit(int amount)
    {
          IO.println(" amount is going to deposit ");
          custAccoutBalance+=amount;

          IO.println("amount deposited successfully");

//          notify();
    }

}

public class InterthreadCommunicationApp {

    static void main(String[] args) {

        Customer customer=new Customer();

        new Thread(){
            @Override
            public void run() {
                customer.withdraw(15000);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                customer.deposit(25000);
            }
        }.start();
    }

}
