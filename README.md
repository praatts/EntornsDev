# Sistema bancari simple

## Descripció
El programa consta d'una aplicació per ingresar i retirar diners d'un compte bancari.

## Funcionalitats

1. Ingresar diners a un compte bancari
2. Retirar diners d'un compte bancari
3. Avisar d'errors en cas de ingresar/retirar una quantitat negativa o intentar retirar una quantitat major del balanç que té el compte
4. Crear un compte bancari amb nom, número de compte i quantitat de diners que té el compte


## Estructura del Codi

### `Main.java`
 Realitza els ingresos i les retirades, llança excepcions en cas de que hi hagi errors.

### `Account.java`
 Encarregat de gestionar les dades del compte bancari, modificar el saldo d'aquets i es on es troben les excepcions que salten en cas d'error.

### `Proves.java`

 Arxius anomenats 'AccountTest.java' on s'han realitzat tots els casos posibles a l'hora de intentar retirar/ingresar diners, amb casos d'exit, error per ingresar quantitat negativa o intentar retirar una quantitat major al saldo del compte.
 Aquests arxius es troben a les branques específiques per realitzar proves