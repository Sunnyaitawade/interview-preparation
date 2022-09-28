package Demo;

public class ThreadClassDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Using Extended thread class");
        for (int i = 1; i < 6; i++) {
            System.out.println("Using Extended thread= "+i);
        }
    }
}
