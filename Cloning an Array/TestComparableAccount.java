import java.util.Arrays;

public class TestComparableAccount {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * Write a driver program to create one array contains 5
		 * ComparableAcccount objects (account #: 1001-1005, initial
		 * balance=$1000). Make deposit $500 to each account, and withdraw $100
		 * - $500 for each account.
		 */
		ComparableAccount[] orginalAccount = new ComparableAccount[5];

		ComparableAccount comparableAccount1 = new ComparableAccount();
		ComparableAccount comparableAccount2 = new ComparableAccount();
		ComparableAccount comparableAccount3 = new ComparableAccount();
		ComparableAccount comparableAccount4 = new ComparableAccount();
		ComparableAccount comparableAccount5 = new ComparableAccount();

		orginalAccount[0] = comparableAccount1;
		orginalAccount[1] = comparableAccount2;
		orginalAccount[2] = comparableAccount3;
		orginalAccount[3] = comparableAccount4;
		orginalAccount[4] = comparableAccount5;

		System.out.println();
		int initialAccountNumber = 1001;
		double initialBalance = 1000.0;
		double deposit = 500.0;
		double initialWithdraw = 100.0;

		for (ComparableAccount account : orginalAccount) {
			account.setId(initialAccountNumber);
			account.setBalance(initialBalance);
			account.deposit(deposit);
			account.withdraw(initialWithdraw);

			initialAccountNumber++;
			initialWithdraw += 100.00;
		}

		System.out.println("Comparing balance of account1 with account2: " + comparableAccount1.compareTo(comparableAccount2));
		System.out.println("Comparing balance of account5 with account1: " + comparableAccount5.compareTo(comparableAccount1));

		ComparableAccount cloneAccount1 = (ComparableAccount) comparableAccount1.clone();
		ComparableAccount cloneAccount2 = (ComparableAccount) comparableAccount2.clone();
		ComparableAccount cloneAccount3 = (ComparableAccount) comparableAccount3.clone();
		ComparableAccount cloneAccount4 = (ComparableAccount) comparableAccount4.clone();
		ComparableAccount cloneAccount5 = (ComparableAccount) comparableAccount5.clone();

		ComparableAccount[] cloneAccountList = new ComparableAccount[5];
		cloneAccountList[0] = cloneAccount1;
		cloneAccountList[1] = cloneAccount2;
		cloneAccountList[2] = cloneAccount3;
		cloneAccountList[3] = cloneAccount4;
		cloneAccountList[4] = cloneAccount5;

		System.out.println();
		System.out.println("Clone Array From Elements:");
		for (ComparableAccount account : cloneAccountList) {
			System.out.println(account.toString());
		}

		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println("CloneArray.dateCreated==OriginalArray.dateCreated[" + i + "] " + "is : "
					+ (orginalAccount[i].getDateCreated() == cloneAccountList[i].getDateCreated()));
		}

		System.out.println();
		System.out.println("Before Sorting :");
		for (ComparableAccount account : orginalAccount) {

			System.out.println(account.toString());

		}

		System.out.println();
		System.out.println("After Sorting:");

		java.util.Arrays.sort(orginalAccount);
		for (int i = 0; i < 5; i++) {
			System.out.println(orginalAccount[i]);
		}

	}
}
