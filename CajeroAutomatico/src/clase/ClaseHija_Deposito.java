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
        System.out.print("Cuanto deseas depositar:");
        Deposito();
        
        transacciones=getSaldo();
        setSaldo(transacciones+deposito);
        System.out.println("------------------");
        System.out.println("Deposistaste en tu cuenta:"+deposito);
        System.out.println("Tu saldo actual es:"+getSaldo());
        System.out.println("------------------");
    }
}
