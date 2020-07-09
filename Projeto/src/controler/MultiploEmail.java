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
public class MultiploEmail {
    private String NomeBanco;
    private String NomeTabela;
    private String CampoNome;
    private String CampoEmail;
    private String NomeEmpresa;
    private String EmailEmpresa;
    private String SenhaEmpresa;
    private String ServidorEmail;

    public MultiploEmail(){
        
    }

    public String getServidorEmail() {
        return ServidorEmail;
    }

    public void setServidorEmail(String ServidorEmail) {
        this.ServidorEmail = ServidorEmail;
    }

    public String getNomeBanco() {
        return NomeBanco;
    }

    public void setNomeBanco(String NomeBanco) {
        this.NomeBanco = NomeBanco;
    }

    public String getNomeTabela() {
        return NomeTabela;
    }

    public void setNomeTabela(String NomeTabela) {
        this.NomeTabela = NomeTabela;
    }

    public String getCampoNome() {
        return CampoNome;
    }

    public void setCampoNome(String CampoNome) {
        this.CampoNome = CampoNome;
    }

    public String getCampoEmail() {
        return CampoEmail;
    }

    public void setCampoEmail(String CampoEmail) {
        this.CampoEmail = CampoEmail;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String NomeEmpresa) {
        this.NomeEmpresa = NomeEmpresa;
    }

    public String getEmailEmpresa() {
        return EmailEmpresa;
    }

    public void setEmailEmpresa(String EmailEmpresa) {
        this.EmailEmpresa = EmailEmpresa;
    }

    public String getSenhaEmpresa() {
        return SenhaEmpresa;
    }

    public void setSenhaEmpresa(String SenhaEmpresa) {
        this.SenhaEmpresa = SenhaEmpresa;
    }
    
}
