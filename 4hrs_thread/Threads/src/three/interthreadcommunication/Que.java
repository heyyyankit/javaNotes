package three.interthreadcommunication;

public class Que {
    int n;
    boolean isLocked = false;
    public synchronized void put(int n){
        if(isLocked){
            try {
                wait();
            } catch(InterruptedException e){
                System.out.println("Interraption caught");
            }
        }
        this.n = n;
        isLocked = true;
        if(n<=5) System.out.println("produced : " + n);
        else System.exit(0);
        notify();
    }
    public synchronized int get(){
        if(!isLocked){
            try {
                wait();
            } catch(InterruptedException e){
                System.out.println("Interraption caught");
            }
        }
        if(n<=5) System.out.println("Consumer : " + n);
        isLocked = false;
        notify();
        return n;
    }
}
