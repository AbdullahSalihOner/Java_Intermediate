package ThreadingDemo;

public class Main {
    public static void main(String[] args) {
        ChronometerThread chronometerThread1 = new ChronometerThread("Thread 1");

        ChronometerThread chronometerThread2 = new ChronometerThread("Thread 2");

        ChronometerThread chronometerThread3 = new ChronometerThread("Thread 3");

        chronometerThread1.start();
        chronometerThread2.start();
        chronometerThread3.start();    
    }
    
}
