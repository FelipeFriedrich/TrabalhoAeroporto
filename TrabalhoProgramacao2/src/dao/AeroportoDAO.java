/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;

/**
 *
 * @author Felipe TI
 */
public class AeroportoDAO {
    public static String getAeroporto (int i){
        String a = "";
        String query = "SELECT Nome_Fantasia from aeroporto where Codigo_Aeroporto = " + i;
        ResultSet rs = Conexao.consultar(query);
        try {
                rs.next();
                a = rs.getString( 1 );
                return a;
        } catch (Exception e) {
            return null;
        }
        
    }
}
