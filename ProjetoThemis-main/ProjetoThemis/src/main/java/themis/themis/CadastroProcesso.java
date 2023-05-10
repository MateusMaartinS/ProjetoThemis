/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themis.themis;

import java.util.*;

/**
 *
 * @author Analista Victor, Desenvolvedor Matheus Martins
 * Desenvolvedor Atual: Victor Fagundes Ramos
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

    public CadastroProcesso(int pNumProcesso, String pAssunto, String pNomeEmpregador, String pNomeAdvogado, String pStatus, String pDataCadastro, String pTribunal, String pVara, String pCategoria, String pOrgaoJudicial) {
        this.numProcesso = pNumProcesso;
        this.assunto = pAssunto;
        this.nomeEmpregador = pNomeEmpregador;
        this.nomeAdvogado = pNomeAdvogado;
        this.status = pStatus;
        this.dataCadastro = pDataCadastro;
        this.tribunal = pTribunal;
        this.categoria = pCategoria;
        this.orgaoJudicial = pOrgaoJudicial;
    }

    public void verificarDados(int pNumProcesso) {
        if (this.numProcesso == pNumProcesso) {
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
