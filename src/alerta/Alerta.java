/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alerta;

import java.util.TimerTask;
import javax.swing.JOptionPane;
import view.Tela;

class Alerta extends TimerTask {
    
    String descricao;
    int index;
    Tela tela;
    
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, descricao);
        tela.deletarLinha(index);
        this.cancel();
        
    }

    public Alerta(String descricao, int index, Tela tela) {
        this.descricao = descricao;
        this.index = index;
        this.tela = tela;
    }
}
