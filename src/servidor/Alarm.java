package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collection;

public class Alarm extends UnicastRemoteObject implements AlarmInterface {
    
    ArrayList<String> arrayList = new ArrayList<String>();
    
    public Alarm() throws RemoteException {
    }

    @Override
    public Collection getDescricao() throws RemoteException {
        return arrayList ;
    }

}
