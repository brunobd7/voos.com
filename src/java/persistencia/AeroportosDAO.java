/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import Conexao.Conexao;
import java.util.ArrayList;
import java.util.List;
import modelo.Aeroportos;
/**
 *
 * @author Matheus
 */
public class AeroportosDAO extends Conexao {
   
    public void cadastrarAeroporto(Aeroportos a) throws Exception{
        
        OpenDatabase();
        SQL = "INSERT INTO aeroportos(nome, link_localizacao, id_cidade)"
                + "VALUES (?,?,?)"; 
        ps = con.prepareStatement(SQL);
        ps.setString(1, a.getNome());
        ps.setString(2, a.getLink_localizacao());
        ps.setLong(3, a.getId_cidade());
        ps.execute();
        CloseDatabase();
        
    }
    
    public Aeroportos visualizarAeroporto(long id_aeroporto) throws Exception{
        OpenDatabase();
        SQL = "SELECT * FROM aeroportos WHERE id_aeroporto=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_aeroporto);
        rs = ps.executeQuery();
        Aeroportos a = new Aeroportos();
        if(rs.next()){
            a.setId_aeroporto(rs.getLong("id_aeroporto"));
            a.setId_cidade(rs.getLong("id_cidade"));
            a.setLink_localizacao(rs.getString("link_localizacao"));
            a.setNome(rs.getString("nome"));
        }
            CloseDatabase();
            
        return a;   
        
        
    }
    
    public List listarAeroporto() throws Exception{
        OpenDatabase();
        SQL = "SELECT * FROM aeroportos ORDER BY id_aeroporto";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaAeroportos = new ArrayList();
        while(rs.next()){
            Aeroportos a = new Aeroportos();
            a.setId_aeroporto(rs.getLong("id_aeroporto"));
            a.setNome(rs.getString("nome"));
            a.setLink_localizacao(rs.getString("link_localizacao"));
            a.setId_cidade(rs.getLong("id_cidade"));
            
            listaAeroportos.add(a);
        }
        CloseDatabase();
        return listaAeroportos;
    }
    
    public void atualizarAeroporto(Aeroportos a) throws Exception{
        OpenDatabase();
        SQL = "UPDATE aeroportos "
              + "SET nome=?, link_localizacao=?, id_cidade=?"
                + "WHERE id_aeroporto=?";
        ps = con.prepareStatement(SQL);
        //ps.setLong(1, a.getId_aeroporto());
        ps.setString(1, a.getNome());
        ps.setString(2, a.getLink_localizacao());
        ps.setLong(3, a.getId_cidade());
        ps.execute();
        CloseDatabase();
    }
    
    public void excluirAeroporto (long id_aeroporto) throws Exception{
        OpenDatabase();
        SQL = "DELETE FROM aeroportos WHERE id_aeroporto=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_aeroporto); 
        ps.execute();
        CloseDatabase();
    }
    
     
}
