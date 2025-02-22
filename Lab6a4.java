class Bank_account{
	int accountno;
	String accountname;
	String email;
	String accounttype;
	double accountbalance;
	public void setBank_accountdetails(int a_no,String a_name,String ema,String a_type,double a_bal){
		accountno=a_no;
		accountname=a_name;
		email=ema;
		accounttype=a_type;
		accountbalance=a_bal;
	}
	public String getBank_accountdetails(){
		return this.accountno+"  "+this.accountname+"  "+this.email+"  "+this.accounttype+"  "+this.accountbalance;
	}
	public void displayBank_accountdetails(){
		System.out.println("accountno ="+(this.accountno));
		System.out.println("accountname ="+(this.accountname));
		System.out.println("accountemail ="+(this.email));
		System.out.println("accounttype ="+(this.accounttype));
		System.out.println("accountbalance ="+(this.accountbalance));
	}
}
	

public class Lab6a4{
	public static void main(String [] args){
		Bank_account a1=new Bank_account();
		a1.setBank_accountdetails(010101,"abc","abcd@gmail.com","student acc",45000);
		String ans=a1.getBank_accountdetails();
		System.out.println(ans);
		a1.displayBank_accountdetails();
	}
}