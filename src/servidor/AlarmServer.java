/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.util.List;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Collection;

public class AlarmServer {

    private List<ServerData> banco = new ArrayList<ServerData>();

    public AlarmServer() throws Exception {

        Registry reg = LocateRegistry.createRegistry(1099);
        Alarm AI = new Alarm(this);

        reg.rebind("TESTE", AI);

        System.out.println("Server ONLINE");

    }

    public boolean adicionarAlerta(long tempo, String descricao) {
        // Se o tempo para o alerta já tiver passado
        if (tempo > System.currentTimeMillis()) {
            return false;
        }
        // Verificar se o servidor já possui um com o mesmo nome
        for (ServerData serverData : banco) {
            if (serverData.getDescricao() == descricao) {
                return false;
            }
        }

        ServerData sd = new ServerData(System.currentTimeMillis(), tempo, descricao);
        banco.add(sd);
        return true;
    }

    public Collection getDescricao() {
        return banco;
    }
}
