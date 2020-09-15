
package clase;


public class ClaseHija_Consulta extends ClasePadre_abstracta {
    
    //Mensaje de Saldo
    @Override
    public void Transaccion(){
        System.out.println("-----------------------------");
        System.out.println("Su saldo actual es de: Q"+getSaldo());
        System.out.println("-----------------------------");
    
    }
}
