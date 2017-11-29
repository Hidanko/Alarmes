/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

// Final para não ser possivel corromper 
public final class ServerData {
    long tempoAtual;
    long tempoFinal;
    String descricao;

    public ServerData(long tempoAtual, long tempoFinal, String descricao) {
        this.tempoAtual = tempoAtual;
        this.tempoFinal = tempoFinal;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getTempoAtual() {
        return tempoAtual;
    }

    public long getTempoFinal() {
        return tempoFinal;
    }
    
    
}
