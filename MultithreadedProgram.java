// A class that extends Thread
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - MyThread: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted");
            }
        }
    }
}

// A class that implements Runnable
class MyClass implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - MyClass: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("MyClass interrupted");
            }
        }
    }
}

// Main class to demonstrate multithreading
public class MultithreadedProgram {
    public static void main(String[] args) {
        // Creating and starting a thread using the MyThread subclass
        MyThread thread1 = new MyThread();
        thread1.setName("Thread 1");
        thread1.start();

        // Creating and starting a thread using MyClass that implements Runnable
        MyClass myRunnable = new MyClass();
        Thread thread2 = new Thread(myRunnable, "Thread 2");
        thread2.start();

        // Creating and starting another thread using MyClass
        Thread thread3 = new Thread(myRunnable, "Thread 3");
        thread3.start();
    }
}
