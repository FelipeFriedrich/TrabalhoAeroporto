/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Felipe TI
 */
public class Companhia_Aerea {
    private int id;
    private float CNPJ;
    private String Razao_Social, Nome_Fantasia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(float CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazao_Social() {
        return Razao_Social;
    }

    public void setRazao_Social(String Razao_Social) {
        this.Razao_Social = Razao_Social;
    }

    public String getNome_Fantasia() {
        return Nome_Fantasia;
    }

    public void setNome_Fantasia(String Nome_Fantasia) {
        this.Nome_Fantasia = Nome_Fantasia;
    }
    
}
