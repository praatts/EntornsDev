package SimpleBankingSystem;

/**
 *
 * @author Flor Martinez
 */
public class Main {
	public static void main(String[] args) {

		Account myAccount = new Account("Albert Prats", "1000-1234-56-123456789", 2500);

		// Mostra el balanç inicial del compte i realitza una retirada
		
		mostrarBalance(myAccount);

		retirarDinero(myAccount, 2600);

		// Mostra el balanç actualitzat i realitza un ingrés al compte
		
		mostrarBalance(myAccount);
		
		ingresarDinero(myAccount, 500);
		
		// Mostra el balanç final després de fer una retirada i un ingrés
		
		mostrarBalance(myAccount);
	}

	public static void retirarDinero(Account myAccount, double amount) {
		try {
			myAccount.withdrawAmount(2300);
		} catch (Exception e) {
			excepciones(e, "Error al retirar");
		}
	}

	public static void ingresarDinero(Account myAccount, double amount) {
		try {
			System.out.println("Ingrés al compte");
			myAccount.depositAmount(-1);
		} catch (Exception e) {
			excepciones(e, "Error en l'ingrés");
		}
	}

	public static void excepciones(Exception e, String message) {
		System.err.println(e.getMessage());
		System.out.println(message);
	}

	public static Account abrirCuenta(String name, String account, double amount) {
		return new Account(name, account, amount);
	}

	public static void mostrarBalance(Account myAccount) {
		System.out.println("El saldo actual es " + myAccount.getBalance());

	}

}
