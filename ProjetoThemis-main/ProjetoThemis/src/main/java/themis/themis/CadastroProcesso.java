/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themis.themis;

import java.util.*;

/**
 *
 * @author Analista Victor, Desenvolvedor Matheus Martins
 */
public class CadastroProcesso {

    private int numProcesso;
    private String assunto;
    private String nomeEmpregador;
    private String nomeAdvogado;
    public String status;
    public String dataCadastro;
    public String tribunal;
    public String vara;
    public String categoria;
    public String orgaoJudicial;

    public CadastroProcesso(int aNumProcesso, String aAssunto, String aNomeEmpregador, String aNomeAdvogado, String aStatus, String aDataCadastro, String aTribunal, String aVara, String aCategoria, String aOrgaoJudicial) {
        this.numProcesso = aNumProcesso;
        this.assunto = aAssunto;
        this.nomeEmpregador = aNomeEmpregador;
        this.nomeAdvogado = aNomeAdvogado;
        this.status = aStatus;
        this.dataCadastro = aDataCadastro;
        this.tribunal = aTribunal;
        this.categoria = aCategoria;
        this.orgaoJudicial = aOrgaoJudicial;
    }

    public void verificarDados(int aNumProcesso) {
        if (this.numProcesso == aNumProcesso) {
            System.out.println(String.format("Seu Processo numero %d foi cadastrado no dia: %s", numProcesso, dataCadastro));
            System.out.println(String.format("O local do processo foi cadastrado no tribunal %s na vara %s no Órgão Judicial %s ", tribunal, vara, orgaoJudicial));
            System.out.println(String.format("O cliente %s será defendido pelo advogado %s", nomeEmpregador, nomeAdvogado));
            System.out.println(String.format("O status do Processo é %s", status));

        } else {
            System.out.println("Processo não encontrado");
        }
        
    }

    public int getNumProcesso() {
        return numProcesso;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getNomeEmpregador() {
        return nomeEmpregador;
    }

    public String getNomeAdvogado() {
        return nomeAdvogado;
    }

    public String getStatus() {
        return status;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public String getTribunal() {
        return tribunal;
    }

    public String getVara() {
        return vara;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getOrgaoJudicial() {
        return orgaoJudicial;
    }

}
