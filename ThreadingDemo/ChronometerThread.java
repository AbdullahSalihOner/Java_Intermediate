package ThreadingDemo;

public class ChronometerThread implements Runnable{

    private Thread thread;
    private String threadName;

    public ChronometerThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run(){
        System.out.println("Running " + threadName);

        try
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread : " + threadName + " interrupted.");
        }

        System.out.println("Thread over : " + threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting Thread" + threadName);

        if (thread == null)
        {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}