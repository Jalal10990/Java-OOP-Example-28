public class AccountRunner {
    public static void main(String[] args) {
        EncapsulatedAccount account1 = new EncapsulatedAccount(10000);

        //deposi1 and withdraw 
        account1.deposit(2500);
        account1.withdraw(1500);

        EncapsulatedAccount account2 = new EncapsulatedAccount(account1.getBalance());

        System.out.println("\nAccount 1 Balance: $" + account1.getBalance());
        System.out.println("Account 2 Balance: $" + account2.getBalance());
    }
    }

