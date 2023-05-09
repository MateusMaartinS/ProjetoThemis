//Analista: Fernanda Hallman
//Desenvolvedor Criador: Mateus Soares
//Desenvolvedor Atual: João Marcos Contini Tavares Pereira
package themis.themis;
import java.util.*;
public class LembreteProcesso {
    private int numProcesso;
    private int numAudiencia;
    private int numLembrete;
    public String dataAudiencia;
    public String tribunal;
    public String vara;
    public String nomeEmpregador;
    public String nomeAdvogado;
    public String categoria;
    public String assunto;
    public String status;
    public String decisao;
    public String orgaoJudicial;
//Constructor
    public LembreteProcesso(int pNumProcesso, int pNumAudiencia, int pNumLembrete, String pDataAudiencia, String pTribunal, String pVara,
            String pNomeEmpregador, String pNomeAdvogado, String pCategoria, String pAssunto, String pStatus) {
        this.numProcesso = pNumProcesso;
        this.numAudiencia = pNumAudiencia;
        this.numLembrete = pNumLembrete;
        this.dataAudiencia = pDataAudiencia;
        this.tribunal = pTribunal;
        this.vara = pVara;
        this.nomeEmpregador = pNomeEmpregador;
        this.nomeAdvogado = pNomeAdvogado;
        this.categoria = pCategoria;
        this.assunto = pAssunto;
        this.status = pStatus;
    }
//Metodos
    public void verificarData(int pNumLembrete) {
        if (this.numLembrete == pNumLembrete) {
            System.out.println(String.format("Seu proceso numero %d está marcada para data: %s", numAudiencia, dataAudiencia));
            System.out.println(String.format("O local da sua audiência no tribunal %s na vara %s no Órgão Judicial %s ",tribunal, vara, orgaoJudicial));
            System.out.println(String.format("O cliente %s será defendido pelo advogado %s", nomeEmpregador, nomeAdvogado));
            System.out.println(String.format("O status da audiência é %s", status));
            if (this.decisao.equals("0")) {System.out.println("A decisão ainda não foi tomada!");
            } else {
                System.out.println(String.format("A decisão da audiência foi %s ", decisao));
            }
        } else {
            System.out.println("Audiencia não encontrada!");
        }
    }
    public void gerarLembrete(int pNumAudiencia, String pDataAudiencia, String pTribunal, String pAssunto, String pStatus) {
        this.numAudiencia = pNumAudiencia;
        this.dataAudiencia = pDataAudiencia;
        this.tribunal = pTribunal;
        this.assunto = pAssunto;
        this.status = pStatus;
    }
    public void mostrarLembrete(int pNumLembrete) {
        if (this.numLembrete == pNumLembrete) {
            System.out.println(String.format("Seu proceso numero %d está marcada para data: %s", numAudiencia, dataAudiencia));
            System.out.println(String.format("O local da sua audiência no tribunal %s na vara %s no Órgão Judicial %s ",tribunal, vara, orgaoJudicial));
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
//Getters and Setters
    public int getNumProcesso() {
        return this.numProcesso;
    }
    public int getNumAudiencia() {
        return this.numAudiencia;
    }
    public int getNumLembrete() {
        return this.numLembrete;
    }
    public void setNumProcesso(int pProcesso) {
        this.numProcesso = pProcesso;
    }
    public void setNumAudiencia(int pAudiencia) {
        this.numAudiencia = pAudiencia;
    }
    public void setNumLembrete(int pLembrete) {
        this.numLembrete = pLembrete;
    }
}