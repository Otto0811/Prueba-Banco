/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.Scanner;

public abstract class ClasePadre_abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int opcion = 0;
        do {

            do {
                System.out.println("Porfavor selecione una opcion");
                System.out.println("    1.Deposito de efectivo");
                System.out.println("    2.Retiro de dinero");
                System.out.println("    3.Saldo en la cuenta");
                System.out.println("    4.Salir");
                opcion = entrada.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("---------------------------------------");
                    System.out.println("Opcion no funcional, intentelo de nuevo");
                    System.out.println("---------------------------------------");
                }

            } while (bandera == 0);
            if (opcion == 1) {
                 ClasePadre_abstracta mensajero=new ClaseHija_Deposito();
                 mensajero.Transaccion();
            } else if (opcion == 2) {
                ClasePadre_abstracta mensajero= new Clasehija_Retiro();
                mensajero.Transaccion();
            } else if(opcion==3){
                 ClasePadre_abstracta mensajero= new ClaseHija_Consulta();
                mensajero.Transaccion();
            } else if(opcion==4){
                System.out.println("---------------------");
                System.out.println("Gracias vuelva pronto"); 
                System.out.println("---------------------");
                bandera=2;
            }
            

        } while (bandera != 2);
    }
    
    //Metodo Retiro
    public void Retiro(){
        retiro= entrada.nextInt();
    }
    
    //Metdod Depostio
    public void Deposito(){
        deposito=entrada.nextInt();
    }
    public abstract void Transaccion();
    
    //setter y getter

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
       this.saldo= saldo;
    }
    
    

}
