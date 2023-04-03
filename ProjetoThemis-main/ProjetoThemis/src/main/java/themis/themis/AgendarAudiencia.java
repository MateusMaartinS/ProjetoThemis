/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themis.themis;

import java.util.*;

/**
 *
 * @author Desenvolvedor Victor Fagundes e Analista Matheus Soares
 */
public class AgendarAudiencia {

    private int numProcesso;
    private int numAudiencia;
    public String dataAudiencia;
    public String tribunal;
    public String vara;
    public String orgaoJudicial;
    public String nomeEmpregador;
    public String nomeAdvogado;
    public String status;
    public String decisao = "0";

    public AgendarAudiencia(int aNumProcesso, int aNumAudiencia, String aDataAudiencia, String aTribunal, String aVara, String aOrgaoJudicial, String aNomeEmpregaodr, String aNomeAdvogado, String aStatus){
        this.numProcesso = aNumProcesso;
        this.numAudiencia = aNumAudiencia;
        this.dataAudiencia = aDataAudiencia;
        this.tribunal = aTribunal;
        this.vara = aVara;
        this.orgaoJudicial = aOrgaoJudicial;
        this.nomeEmpregador = aNomeEmpregaodr;
        this.nomeAdvogado = aNomeAdvogado;
        this.status = aStatus;
    }

    public void verificarAudiencia(int aNumAudiencia) {
        if (this.numAudiencia == aNumAudiencia) {
            System.out.println(String.format("Sua Audiência numero %d está marcada para data: %s", numAudiencia, dataAudiencia));
            System.out.println(String.format("O local da sua audiência no tribunal %s na vara %s no Órgão Judicial %s ", tribunal, vara, orgaoJudicial));
            System.out.println(String.format("O cliente %s será defendido pelo advogado %s", nomeEmpregador, nomeAdvogado));
            System.out.println(String.format("O status da audiência é %s", status));
            if (this.decisao.equals("0")) {
                System.out.println("A decisão ainda não foi tomada!");
            } else {
                System.out.println(String.format("A decisão da audiência foi %s ", decisao));
            }
        } else {
            System.out.println("Audiencia não encontrada!");
        }       
    }    
    public void setDecisao(String aDecisao){
        this.decisao = aDecisao;  
    }
    public int getNumProcesso(){
        return this.numProcesso;
    }
    public int getNumAudiencia(){
        return this.numAudiencia;
    }
    public String getDataAudiencia(){
        return this.dataAudiencia;
    }
    public String getTribunal(){
        return this.tribunal;
    }
    public String getVara(){
        return this.vara;
    }
    public String getOrgaoJudicial(){
        return this.orgaoJudicial;
    }
    public String getNomeEmpregador(){
        return this.nomeEmpregador;
    }
    public String getNomeAdvogado(){
        return this.nomeAdvogado;
    }
    public String getStatus(){
        return this.status;
    }
    public String getDecisao(){
        return this.decisao;
    }
    
    
}
