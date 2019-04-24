

public class JoinTest implements Runnable {
    private int count = 5;

    public void run() {
        while (true) {
            try {
                System.out.println(count + "");
                if (--count == 0) {
                    return;
                }
            }catch (Exception e){
                e.printStackTrace();

            }
        }

    }

    public static void main(String[] args) {
       try {
           JoinTest joinTest = new JoinTest();
           Thread t1 = new Thread(joinTest);
           t1.start();
           t1.join();
           System.out.println("执行了子线程在执行主线程");
       }catch (InterruptedException e){
           e.printStackTrace();
       }
    }
}
