/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import model.Aeroporto;
import model.Companhia_Aerea;

/**
 *
 * @author Felipe TI
 */
public class AeroportoDAO {
    public static Aeroporto getAeroporto(String i){
        
       ResultSet rs;
       Aeroporto aero = new Aeroporto();
       String query = "Select * from Aeroporto where Nome_fantasia = '" +i+"'";
        rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                while ( rs.next() ) {
                    
                    aero.setId(rs.getInt(1));
                    aero.setNome_Fantasia(rs.getString(2));
                    aero.setRazao_Social(rs.getString(3));
                    aero.setCNPJ(rs.getFloat(5));
                    aero.setMapa(rs.getString(4));
                }
            } catch (Exception e) {
                return null;
            }
        }
        return aero;
    }
}
