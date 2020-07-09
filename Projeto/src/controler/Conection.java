/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Elisson Lima Vale
 * @data 19/06/2020
 */
public class Conection {
    public static Connection getConect(DBDados DB){
        String Banco = DB.getBanco();
        String Servidor = DB.getServer();
        String Usuario = DB.getUsuario();
        String Senha = DB.getSenha();
        if(Banco.equals("Padrão") && Servidor.equals("Padrão") || Banco.equals("") && Servidor.equals("")){
            Banco = "EnviaEmail";
            Servidor = "localhost:3306";
        }
        if(Usuario.equals("Padrão") && Senha.equals("Padrão") || Usuario.equals("padrão") && Senha.equals("padrão")){
            Usuario = "root";
            Senha = "";
        }
        java.sql.Connection conecta = null;
        final String driver = "com.mysql.jdbc.Driver";
        final String host = "jdbc:mysql://"+Servidor+"/"+Banco;
        try {
            Class.forName(driver); 
            conecta = DriverManager.getConnection(host,Usuario,Senha);
            return conecta;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro: " + ex);
            return null;
        }
    }
    public static boolean addBase(Connection con, DBDados base) throws SQLException{
        
        String Banco = base.getBanco();
        String Servidor = base.getServer();
        String Usuario = base.getUsuario();
        String Senha = base.getSenha();
        try{
            String SQL = "insert into Bancos(servidor,banco,usuario,senha) values (?,?,?,?)";
            PreparedStatement inserir = con.prepareStatement(SQL);
            inserir.setString(1,Servidor);
            inserir.setString(2,Banco);
            inserir.setString(3,Usuario);
            inserir.setString(4,Senha);
            inserir.executeUpdate();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro :" + ex);
            return false;
        }
    }
}
