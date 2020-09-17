
package clase;


public class Clientes extends ClasePadre_abstracta {

    @Override
    public void Transaccion() {
        System.out.println("---Clientes---");
         for (int i = 0; i < usuarios.length; i++) {
                    System.out.println("Usuario: " + usuarios[i] + " / Número de cuenta: " + noCuenta[i] + " / Saldo: " + getSaldo());
                    System.out.println("--------------------------------------");
                    }
    }
    
}
