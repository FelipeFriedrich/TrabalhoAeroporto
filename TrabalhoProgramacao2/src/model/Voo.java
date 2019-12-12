/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Felipe TI
 */
public class Voo {

    private int idVoo;
    public Companhia_Aerea companhia;
    public Aeroporto aero_partida, aero_chegada;
    private String cod_passagem, portao, previsao, situacao, data_hora;

    public int getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(int idVoo) {
        this.idVoo = idVoo;
    }

    public String getCod_passagem() {
        return cod_passagem;
    }

    public void setCod_passagem(String cod_passagem) {
        this.cod_passagem = cod_passagem;
    }

    public String getPortao() {
        return portao;
    }

    public void setPortao(String portao) {
        this.portao = portao;
    }

    public String getPrevisao() {
        return previsao;
    }

    public void setPrevisao(String previsao) {
        this.previsao = previsao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public Companhia_Aerea getCompanhia() {
        return companhia;
    }

    public void setCompanhia(Companhia_Aerea companhia) {
        this.companhia = companhia;
    }

    public Aeroporto getAero_partida() {
        return aero_partida;
    }

    public void setAero_partida(Aeroporto aero_partida) {
        this.aero_partida = aero_partida;
    }

    public Aeroporto getAero_chegada() {
        return aero_chegada;
    }

    public void setAero_chegada(Aeroporto aero_chegada) {
        this.aero_chegada = aero_chegada;
    }
    

}
