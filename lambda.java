
interface calculator{
    int add(int a,int b);
}
public class lambda {
    public static void main(String[] args) {
        calculator c = (a,b)-> {
           int sum = a+ b;
           return sum;
        };
        System.out.println("Sum is: "+c.add((int) 10.5,(int) 20.5));
    }
}
