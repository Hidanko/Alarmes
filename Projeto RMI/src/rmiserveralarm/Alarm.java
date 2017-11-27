package rmiserveralarm;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Alarm extends UnicastRemoteObject implements AlarmInterface {

    public Alarm() throws RemoteException {
    }

    @Override
    public String getDescricao() throws RemoteException {
        return "ta funcionando";
    }

}
