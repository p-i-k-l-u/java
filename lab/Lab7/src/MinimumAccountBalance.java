import java.util.Scanner;

class MinimumAccountBalance extends Exception {

    String message;

    public MinimumAccountBalance(String message) {
        this.message = message;
    }


    public String toString() {
        return message;
    }
}

 class UserDefinedException {

    static double current_balance = 100;

    public static void main(String[] args) throws MinimumAccountBalance {
//        System.out.println("Balance is 100");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount to withdrawal");
        int n = s.nextInt();
        try {
            if (current_balance < n) {
                throw new MinimumAccountBalance("Insufficient funds ! your Current balance is " + current_balance);
            } else {
                System.out.println("Please Take The Money : " + n);
            }

        } catch (MinimumAccountBalance c1) {
            c1.printStackTrace();

        }


    }
}
