/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alerta;

import java.util.Timer;

/**
 *
 * @author hidan
 */
public class TimeManager {

    Timer timer;
    Alerta alerta;

    public TimeManager() {
    }
 
    public TimeManager(long seconds, String descricao) {
        alerta = new Alerta(descricao);
        timer = new Timer();
        timer.schedule(alerta, seconds * 1000);
        
    }


}
