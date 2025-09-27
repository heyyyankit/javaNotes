package one.createthread;

public class MyRunnable implements Runnable{
    SomeWork someWork = new SomeWork();
    @Override
    public void run(){
        int x = 1000;
        while(x-->0)someWork.printIt(x);
    }
}
