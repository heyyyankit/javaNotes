package three.interthreadcommunication;

public class Consumer extends Thread{
    Que que;
    Consumer(Que que){
        this.que = que;
        new Thread(this, "Consumer").start();
    }
    public void run(){
        while(true){
            que.get();
        }
    }
}
