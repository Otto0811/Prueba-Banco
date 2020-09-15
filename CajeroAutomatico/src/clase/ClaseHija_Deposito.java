/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Otto
 */
public class ClaseHija_Deposito extends ClasePadre_abstracta {
    
    public void Transaccion(){
        
        System.out.print("Cuanto desea depositar: Q");
        //Recibe datos de el deposito
        Deposito();
        
        //Toma los datos de Saldo
        transacciones=getSaldo();
        
        //Actualiza el saldo
        setSaldo(transacciones+deposito);
        
        //Mensaje
        System.out.println("-----------------------------------------");
        System.out.println("Se a depositado en su cuenta: Q"+deposito);
        System.out.println("Su saldo actual es de: Q"+getSaldo());
        System.out.println("-----------------------------------------");
    }
}
