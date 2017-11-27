/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiserveralarm.Alarm;

/**
 *
 * @author hidan
 */
public class AlarmCliente {
    public static void main(String[] args) throws Exception {
        Registry myReg = LocateRegistry.getRegistry("127.0.0.1", 1099);
        
        Alarm cliente = (Alarm)myReg.lookup("TESTE");
        
        System.out.println("Cliente ONLINE\n"+cliente.getDescricao() );
    }
}
