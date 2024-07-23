import java.util.Scanner;

import Services.AllServices;


public class Main {

    public static void main(String[] args) {
      AllServices allServices = new AllServices();
    Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Update Account");
            System.out.println("4. Close Account");
            System.out.println("5. Deposit Funds");
            System.out.println("6. Withdraw Funds");
            System.out.println("7. Transfer Funds");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    allServices.createAccount();
                    break;
                case 2:
                    allServices.viewAccount();
                    break;
                case 3:
                    allServices. updateAccount();
                    break;
                case 4:
                    allServices.closeAccount();
                    break;
                case 5:
                    allServices.depositFunds();
                    break;
                case 6:
                    allServices.withdrawFunds();
                    break;
                case 7:
                    allServices.transferFunds();
                    break;
                case 8:
                    System.out.println("Thanks for using our service. Exiting the application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }



}
