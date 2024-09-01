// to create a Thread object, an object should be implemented by runnable inferface

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
//        construct a MyThread object first
        MyThread mt = MyThread.createAndStart("Child #1");
//        construct a thread from the object
        Thread newThrd = new Thread(mt);

        newThrd.start();
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

