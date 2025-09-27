
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Laptop{
    public void getLaptop(){
        System.out.println("got it");
    }
}
class Dev{
    public void run(Laptop lap){
        lap.getLaptop();
    }
}
public class Main {
    public static void main(String[] args) {
            int x;
            x=2;
            System.out.println(x);
            Laptop myLaptop = new Laptop();
            Dev ankit = new Dev();
            ankit.run(myLaptop);
    }
}