package MultithreadDemo;

public class MultiThreadDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            ThreadClassExtendedDemo object
                    = new ThreadClassExtendedDemo();
            object.start();
        }
    }
}
