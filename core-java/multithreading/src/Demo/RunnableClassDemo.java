package Demo;

public class RunnableClassDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Using implemented  runnabble interface");
        for (int i = 1; i < 6; i++) {
            System.out.println("Using runnabble interface = "+i);
        }
    }
}
