package alerta;

import java.util.Timer;
import view.Tela;


public class TimeManager {

    Timer timer;
    Alerta alerta;
    Tela tela;
    
 
    public TimeManager(Tela tela, long seconds, String descricao, int index) {
        alerta = new Alerta(descricao, index, tela);
        timer = new Timer();
        timer.schedule(alerta, seconds * 1000);
        
        
        
    }


}
