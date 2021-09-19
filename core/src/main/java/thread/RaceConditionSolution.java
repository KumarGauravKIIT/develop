package thread;

public class RaceConditionSolution {

    public static void main(String[] args) {
        TicketBooking tbObj = new TicketBooking();

        Thread t1 = new Thread(tbObj, "Customer1");
        Thread t2 = new Thread(tbObj, "Customer2");
        Thread t3 = new Thread(tbObj, "Customer3");
        Thread t4 = new Thread(tbObj, "Customer4");
        Thread t5 = new Thread(tbObj, "Customer5");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}

class TicketBooking implements Runnable{

    static int availableTickets = 3;


    @Override
    public void run() {
        System.out.println("Waiting to book ticket for :: " +Thread.currentThread().getName());

        synchronized (this){
            if (availableTickets > 0){
                System.out.println("Started Booking ticket for :: " +Thread.currentThread().getName());

                try{
                    Thread.sleep(2000);
                }catch (Exception e){}


                availableTickets--;

                System.out.println("Ticket Booked for :: "+ Thread.currentThread().getName());
                System.out.println("Available Tickets now :: "+ availableTickets);

            }else{
                System.out.println("Ticket not Booked for :: "+Thread.currentThread().getName());
            }
        }



    }
}



