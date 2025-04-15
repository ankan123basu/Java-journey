 class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class CustomUnchecked {
   static void withdraw(double amount){
    if(amount < 5000){
        throw new InsufficientFundsException("Insufficient funds for withdrawal. Minimum amount is 5000.");
    } 
        System.out.println("Withdrawal successful: " + amount);
   }

   public static void main(String[] args) {
       withdraw(3000); // This will throw an exception
       
   }
}