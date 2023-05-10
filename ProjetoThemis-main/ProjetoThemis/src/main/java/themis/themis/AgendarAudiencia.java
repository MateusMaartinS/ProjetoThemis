/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themis.themis;

import java.util.*;

/**
 *
 * @author Desenvolvedor Inicial: Victor Fagundes
 *         Analista: Matheus Soares
 *         Desenvolvedor atual: Willyan Junior Ribeiro
 */
public class AgendarAudiencia {

    private int numeroAudiencia;
    public String dataAudiencia;
    public String tribunalJudiciario;
    public String varaJudiciaria;
    public String orgaoJudicial;
    public String nomeEmpregador;
    public String nomeAdvogado;
    public String statusAudiencia;
    public String decisaoAudiencia = "0";

    public AgendarAudiencia(int pNumeroProcesso, int pNumeroAudiencia, String pDataAudiencia, String pTribunal, String pVara, String pOrgaoJudicial, String pNomeEmpregador, String pNomeAdvogado, String pStatus){
        this.numeroAudiencia = pNumeroAudiencia;
        this.dataAudiencia = pDataAudiencia;
        this.tribunalJudiciario = pTribunal;
        this.varaJudiciaria = pVara;
        this.orgaoJudicial = pOrgaoJudicial;
        this.nomeEmpregador = pNomeEmpregador;
        this.nomeAdvogado = pNomeAdvogado;
        this.statusAudiencia = pStatus;
    }
        public void tomarDecisao(int pNumeroAudiencia){
            if (this.decisaoAudiencia.equals("0")) {
                System.out.println("A decisão ainda não foi tomada!");
            } else {
                System.out.println(String.format("A decisão da audiência foi %s ", decisaoAudiencia));
            }
                System.out.println("Audiencia não encontrada!");     
    }    
        public void mostrarAudiencia(int pNumeroAudiencia) {
        if (this.numeroAudiencia == pNumeroAudiencia) {
            System.out.println(String.format("Sua Audiência numero %d está marcada para data: %s", numeroAudiencia, dataAudiencia));
            System.out.println(String.format("O local da sua audiência no tribunal %s na vara %s no Órgão Judicial %s ", tribunalJudiciario, varaJudiciaria, orgaoJudicial));
            System.out.println(String.format("O cliente %s será defendido pelo advogado %s", nomeEmpregador, nomeAdvogado));
            System.out.println(String.format("O status da audiência é %s", statusAudiencia));
        }
    }      
    public void setDecisao(String aDecisao){
        this.decisaoAudiencia = aDecisao;  
    }
    public int getNumeroAudiencia(){
        return this.numeroAudiencia;
    }
}