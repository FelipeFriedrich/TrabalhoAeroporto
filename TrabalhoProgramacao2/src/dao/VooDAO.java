package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Voo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe TI
 */
public class VooDAO {
    
    /*public static void inserir(Voo cat){
        String query = "INSERT INTO categorias "
                + " ( nome ) VALUES ( "
                + " '" + cat.getIdVoo() + "'  ); ";
        Conexao.executar( query );
    }
    
    /*public static void editar(Voo cat){
        String query = "UPDATE categorias SET "
                + " nome =  '" + cat.getNome() + "' "
                + " WHERE id = " + cat.getId();
        Conexao.executar( query );
    }
    
    public static void excluir(Voo cat){
        String query = "DELETE FROM categorias "
                    + " WHERE id = " + cat.getId();
        Conexao.executar( query );
    }
    */
    public static List<Voo> getVoosAeroporto(String part, char tipo){
        int var = 0;
        String query1 = "SELECT Codigo_aeroporto, FROM aeroporto "
                     + "WHERE Nome_Fantasia = '"+ part +"'";
        ResultSet rs1 = Conexao.consultar(query1);
        if( rs1 != null ){
            try {
                while ( rs1.next() )
                var = rs1.getInt( 1 );
            } catch (Exception e) {
                return null;
            }
        }   
        ResultSet rs;
        List<Voo> lista = new ArrayList<>();
        
        if(tipo == 'p'){
            String query = "SELECT `cod_voo`, `Cod_Companhia_Aerea`, `Aero_Partida`, `Aero_Chegada`, `portao`, `previsao`, `situacao`, `datahora` FROM `voo` "
                     + "WHERE Aero_Partida = " + var;
        rs = Conexao.consultar(query);
        }else{
            String query = "SELECT `cod_voo`, `Cod_Companhia_Aerea`, `Aero_Partida`, `Aero_Chegada`, `portao`, `previsao`, `situacao`, `datahora` FROM `voo` "
                     + "WHERE Aero_Chegada = " + var;
        rs = Conexao.consultar(query);
        }
        
        if( rs != null ){
            try {
                while ( rs.next() ) {                    
                    Voo voo = new Voo();
                    voo.setIdVoo( rs.getInt( 1 ) );
                    voo.setCompanhia( rs.getInt( 2 ) );
                    voo.setAero_partida(rs.getInt( 3 )  );
                    voo.setAero_chegada(rs.getInt( 4 )  );
                    voo.setPortao(rs.getString( 5 )  );
                    voo.setPrevisao(rs.getString( 6 )  );
                    voo.setSituacao(rs.getString( 7 )  );
                    voo.setData_hora(rs.getString( 8 )  ); 
                    lista.add( voo );
                }
            } catch (Exception e) {
                return null;
            }
        }
        return lista;
    }
    
    public static Voo getVooById( int idVoo ){
        String query = "SELECT `cod_voo`, `Cod_Companhia_Aerea`, `Aero_Partida`, `Aero_Chegada`, `portao`, `previsao`, `situacao`, `datahora` FROM `voo` "
                + "WHERE cod_voo = " + idVoo;
        ResultSet rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                rs.next();                  
                    Voo voo = new Voo();
                    voo.setIdVoo( rs.getInt( 1 ) );
                    voo.setId_companhia( rs.getInt( 2 ) );
                    voo.setAero_partida(rs.getInt( 3 )  );
                     voo.setAero_chegada(rs.getInt( 4 )  );
                     voo.setPortao(rs.getString( 5 )  );
                     voo.setPrevisao(rs.getString( 6 )  );
                     voo.setSituacao(rs.getString( 7 )  );
                     voo.setData_hora(rs.getString( 8 )  );    
                    return voo;
            } catch (Exception e) {
                return null;
            }
        }else{
            return null;
        }
    }
    
    public static String getCompanhia (int i){
        String a = "";
        String query = "SELECT Nome_Fantasia from companhia_aerea where Codigo_Companhia = " + i;
        ResultSet rs = Conexao.consultar(query);
        try {
                rs.next();
                a = rs.getString( 1 );
                return a;
        } catch (Exception e) {
            return null;
        }
        
    }
    
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
    
    public static int getPassagem (String i){
        int a = 0;
        String query = "SELECT codigo_voo from passagem where passagem = '" + i+"'";
        ResultSet rs = Conexao.consultar(query);
        try {
                rs.next();
                a = rs.getInt( 1 );
                return a;
        } catch (Exception e) {
            return 0;
        }
        
    }
}
