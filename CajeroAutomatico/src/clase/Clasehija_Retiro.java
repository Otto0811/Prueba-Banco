
package clase;


public class Clasehija_Retiro extends ClasePadre_abstracta {
    
    @Override
    public void Transaccion(){
        System.out.print("Monto a retirar: "); 
        Retiro();
        if(retiro<=getSaldo()){
            transacciones=getSaldo();
            setSaldo(transacciones-retiro);
            System.out.println("------------------------------");
            System.out.println("Usted retiro:"+retiro);
            System.out.println("Tu saldo actual es:"+getSaldo());
            System.out.println("------------------------------");
            
        }else{
            System.out.println("------------------");
            System.out.println("Saldo Infuficiente");
            System.out.println("------------------");
        }
    }
}
