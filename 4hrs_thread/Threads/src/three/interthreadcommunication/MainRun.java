package three.interthreadcommunication;

public class MainRun {
    public static void main(String[] args) {
        final Que sharedq = new Que();
        Producer producer = new Producer(sharedq);
        Consumer consumer = new Consumer(sharedq);
    }
}
