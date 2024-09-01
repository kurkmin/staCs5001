public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        MyThread mt = new MyThread("Child #1");
        mt.start();
        for(int i= 0; i < 50; i ++) {
            System.out.println(".");
            try {
                Thread.sleep(100);

            }
            catch(InterruptedException exc) {
                System.out.println("main thread interrupted.");

            }
        }
        System.out.println("Main thread ending.");
    }
}
