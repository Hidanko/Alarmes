/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiserveralarm.Alarm;
import rmiserveralarm.AlarmInterface;

/**
 *
 * @author hidan
 */
public class AlarmServer {

    public static void main(String[] args) throws Exception {
 
            Registry reg = LocateRegistry.createRegistry(1099);
            Alarm AI = new Alarm();

            reg.rebind("TESTE", AI);

            System.out.println("Server ONLINE");

    }
}
