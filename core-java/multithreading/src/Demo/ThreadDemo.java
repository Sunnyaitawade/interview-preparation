package Demo;

public class ThreadDemo {
    public static void main(String[] args) {
        //Using Extended Thread class demo
        ThreadClassDemo usingThreadEclassDemo = new ThreadClassDemo();
        usingThreadEclassDemo.start();

        //Using Extended Thread class demo
        RunnableClassDemo usingRunnableClassDemo = new RunnableClassDemo();
        Thread threaddemo = new Thread(usingRunnableClassDemo);
        threaddemo.start();

        //Using lambada expression for runnable interface
        Runnable basic=()->{
            System.out.println("Using lambada expression..");

            for (int i = 1; i < 6; i++) {
                System.out.println("Using lambada expression= "+i);
            }
        };
        Thread threadUsingLambada = new Thread(basic);
        threadUsingLambada.start();
    }
}
