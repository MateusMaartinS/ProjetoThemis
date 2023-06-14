package themis;
import java.util.*;
//Analista: Fernanda Hallman
//Desenvolvedor Criador: Mateus Soares
//Desenvolvedor Atual: João Marcos Contini Tavares Pereira
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
        ArrayList<LembreteProcesso> lembretes = new ArrayList<>();
    //CONSTRUCTOR
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
    //METODOS
        public void verificarData(int pNumLembrete) {
        if (lembretes.isEmpty()) {
                System.out.println("NENHUM LEMBRETE ENCONTRADO.");
        }else{ 
            for (LembreteProcesso lembrete : lembretes) {   
                if (lembrete.numLembrete == pNumLembrete) { 
                System.out.println("SEU PROCESSO NÚMERO  "+ lembrete.numAudiencia +" ESTÁ MARCADA PARA A DATA: " +lembrete.dataAudiencia);
                System.out.println("O LOCAL DA SUA AUDIÊNCIA NO TRIBUNAL "+ lembrete.tribunal +" NA VARA "+ lembrete.vara +" NO ÓRGÃO JUDICIAL " + lembrete.orgaoJudicial);
                System.out.println("O CLIENTE "+ lembrete.nomeEmpregador +" SERÁ DEFENDIDO PELO ADVOGADO "+ lembrete.nomeAdvogado);
                System.out.println("O STATUS DA AUDIÊNCIA É "+ lembrete.status);
                }
            }
        }
        }
        public void gerarLembrete(int pNumAudiencia, String pDataAudiencia, String pTribunal, String pAssunto,
                String pStatus) {
            LembreteProcesso lembrete = new LembreteProcesso(this.numProcesso, pNumAudiencia, this.numLembrete,
                    pDataAudiencia, pTribunal, this.vara, this.nomeEmpregador, this.nomeAdvogado
                    , this.categoria, pAssunto, pStatus);
            lembretes.add(lembrete);
        }
        public void mostrarLembrete(int pNumLembrete) {
            for (LembreteProcesso lembrete : lembretes) {
                if (lembrete.numLembrete == pNumLembrete) {
                    System.out.println("NÚMERO DO PROCESSO: " + lembrete.numProcesso);
                    System.out.println("NÚMERO DA AUDIÊNCIA: " + lembrete.numAudiencia);
                    System.out.println("NÚMERO DO LEMBRETE: " + lembrete.numLembrete);
                    System.out.println("DATA DA AUDIÊNCIA: " + lembrete.dataAudiencia);
                    System.out.println("TRIBUNAL: " + lembrete.tribunal);
                    System.out.println("VARA: " + lembrete.vara);
                    System.out.println("NOME DO EMPREGADOR: " + lembrete.nomeEmpregador);
                    System.out.println("NOME DO ADVOGADO: " + lembrete.nomeAdvogado);
                    System.out.println("CATEGORIA: " + lembrete.categoria);
                    System.out.println("ASSUNTO: " + lembrete.assunto);
                    System.out.println("STATUS: " + lembrete.status);
                    System.out.println("DECISÃO: " + lembrete.decisao);
                    System.out.println("ÓRGÃO JUDICIAL: " + lembrete.orgaoJudicial);
                    System.out.println("-----------------------------------");
                    return;
                }
            }
            System.out.println("LEMBRETE NÃO ENCONTRADO!");
        }
    //OVERLOAD
        public void mostrarLembrete() {
            if (lembretes.isEmpty()) {
                System.out.println("NENHUM LEMBRETE ENCONTRADO.");
                return;
            }
            for (LembreteProcesso lembrete : lembretes) {
                    System.out.println("NÚMERO DO PROCESSO: " + lembrete.numProcesso);
                    System.out.println("NÚMERO DA AUDIÊNCIA: " + lembrete.numAudiencia);
                    System.out.println("NÚMERO DO LEMBRETE: " + lembrete.numLembrete);
                    System.out.println("DATA DA AUDIÊNCIA: " + lembrete.dataAudiencia);
                    System.out.println("TRIBUNAL: " + lembrete.tribunal);
                    System.out.println("VARA: " + lembrete.vara);
                    System.out.println("NOME DO EMPREGADOR: " + lembrete.nomeEmpregador);
                    System.out.println("NOME DO ADVOGADO: " + lembrete.nomeAdvogado);
                    System.out.println("CATEGORIA: " + lembrete.categoria);
                    System.out.println("ASSUNTO: " + lembrete.assunto);
                    System.out.println("STATUS: " + lembrete.status);
                    System.out.println("DECISÃO: " + lembrete.decisao);
                    System.out.println("ÓRGÃO JUDICIAL: " + lembrete.orgaoJudicial);
                    System.out.println("-----------------------------------");
             }
        }
    //GETTERS AND SETTERS
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

