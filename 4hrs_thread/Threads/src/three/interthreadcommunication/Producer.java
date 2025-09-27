package three.interthreadcommunication;

public class Producer extends Thread{
    Que que;
    Producer(Que que){
        this.que = que;
        new Thread(this, "Producer").start();
    }
    public void run(){
        int counter = 1;
        while(true){
            que.put(counter++);
        }
    }
}
