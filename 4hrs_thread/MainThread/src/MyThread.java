public class MyThread extends Thread{
    Counter counter;
    public MyThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        int x = 1000;
        while(x-->0)counter.increment();
    }
}
