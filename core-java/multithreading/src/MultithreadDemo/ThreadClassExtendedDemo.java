package MultithreadDemo;

public class ThreadClassExtendedDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Using Extended Thread class:");
        System.out.println("Thread Id::"+Thread.currentThread().getId());
        System.out.println("Thread Name::"+Thread.currentThread().getName());
    }
}
