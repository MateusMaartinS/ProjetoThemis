package themis.themis;

import java.util.*;

/**
 *
 * @author Fernanda Desenvolvedor, Renan Analista
 */ //Novo desenvolvedor : Nathan
public class FinalizarProcesso {

    Scanner Ler = new Scanner(System.in);

    List<FinalizarProcesso> finalizarProcessos = new ArrayList<>();

    private int numProcesso;
    private int numAudiencia;
    private double remuneracao; //
    private String vaiRecorrer;
    private String sentenca;    //
    private String assunto;
    private String nomeEmpregador;
    private String nomeAdvogado;
    public String tribunal;
    public String vara;
    public String orgaoJudicial;
    public String categoria;

    public String status;

    public boolean gerarRemuneracao;
    public boolean gerarSentenca;

    public FinalizarProcesso() {
    }

    public FinalizarProcesso(int pNumProcesso, int pNumAudiencia, String pTribunal, String pVara,
            String pOrgaoJudicial, String pCategoria, String pAssunto, String pNomeEmpregador, String pNomeAdvogado,
            String pStatus, String pSentenca, double pRemuneracao, String pVaiRecorrer, boolean pGerarRemuneracao,
            boolean pGerarSentenca
    ) {
        this.numProcesso = pNumProcesso;
        this.numAudiencia = pNumAudiencia;
        this.tribunal = pTribunal;
        this.vara = pVara;
        this.orgaoJudicial = pOrgaoJudicial;
        this.categoria = pCategoria;
        this.assunto = pAssunto;
        this.nomeEmpregador = pNomeEmpregador;
        this.nomeAdvogado = pNomeAdvogado;
        this.status = pStatus;
        this.sentenca = pSentenca;
        this.remuneracao = pRemuneracao;
        this.vaiRecorrer = pVaiRecorrer;
        this.gerarRemuneracao = pGerarRemuneracao;
        this.gerarSentenca = pGerarSentenca;

    }

    public void menuFinalizarProcesso() {
        int opcaoMenu = -1;

        while (opcaoMenu != 0) {
            System.out.println("======== MENU FINALIZAR PROCESSO ========");
            System.out.println("=====FINALIZADOS " + finalizarProcessos.size());

            System.out.println("[1] - CADASTRAR PROCESSO PARA FINALIZAR");
            System.out.println("[2] - GERAR REMUNERAÇÃO");
            System.out.println("[3] - GERAR SENTENÇA");
            System.out.println("[4] - FINALIZAR PROCESSO");
            System.out.println("[5] - MOSTRAR DADOS DO PROCESSO");
            System.out.println("[6] - MOSTRAR TODOS PROCESSOS");
            System.out.println("[0] - SAIR");

            int opcao = Ler.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarProcessoParaFinalizar();
                    break;

                case 2:
                    gerarRemuneracao();
                    break;

                case 3:
                    gerarSenteca();
                    break;

                case 4:
                    finalizarProcesso();
                    break;

                case 5:
                    mostrarProcesso();
                    break;
                case 6:

                    mostrarTodosProcessos();
                    break;

                case 0:

                    opcaoMenu = 0;
                    break;
            }
        }
    }

    public void cadastrarProcessoParaFinalizar() {
        finalizarProcessos.add(new FinalizarProcesso());
        for (int i = 0; i < finalizarProcessos.size(); i++) {
            if (finalizarProcessos.get(i).numProcesso == 0) {
                System.out.println("INFORME O NUMERO DO PROCESSO QUE QUER FINALIZAR");
                finalizarProcessos.get(i).numProcesso = Ler.nextInt();

                System.out.println("AUDIÊNCIA : ");
                finalizarProcessos.get(i).numAudiencia = Ler.nextInt();

                System.out.println("VAI RECORRER ? :");
                finalizarProcessos.get(i).vaiRecorrer = Ler.next();

                System.out.println("ASSUNTO : ");
                finalizarProcessos.get(i).assunto = Ler.next();

                System.out.println("NOME DO EMPREGADOR : ");
                finalizarProcessos.get(i).nomeEmpregador = Ler.next();

                System.out.println("NOME DO ADVODGADO : ");
                finalizarProcessos.get(i).nomeAdvogado = Ler.next();

                System.out.println("DO TRIBUNAL : ");
                finalizarProcessos.get(i).tribunal = Ler.next();

                System.out.println("DA VARA : ");
                finalizarProcessos.get(i).vara = Ler.next();

                System.out.println("ORGÃO JUDICIAL : ");
                finalizarProcessos.get(i).orgaoJudicial = Ler.next();

                System.out.println("DA CATEGORIA : ");
                finalizarProcessos.get(i).categoria = Ler.next();

                finalizarProcessos.get(i).gerarRemuneracao = false;
                finalizarProcessos.get(i).gerarSentenca = false;

                System.out.println("O PROXIMO PASSO É GERAR REMUNERA E SENTENÇA");

                i = finalizarProcessos.size();
                break;

            } 
            
            
            
        }

    }

    public void gerarRemuneracao() {
        System.out.println("INFORME O NUMERO DO PROCESSO");
        int valor = Ler.nextInt();

        for (int i = 0; i < finalizarProcessos.size(); i++) {
            if (finalizarProcessos.get(i).numProcesso == valor) {

                if (finalizarProcessos.get(i).gerarRemuneracao == false) {

                    finalizarProcessos.get(i).remuneracao = 5.500;

                    finalizarProcessos.get(i).gerarRemuneracao = true;
                    System.out.println("REMUNERAÇÃO GERADA, VÁ PARA O PROXIMO PASSO");
                    i = finalizarProcessos.size();
                    break;
                } else {
                    System.out.println("JÁ FOI GERADO UMA REMUNERAÇÃO, VÁ PARA O PROXIMO PASSO");
                    break;

                }

            }
            break;
        }

    }

    public void gerarSenteca() {
        System.out.println("INFORME O NUMERO DO PROCESSO");
        int valor = Ler.nextInt();

        for (int i = 0; i < finalizarProcessos.size(); i++) {
            if (finalizarProcessos.get(i).numProcesso == valor) {

                if (finalizarProcessos.get(i).gerarSentenca == false) {
                    System.out.println("DEFINA UMA SENTENÇA :");
                    finalizarProcessos.get(i).sentenca = Ler.next();

                    finalizarProcessos.get(i).gerarSentenca = true;

                    System.out.println("SENTENÇA GERADA, VÁ PARA O PROXIMO PASSO");
                    i = finalizarProcessos.size();
                    break;
                } else {
                    System.out.println("JÁ FOI GERADO UMA SENTENÇA, VÁ PARA O PROXIMO PASSO");
                    break;

                }

            }
            break;
        }

    }

    public void finalizarProcesso() {
        System.out.println("INFORME O NUMERO DO PROCESSO");
        int valor = Ler.nextInt();

        for (int i = 0; i < finalizarProcessos.size(); i++) {
            if (finalizarProcessos.get(i).numProcesso == valor) {
                if (finalizarProcessos.get(i).gerarRemuneracao == true) {
                    if (finalizarProcessos.get(i).gerarSentenca == true) {

                        System.out.println("O PROCESSO FOI FINALIZADO");
                        finalizarProcessos.get(i).status = "FINALIZADO";
                        break;
                    }
                }
            }
            break;
        }

    }

    public void mostrarProcesso() {
        System.out.println("INFORME O NUMERO DO PROCESSO");
        int valor = Ler.nextInt();

        for (int i = 0; i < finalizarProcessos.size(); i++) {
            if (finalizarProcessos.get(i).numProcesso == valor) {

                System.out.println("NUMERO DO PROCESSO " + finalizarProcessos.get(i).numProcesso);
                System.out.println("AUDIÊNCIA : " + finalizarProcessos.get(i).numAudiencia);
                System.out.println("VAI RECORRER :" + finalizarProcessos.get(i).vaiRecorrer);
                System.out.println("ASSUNTO : " + finalizarProcessos.get(i).assunto);
                System.out.println("NOME DO EMPREGADOR : " + finalizarProcessos.get(i).nomeEmpregador);
                System.out.println("NOME DO ADVODGADO : " + finalizarProcessos.get(i).nomeAdvogado);
                System.out.println("TRIBUNAL : " + finalizarProcessos.get(i).tribunal);
                System.out.println("VARA : " + finalizarProcessos.get(i).vara);
                System.out.println("ORGÃO JUDICIAL : " + finalizarProcessos.get(i).orgaoJudicial);
                System.out.println("CATEGORIA : " + finalizarProcessos.get(i).categoria);

                System.out.println("REMUNERAÇÃO : " + finalizarProcessos.get(i).remuneracao);
                System.out.println("SENTENÇA : " + finalizarProcessos.get(i).sentenca);
                System.out.println("STATUS : " + finalizarProcessos.get(i).status);

                i = finalizarProcessos.size();
                break;
            }
        }
    }

    public void mostrarTodosProcessos() {
        for (int i = 0; i < finalizarProcessos.size(); i++) {

            System.out.println("NUMERO DO PROCESSO " + finalizarProcessos.get(i).numProcesso);
            System.out.println("AUDIÊNCIA : " + finalizarProcessos.get(i).numAudiencia);
            System.out.println("VAI RECORRER :" + finalizarProcessos.get(i).vaiRecorrer);
            System.out.println("ASSUNTO : " + finalizarProcessos.get(i).assunto);
            System.out.println("NOME DO EMPREGADOR : " + finalizarProcessos.get(i).nomeEmpregador);
            System.out.println("NOME DO ADVODGADO : " + finalizarProcessos.get(i).nomeAdvogado);
            System.out.println("TRIBUNAL : " + finalizarProcessos.get(i).tribunal);
            System.out.println("VARA : " + finalizarProcessos.get(i).vara);
            System.out.println("ORGÃO JUDICIAL : " + finalizarProcessos.get(i).orgaoJudicial);
            System.out.println("CATEGORIA : " + finalizarProcessos.get(i).categoria);

            System.out.println("REMUNERAÇÃO : " + finalizarProcessos.get(i).remuneracao);
            System.out.println("SENTENÇA : " + finalizarProcessos.get(i).sentenca);
            System.out.println("STATUS : " + finalizarProcessos.get(i).status);

        }
    }

    //Gets and Setters
    public int getNumProcesso() {
        return numProcesso;
    }

    public void setNumProcesso(int numProcesso) {
        this.numProcesso = numProcesso;
    }

    public int getNumAudiencia() {
        return numAudiencia;
    }

    public void setNumAudiencia(int numAudiencia) {
        this.numAudiencia = numAudiencia;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public String getVaiRecorrer() {
        return vaiRecorrer;
    }

    public void setVaiRecorrer(String vaiRecorrer) {
        this.vaiRecorrer = vaiRecorrer;
    }

    public String getSentenca() {
        return sentenca;
    }

    public void setSentenca(String sentenca) {
        this.sentenca = sentenca;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getNomeEmpregador() {
        return nomeEmpregador;
    }

    public void setNomeEmpregador(String nomeEmpregador) {
        this.nomeEmpregador = nomeEmpregador;
    }

    public String getNomeAdvogado() {
        return nomeAdvogado;
    }

    public void setNomeAdvogado(String nomeAdvogado) {
        this.nomeAdvogado = nomeAdvogado;
    }

}
