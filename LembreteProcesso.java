package themis.themis;
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
        if (lembretes.isEmpty()) {
                System.out.println("Nenhum lembrete encontrado.");
        }else{ 
            for (LembreteProcesso lembrete : lembretes) {   
                if (lembrete.numLembrete == pNumLembrete) { 
                System.out.println("Seu proceso numero "+ lembrete.numAudiencia +" está marcada para data: " +lembrete.dataAudiencia);
                System.out.println("O local da sua audiência no tribunal "+ lembrete.tribunal +" na vara "+ lembrete.vara +" no Órgão Judicial " + lembrete.orgaoJudicial);
                System.out.println("O cliente "+ lembrete.nomeEmpregador +" será defendido pelo advogado "+ lembrete.nomeAdvogado);
                System.out.println("O status da audiência é "+ lembrete.status);
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
                    System.out.println("Número do Processo: " + lembrete.numProcesso);
                    System.out.println("Número da Audiência: " + lembrete.numAudiencia);
                    System.out.println("Número do Lembrete: " + lembrete.numLembrete);
                    System.out.println("Data da Audiência: " + lembrete.dataAudiencia);
                    System.out.println("Tribunal: " + lembrete.tribunal);
                    System.out.println("Vara: " + lembrete.vara);
                    System.out.println("Nome do Empregador: " + lembrete.nomeEmpregador);
                    System.out.println("Nome do Advogado: " + lembrete.nomeAdvogado);
                    System.out.println("Categoria: " + lembrete.categoria);
                    System.out.println("Assunto: " + lembrete.assunto);
                    System.out.println("Status: " + lembrete.status);
                    System.out.println("Decisão: " + lembrete.decisao);
                    System.out.println("Órgão Judicial: " + lembrete.orgaoJudicial);
                    System.out.println("-----------------------------------");
                    return;
                }
            }
            System.out.println("Lembrete não encontrado!");
        }
    //Overload
        public void mostrarLembrete() {
            if (lembretes.isEmpty()) {
                System.out.println("Nenhum lembrete encontrado.");
                return;
            }
            for (LembreteProcesso lembrete : lembretes) {
                System.out.println("Número do Processo: " + lembrete.numProcesso);
                System.out.println("Número da Audiência: " + lembrete.numAudiencia);
                System.out.println("Número do Lembrete: " + lembrete.numLembrete);
                System.out.println("Data da Audiência: " + lembrete.dataAudiencia);
                System.out.println("Tribunal: " + lembrete.tribunal);
                System.out.println("Vara: " + lembrete.vara);
                System.out.println("Nome do Empregador: " + lembrete.nomeEmpregador);
                System.out.println("Nome do Advogado: " + lembrete.nomeAdvogado);
                System.out.println("Categoria: " + lembrete.categoria);
                System.out.println("Assunto: " + lembrete.assunto);
                System.out.println("Status: " + lembrete.status);
                System.out.println("Decisão: " + lembrete.decisao);
                System.out.println("Órgão Judicial: " + lembrete.orgaoJudicial);
                System.out.println("-----------------------------------");
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
