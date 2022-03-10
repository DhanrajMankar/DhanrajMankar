package BankAtm;

public class AccountHolder implements Runnable {
	
	private Account account;
	public AccountHolder(Account account) {
		this.account=account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			makeaWithdrawal(2000);
			if(account.getBalance()<0) {
				System.out.println("Account is overdrawn");
			}
		}
	}
	
	private void makeaWithdraw(int withdrawAmount) {
		if(account.getBalance()>=withdrawAmount) {
			System.out.println(Thread.currentThread().getName()+"is going to withdraw -"+withdrawAmount);
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName()+"completes the withdraw of -"+withdrawAmount);
		}else {
			System.out.println("not enough balance for "+Thread.currentThread().getName()+"to withdrraw"+account.getBalance());
		}
	}
}
    
	

