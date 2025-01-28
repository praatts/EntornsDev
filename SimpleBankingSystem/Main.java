package SimpleBankingSystem;
/**
*
* @author Flor Martinez
*/
public class Main {
	 public static void main(String[] args) {
		Account myAccount;
	        
	    myAccount = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);
	     
	    
	     
	   

	     System.out.println("El saldo actual es " + myAccount.getBalance());   
	 }
	 
	 public static void retirarDinero(Account myAccount, double amount) {
		 try {
		    	myAccount.withdrawAmount(2300);
		    } catch(Exception e){
	        	excepciones(e, "Error al retirar");
		    }
	 }
	 
	 public static void ingresarDinero(Account myAccount, double amount) {
		 try {
	    	 System.out.println("Ingrés al compte");
	    	 myAccount.depositAmount(-1);
	    } catch(Exception e){
	    	 excepciones(e, "Error en l'ingrés");
	    }
	 }
	 
	 public static void excepciones(Exception e, String message) {
		 System.err.println(e.getMessage());
		 System.out.println(message);
	 }
	 
	 
}
