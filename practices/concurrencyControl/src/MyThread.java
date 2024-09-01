public class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    // Construct a new thread.
    MyThread(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
    }

    // A factory method that creates and starts a thread.
    public static MyThread createAndStart(String name, int[] nums) {
        MyThread myThrd = new MyThread(name, nums);

        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    public void run() {
        int sum;

        System.out.println(thrd.getName() + " starting.");

        answer = sa.sumArray(a);
        System.out.println("Sum for " + thrd.getName() +
                " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}
