
package clase;


public class ClaseHija_Consulta extends ClasePadre_abstracta {
    
    @Override
    public void Transaccion(){
        System.out.println("-----------------------------");
        System.out.println("Tu saldo actual es:\t"+getSaldo());
        System.out.println("-----------------------------");
    
    }
}
