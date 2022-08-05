package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	     Employee E1 = new Employee();
	     
	     
	     E1.Name = "Mike";
	     E1.EmpId = 1000;
	     E1.Department="HR";
	     E1.Display();
	    
	  
	    
	    Employee E2 = new Employee("Jack", 1001, "Finance");
	    
	    E2.Display();
	    
	    Bank B = new Bank();
	    
	    B.DisplayBalance();
	    int Bal = B.GetBalance();
	    B.AccountNUM=500;
	    
	   System.out.println("The Balance is " + B.GetBalance());
	   System.out.println("The Balance is" + Bal);
	    
	   BOA B1 = new BOA();
	   B1.CCbalance();
	   B1.DisplayBalance();

		OverLoadingExample obj = new OverLoadingExample();
		
		int RecArea = obj.GetArea(3,4);
		
		int SqArea = obj.GetArea(4);
		
		System.out.println("RectArea is " + RecArea );
		System.out.println("SqArea" + SqArea);
		
		// Overriding example
		ChromeClass Ch= new ChromeClass();
		Ch. OpenBrowser();
		Browser Br = new ChromeClass();
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.DisplayName();
		
		HondaCar car1 = new HondaCar();
		
		CarInterface car2 = new HondaCar();
		

		EncapsulationEx En = new EncapsulationEx();
		En.setBalance(3000);


}
}

