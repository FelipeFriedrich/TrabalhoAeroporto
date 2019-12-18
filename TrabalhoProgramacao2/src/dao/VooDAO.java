package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import model.Aeroporto;
import model.Companhia_Aerea;
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
    
    public static void inserir(Voo voo){
        String query = "INSERT INTO Voo "
                + " ( cod_voo,Aero_Partida , Aero_chegada, Cod_Companhia_Aerea, portao ,previsao , situacao , datahora ) VALUES ( "
                +  voo.getIdVoo() + ","
                +  voo.getAero_partida(1) + ","
                +  voo.getAero_chegada(1) + ","
                +  voo.getCompanhia(1)+ ","
                +  "'" + voo.getPortao() + "'," 
                +  "'" + voo.getPrevisao()+ "'," 
                +  "'" + voo.getData_hora()+ "'"
                + " ); ";
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
        String query1 = "SELECT Codigo_aeroporto FROM aeroporto "
                     + "WHERE Nome_Fantasia = '"+ part +"'";
        ResultSet rs1 = Conexao.consultar(query1);
        if( rs1 != null ){
            try {
                while ( rs1.next() )
                var = rs1.getInt( 1 );
            } catch (Exception e) {
                return null;
            }
        }else{
            return null;
        }   
        ResultSet rs;
        List<Voo> lista = new ArrayList<>();
        
        if(tipo == 'p'){
        String query = "SELECT c.cod_voo, c.portao, c.previsao, c.situacao, c.datahora, d.*, g.*,f.*" +
            " FROM voo C" +
            " INNER JOIN aeroporto d ON " +
            " c.Aero_Partida = d.Codigo_Aeroporto " +
            " INNER JOIN aeroporto g ON " +
            " c.Aero_chegada = g.Codigo_Aeroporto" +
            " INNER JOIN companhia_aerea f ON " +
            " c.Cod_Companhia_Aerea = f.Codigo_Companhia "
                     + "WHERE Aero_Partida = " + var;
        rs = Conexao.consultar(query);
        }else{
            String query = "SELECT c.cod_voo, c.portao, c.previsao, c.situacao, c.datahora, d.*, g.*,f.*" +
            " FROM voo C" +
            " INNER JOIN aeroporto d ON " +
            " c.Aero_Partida = d.Codigo_Aeroporto " +
            " INNER JOIN aeroporto g ON " +
            " c.Aero_chegada = g.Codigo_Aeroporto" +
            " INNER JOIN companhia_aerea f ON " +
            " c.Cod_Companhia_Aerea = f.Codigo_Companhia "
             + "WHERE Aero_Chegada = " + var;
        rs = Conexao.consultar(query);
        }
        
            
        if( rs != null ){
            try {
                while ( rs.next() ) {
                    Aeroporto aero_part = new Aeroporto();
                    Companhia_Aerea companhia = new Companhia_Aerea();
                    Aeroporto aero_cheg = new Aeroporto();
                    aero_part.setId(rs.getInt(6));
                    aero_part.setNome_Fantasia(rs.getString(7));
                    aero_part.setRazao_Social(rs.getString(8));
                    aero_part.setMapa(rs.getString(9));
                    aero_part.setCNPJ(rs.getFloat(10));
                    aero_cheg.setId(rs.getInt(11));
                    aero_cheg.setNome_Fantasia(rs.getString(12));
                    aero_cheg.setRazao_Social(rs.getString(13));
                    aero_cheg.setMapa(rs.getString(14));
                    aero_cheg.setCNPJ(rs.getFloat(15));
                    companhia.setId(rs.getInt(16));
                    companhia.setNome_Fantasia(rs.getString(17));
                    companhia.setRazao_Social(rs.getString(18));
                    companhia.setCNPJ(rs.getFloat(19));
                    Voo voo = new Voo();
                    voo.setIdVoo( rs.getInt( 1 ) );
                    voo.setCompanhia(companhia);
                    voo.setAero_partida(aero_part);
                    voo.setAero_chegada(aero_cheg);
                    voo.setPortao(rs.getString( 2 )  );
                    voo.setPrevisao(rs.getString( 3 )  );
                    voo.setSituacao(rs.getString( 4 )  );
                    voo.setData_hora(rs.getString( 5 )  ); 
                    lista.add( voo );
                }
            } catch (Exception e) {
                return null;
            }
        }
        return lista;
    }
   public static Voo getVooById( int idVoo ){
        String query = "SELECT c.cod_voo, c.portao, c.previsao, c.situacao, c.datahora, d.*, g.*,f.*" +
            " FROM voo C" +
            " INNER JOIN aeroporto d ON " +
            " c.Aero_Partida = d.Codigo_Aeroporto " +
            " INNER JOIN aeroporto g ON " +
            " c.Aero_chegada = g.Codigo_Aeroporto" +
            " INNER JOIN companhia_aerea f ON " +
            " c.Cod_Companhia_Aerea = f.Codigo_Companhia "
                + "WHERE cod_voo = " + idVoo;
        ResultSet rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                rs.next();                  
                    Aeroporto aero_part = new Aeroporto();
                    Companhia_Aerea companhia = new Companhia_Aerea();
                    Aeroporto aero_cheg = new Aeroporto();
                    aero_part.setId(rs.getInt(6));
                    aero_part.setNome_Fantasia(rs.getString(7));
                    aero_part.setRazao_Social(rs.getString(8));
                    aero_part.setMapa(rs.getString(9));
                    aero_part.setCNPJ(rs.getFloat(10));
                    aero_cheg.setId(rs.getInt(11));
                    aero_cheg.setNome_Fantasia(rs.getString(12));
                    aero_cheg.setRazao_Social(rs.getString(13));
                    aero_cheg.setMapa(rs.getString(14));
                    aero_cheg.setCNPJ(rs.getFloat(15));
                    companhia.setId(rs.getInt(16));
                    companhia.setNome_Fantasia(rs.getString(17));
                    companhia.setRazao_Social(rs.getString(18));
                    companhia.setCNPJ(rs.getFloat(19));
                    Voo voo = new Voo();
                    voo.setIdVoo( rs.getInt( 1 ));
                    voo.setCompanhia(companhia);
                    voo.setAero_partida(aero_part);
                    voo.setAero_chegada(aero_cheg);
                    voo.setPortao(rs.getString( 2 ));
                    voo.setPrevisao(rs.getString( 3 ));
                    voo.setSituacao(rs.getString( 4 ));
                    voo.setData_hora(rs.getString( 5 ));    
                    return voo;
            } catch (Exception e) {
                return null;
            }
        }else{
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
