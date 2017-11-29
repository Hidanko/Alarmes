/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import servidor.Alarm;

public class AlarmCliente {

    Registry myReg;
    AlarmInterface cliente;

    public AlarmCliente() throws Exception {

        myReg = LocateRegistry.getRegistry("127.0.0.1", 1099);
        cliente = (AlarmInterface) myReg.lookup("TESTE");
        System.out.println("Cliente ONLINE");
    }
}
