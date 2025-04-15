interface MathOperation{
    int operate(int a, int b);
}

public class lambda2 {
    public static void main(String[] args) {
        MathOperation ob1 = (a,b)-> a + b;
        MathOperation ob2 = (a,b)-> a * b;
        
    }
}
