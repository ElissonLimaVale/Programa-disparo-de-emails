/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Elisson Lima Vale
 * @data 19/06/2020
 */
public class Execute {
    public static boolean enviaEmail(Email mail){
        boolean validate;
        System.out.println("executando para o elisson");
        String texto = mail.getEmail();
        String destino = mail.getDestino();
        String titulo = mail.getTitulo();
            String meuEmail = "madrugadazulu@gmail.com";
            String minhaSenha = "#qwaszx1234";
            SimpleEmail email = new SimpleEmail();
            email.setHostName ("smtp.gmail.com");
            email.setSmtpPort(456);
            email.setAuthenticator (new DefaultAuthenticator (meuEmail,minhaSenha));
            email.setSSLOnConnect (true);
        try{
            email.setFrom (meuEmail);
            email.setSubject (titulo);
            email.setMsg (texto);
            email.addTo (destino);
            System.out.println("Executando agora!");
            email.send(); 
            System.out.println("executou");
        validate = true;
        }catch(EmailException ex){
             System.out.println(ex);
        validate = false;
        }
        return validate;
    }
    public static boolean addMultplo(Connection con, MultiploEmail multiplo){
        boolean valida;
        String ServidorEmail = multiplo.getServidorEmail();
        String NomeBanco = multiplo.getNomeBanco();
        String NomeTabela = multiplo.getNomeTabela();
        String CampoEmail = multiplo.getCampoEmail();
        String CampoNome = multiplo.getCampoNome();
        String NomeEmpresa = multiplo.getNomeEmpresa();
        String EmailEmpresa = multiplo.getEmailEmpresa();
        String SenhaEmpresa = multiplo.getSenhaEmpresa();
        try{
        String SQL = "insert into Multiplo(ServidorEmail,Tabela,CampoEmail,CamapoNome,EndereçoEmail,"
            + "ServidorEmail,SenhaEmail,)value(?,?,?,?,?,?)";
            PreparedStatement cadastra = con.prepareStatement(SQL);
            cadastra.setString(1,ServidorEmail);
            cadastra.setString(2,NomeBanco);
            cadastra.setString(3,NomeTabela);
            cadastra.setString(4,CampoEmail);
            cadastra.setString(5,CampoNome);
            cadastra.setString(6,NomeEmpresa);
            cadastra.setString(7,EmailEmpresa);
            cadastra.setString(9,SenhaEmpresa);
            
            cadastra.executeUpdate();
            valida = true;
        
        }catch(Exception ex){
            System.out.println("ERRO: " + ex);
            valida = false;
        }
        return valida;
    }
}
