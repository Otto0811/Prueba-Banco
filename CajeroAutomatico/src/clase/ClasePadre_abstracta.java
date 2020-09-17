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
    
    String[] usuarios = new String[5];
    int[] contSaldo = new int[5];
    int[] noCuenta = new int[5];

    public void Operaciones() {
        int bandera = 0;
        int opcion = 0;
        
        
        
        //Bucle menú general
        do {
            //Vector para usuario y no. de cuenta
            for (int i = 0; i < 3; i++) {
                        System.out.print("Usuario: ");
                        usuarios[i] = entrada.next();
                        System.out.print("Número de cuenta: ");
                        noCuenta[i] = entrada.nextInt();
            }
            
            //Bucle menú 
            do {
                System.out.println("-----Por favor seleccione una opción-----");
                System.out.println("    1.Deposito de efectivo");
                System.out.println("    2.Retiro de dinero");
                System.out.println("    3.Saldo en la cuenta");
                System.out.println("    4.Clientes");
                System.out.println("    5.Salir");
                
                System.out.println("-----------------------------------------");
                
                System.out.print("-Opción: ");
                opcion = entrada.nextInt();

                if (opcion >= 1 && opcion <= 5) {
                    bandera = 1;
                } else {
                    System.out.println("---------------------------------------");
                    System.out.println("Opcion no funcional, intentelo de nuevo");
                    System.out.println("---------------------------------------");
                }

            } while (bandera == 0);
            
            
            
            if (opcion == 1) {
                
                System.out.println("   ---Deposito--- ");
                
                 ClasePadre_abstracta mensajero=new ClaseHija_Deposito();
                 mensajero.Transaccion();
                 
                 
            } else if (opcion == 2) {
                System.out.println("   ---Retiros--- ");
                
                ClasePadre_abstracta mensajero= new Clasehija_Retiro();
                mensajero.Transaccion();
                
                
            } else if(opcion==3){
                System.out.println("   ---Saldo--- ");
                
                 ClasePadre_abstracta mensajero= new ClaseHija_Consulta();
                mensajero.Transaccion();
                
                } else if(opcion==4){
                System.out.println("   ---Clientes--- ");
                
                 Clientes clientes= new Clientes();
                clientes.Transaccion();
                
                
            } else if(opcion==5){
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
    
    //Metodo Deposito
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
