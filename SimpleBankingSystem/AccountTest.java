package SimpleBankingSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	Account myAccount = new Account("Albert Prats Bagés", "1000-1234-56-123456789", 2500);
	

	@Test
	void testWithdrawAmount() {
		
		try {
			
	    	myAccount.withdrawAmount(2700);
	    } catch(Exception e){
        	System.err.println(e.getMessage());
            System.out.println("Error al retirar");
	    }
		System.out.println(myAccount.getBalance());
		assertEquals(-200, myAccount.getBalance());
	}

}


