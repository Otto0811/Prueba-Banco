
package clase;


public class Clasehija_Retiro extends ClasePadre_abstracta {
    
    @Override
    public void Transaccion(){
        System.out.print("Monto a retirar: Q"); 
        //Recibe datos de el retiro
        Retiro();
        
        
        if(retiro<=getSaldo()){
            //Recolecta la información de Saldo
            transacciones=getSaldo();
            
            //Actualiza el Saldo
            setSaldo(transacciones-retiro);
            
            //Mensaje aprobado
            System.out.println("------------------------------");
            System.out.println("Usted retiro: Q"+retiro);
            System.out.println("Su saldo actual es de: Q"+getSaldo());
            System.out.println("------------------------------");
            
            //Mensaje negación
        }else{
            System.out.println("------------------");
            System.out.println("Saldo Infuficiente");
            System.out.println("------------------");
        }
        
    }
    
}
