/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alerta;

import java.util.TimerTask;
import javax.swing.JOptionPane;

class Alerta extends TimerTask {
    
    String descricao;

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, descricao);
        this.cancel(); // E
    }

    public Alerta(String descricao) {
        this.descricao = descricao;
    }
}
