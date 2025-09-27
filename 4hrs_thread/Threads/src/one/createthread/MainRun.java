package one.createthread;

public class MainRun {
    public static void main(String[] args) {
        SomeWork someWork = new SomeWork();
        // do it with the help of extending Thread class
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start(); // both thread will execute together
        try{
            t1.join();
            t2.join();  // we completed both thread before moving to implementation of runnable
        } catch(Exception e){
            System.out.println(e);
        }




        // do it with the help of implementing Runnable interface
        MyRunnable r1 = new MyRunnable();
        MyRunnable r2 = new MyRunnable();
        Thread tt1 = new Thread(r1);
        Thread tt2 = new Thread(r2);
        tt1.start();
        tt2.start();
    }
}
/*
Run thread through extend Thread and implement Runnable

in both,
have some work
create MyThread or MyRunnable | Override run()
in main, Thread -   create MyThread and start
         Runnable - create MyRunnable and pass it to Thread class (default, from package) and start

RRR: only Thread class can .start()
work can pass in either from main or from thread also

for running Thread through runnable but without creating runnalbe class
    - create obj of runnable as anonymous function(from package) with thread
    - write runnable as lambda expression

in main
anonymous
Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                int x = 1000;
                while (x-- > 0) {
                    System.out.println("Work in progress " + x);
                }
            }
});
t1.start();

lambda
Thread t1 = new Thread(() -> {
            @Override
            public void run() {
                int x = 1000;
                while (x-- > 0) {
                    System.out.println("Work in progress " + x);
                }
            }
});
t1.start();



*/
