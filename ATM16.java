package exercise16;

import java.util.Scanner;

public class ATM16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account14copy[] accounts = new Account14copy[10];
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account14copy(i, 100);
		}
		Scanner sc = new Scanner(System.in);
		while (true) {
			int id = -1;
			do {
				System.out.println("Enter an id: ");
				id = sc.nextInt();
			} while (id < 0 || id > 9);

			int option = -1;
			while (option != 4) {
				System.out.println("Main menu\n" + "1: check balance\n" + "2: withdraw\n" + "3: deposit\n" + "4: exit\n"
						+ "Enter a choice: \n" + "");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("The balance is " + accounts[id].getBalance());
				} else if (option == 2) {
					System.out.println("Enter an amount to withdraw: ");
					double amount = sc.nextDouble();
					accounts[id].withdraw(amount);
				} else if (option == 3) {
					System.out.println("Enter an amount to deposit: ");
					double amount = sc.nextDouble();
					accounts[id].deposit(amount);

				}
			}
		}
	}
}
