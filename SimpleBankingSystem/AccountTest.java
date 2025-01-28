package SimpleBankingSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	Account myAccount = new Account("Albert Prats", "1000-1234-56-123456789", 2500);

	@Test
	void testDepositAmount() {
		try {
			myAccount.depositAmount(200);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Error en l'ingrés");
		}
		
		assertEquals(2700, myAccount.getBalance());
	}

}
