/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controler;

/**
 *
 * @author Elisson Lima Vale
 * @data 24/06/2020
 */
public class DBDados {
    private String Banco;
    private String Server;
    private String Usuario;
    private String Senha;
    public DBDados(){
        
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getServer() {
        return Server;
    }

    public void setServer(String Server) {
        this.Server = Server;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuaruo) {
        this.Usuario = Usuaruo;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
}
