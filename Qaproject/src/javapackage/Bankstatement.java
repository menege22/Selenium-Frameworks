package javapackage;

public class Bankstatement {
	
	Bankstatement(String username, String pass)
	{
		System.out.println(username+ " "+pass);
	}
    
	int amt=5000;
			
	private void deposit(int depamt,int secamt)
	{
	 amt= amt+depamt+secamt;
	System.out.println("The current balance after deposit"+amt);
		
	}
	
	void withdraw (int wtd)
	{
	amt = amt-wtd;
	System.out.println("The withdraw amount is"+ amt);
	}
	
	int display()
	{
		return amt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // create an object
		
		Bankstatement obj= new Bankstatement("Taedle12","1234");
		obj.deposit(1000,2000);
		obj.withdraw(500);
		System.out.println(obj.display());
	
		
		
	}

}
