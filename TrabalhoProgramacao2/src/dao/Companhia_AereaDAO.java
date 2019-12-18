/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Companhia_Aerea;


/**
 *
 * @author 631910142
 */
public class Companhia_AereaDAO {
    
     public static List<Companhia_Aerea> getCompanhias(){
        
        ResultSet rs;
        List<Companhia_Aerea> lista = new ArrayList<>();
        
       String query = "Select * from Companhia_aerea";
        rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                while ( rs.next() ) {
                    Companhia_Aerea companhia = new Companhia_Aerea();
                    companhia.setId(rs.getInt(1));
                    companhia.setNome_Fantasia(rs.getString(2));
                    companhia.setRazao_Social(rs.getString(3));
                    companhia.setCNPJ(rs.getFloat(4));
                    lista.add( companhia );
                }
            } catch (Exception e) {
                return null;
            }
        }
        return lista;
    }
     
     public static Companhia_Aerea getCompanhia(String i){
        
       ResultSet rs;
       Companhia_Aerea companhia = new Companhia_Aerea();
       String query = "Select * from Companhia_aerea where Nome_fantasia = '" +i+"'";
        rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                while ( rs.next() ) {
                    
                    companhia.setId(rs.getInt(1));
                    companhia.setNome_Fantasia(rs.getString(2));
                    companhia.setRazao_Social(rs.getString(3));
                    companhia.setCNPJ(rs.getFloat(4));
                }
            } catch (Exception e) {
                return null;
            }
        }
        return companhia;
    }
}
