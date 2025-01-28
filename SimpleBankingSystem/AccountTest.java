package SimpleBankingSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	 Account myAccount = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);
	@Test
	void testWithdrawAmount() {
		try {
	    	myAccount.withdrawAmount(-100);
	    } catch(Exception e){
        	System.err.println(e.getMessage());
            System.out.println("Error al retirar");
	    }
		assertEquals(2400, myAccount.getBalance());
		
	}

}
