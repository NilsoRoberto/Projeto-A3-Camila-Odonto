
package com.mycompany.projeto_camilaodonto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public boolean existe (Usuario usuario) throws Exception{ 
        String sql = "SELECT * FROM area_login WHERE login = ? AND senha  = ?"; 
        
        try (Connection conn = ConexaoBD.obtemConexao(); 
                PreparedStatement ps = conn.prepareStatement(sql)){ 
            ps.setString(1, usuario.getLogin()); 
            ps.setString(2, usuario.getSenha()); 
            
            try (ResultSet rs = ps.executeQuery()){ 
                return rs.next(); 
            } 
        }
    }
}
     
   
    