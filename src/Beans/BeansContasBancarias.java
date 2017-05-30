/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Date;

/**
 *
 * @author joels
 */
public class BeansContasBancarias {
    private int cod;
    private String correntista;
    private String tipodeconta;
    private String banco;
    private String tcard;
    private String nomecard;
    private String numcard;
    private String agencont;
    private Date venccarad;
    private String cvvcard;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public String getTipodeconta() {
        return tipodeconta;
    }

    public void setTipodeconta(String tipodeconta) {
        this.tipodeconta = tipodeconta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTcard() {
        return tcard;
    }

    public void setTcard(String tcard) {
        this.tcard = tcard;
    }

    public String getNomecard() {
        return nomecard;
    }

    public void setNomecard(String nomecard) {
        this.nomecard = nomecard;
    }

    public String getNumcard() {
        return numcard;
    }

    public void setNumcard(String numcard) {
        this.numcard = numcard;
    }

    public Date getVenccarad() {
        return venccarad;
    }

    public void setVenccarad(Date venccarad) {
        this.venccarad = venccarad;
    }

    public String getCvvcard() {
        return cvvcard;
    }

    public void setCvvcard(String cvvcard) {
        this.cvvcard = cvvcard;
    }

    public String getAgencont() {
        return agencont;
    }

    public void setAgencont(String agencont) {
        this.agencont = agencont;
    }
    
}
