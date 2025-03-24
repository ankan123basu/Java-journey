public class Assertion2 {
        public static int square(int n){
            assert n>=0:"Number must be non-negative";
            return n*n;
        }
        public static void main(String[] args) {
            System.out.println(square(4));
            System.out.println(square(-4));
        }
}
