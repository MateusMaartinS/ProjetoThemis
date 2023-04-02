/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themis.themis;

import java.util.*;

/**
 *
 * @author Fernanda e Matheus Soares
 */

public class LembreteProcesso {
    private int numProcesso;
    private int numAudiencia;
    private int numLembrete;
    public Date dataAudiencia;
    public String tribunal;
    public String vara;
    public String nomeEmpregador;
    public String nomeAdvogado;
    public String categoria;
    public String assunto;
    public String status;

    public LembreteProcesso(int aNumProcesso,
        int aNumAudiencia,
        int aNumLembrete,
        Date aDataAudiencia,
        String aTribunal,
        String aVara,
        String aNomeEmpregador,
        String aNomeAdvogado,
        String aCategoria,
        String aAssunto,
        String aStatus){
            this.numProcesso = aNumProcesso;
            this.numAudiencia = aNumAudiencia;
            this.numLembrete = aNumLembrete;
            this.dataAudiencia = aDataAudiencia;
            this.tribunal = aTribunal;
            this.vara = aVara;
            this.nomeEmpregador = aNomeEmpregador;
            this.nomeAdvogado = aNomeAdvogado;
            this.categoria = aCategoria;
            this.assunto = aAssunto;
            this.status = aStatus;
    }

    public void verificarData(int aNumLembrete){
        if (this.numLembrete == aNumLembrete) {
            System.out.println(String.format("Seu proceso numero %d está marcada para data: %s", numAudiencia, dataAudiencia));
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
    public void gerarLembrete(int aNumAudiencia, Date aDataAudiencia , String aTribunal, String aAssunto, String aStatus){
        this.numAudiencia = aNumAudiencia;
        this.dataAudiencia = aDataAudiencia;
        this.tribunal = aTribunal;
        this.assunto = aAssunto;
        this.status = aStatus;
    }
    public void mostrarLembrte(int aNumLembrete){
               if (this.numLembrete == aNumLembrete) {
            System.out.println(String.format("Seu proceso numero %d está marcada para data: %s", numAudiencia, dataAudiencia));
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
    public int getNumProcesso(){
        return this.numProcesso
    }
public int getNumAudiencia(){
    return this.numAudiencia
}
public int getNumLembrete(){
    return this.numLembrete
}
public Date getDataAudiencia(){
    return this.dataAudiencia
}
public String getTribunal(){
    return this.tribunal
}
public String getVara(){
    return this.vara
}
public String getNomeEmpregador(){
    return this.nomeEmpregador
}
public String getNomeAdvogado(){
    return this.nomeAdvogado
}
public String getCategoria(){
    return this.categoria
}
public String getAssunto(){
    return this.assunto
}
public String getStatus(){
    return this.status
}
}
