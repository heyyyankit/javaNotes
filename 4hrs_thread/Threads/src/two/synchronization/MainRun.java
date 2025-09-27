package two.synchronization;

public class MainRun {
    public static void main(String[] args) {

        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println((counter.getCount()));
    }
}
/*
* Problem:- Two threads uses same resources (1 obj of counter) and changes at same time
* Solution:- synchronize the critical section ( increment counter method), what you want to be executed one at a time
*           like dont synchronize when calling(sb jgh krna hoga fir), synchronize where its acutally happens
*
* create a counter class with normal functions, synchronize increment method
* create own thread class in which we increase 1000 times (like functionallity given to thread)
* in main, create two thread of that, pass common resource in both and start doing operations
* */