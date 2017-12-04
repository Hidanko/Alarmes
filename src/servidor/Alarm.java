package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collection;

public class Alarm extends UnicastRemoteObject implements AlarmInterface {

    AlarmServer as;

    public Alarm(AlarmServer as) throws RemoteException {
        this.as = as;
    }

    @Override
    public Collection getDescricao() throws RemoteException {
        return as.getDescricao();
    }

}
