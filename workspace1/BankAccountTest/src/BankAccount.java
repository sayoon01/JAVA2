public class BankAccount {
	String owner;
	int accountNumber;
	int balance;
	
	void deposit(int amount) 
	{
		balance += amount; // ����
	}
	
	void withdraw(int amount)
	{
		balance -= amount; //���
	}
}
