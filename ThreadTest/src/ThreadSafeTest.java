public class ThreadSafeTest implements Runnable{
    int num=10;
    public synchronized void doit(){
        if(num>0){
            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("tickets"+num--);
        }
    }
    public void run(){
        while (true){
            doit();
        }
    }
    public static void main(String[] args) {
        ThreadSafeTest threadSafeTest=new ThreadSafeTest();
        Thread a=new Thread(threadSafeTest);
        Thread b=new Thread(threadSafeTest);
        Thread c=new Thread(threadSafeTest);
        Thread d=new Thread(threadSafeTest);
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
