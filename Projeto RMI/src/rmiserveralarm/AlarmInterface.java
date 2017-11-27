/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserveralarm;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hidan
 */
public interface AlarmInterface extends Remote {

    public String getDescricao() throws RemoteException;
}
