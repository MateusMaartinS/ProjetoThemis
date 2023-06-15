package themis.themis;

import java.util.*;

/**
 *
 * @author Fernanda Desenvolvedor, Renan Analista
 */ //Novo desenvolvedor : Nathan
public class FinalizarProcesso extends ComentariosProcessos {

    Scanner Ler = new Scanner(System.in);

    List<FinalizarProcesso> finalizarProcessos = new ArrayList<>();

    private double remuneracao;
    private String vaiRecorrer;
    private String sentenca;
    private boolean gerarRemuneracao;
    private boolean gerarSentenca;

    public FinalizarProcesso(double pRemuneracao, String pVaiRecorrer, String pSentenca, boolean pGerarRemuneracao, boolean pGerarSentenca, int numAudiencia, String dataAudiencia, String comentarios, String dataComentario, int pNumProcesso, String pAssunto, String pNomeEmpregador, String pNomeAdvogado,
            String pStatus, String pDataCadastro, String pTribunal, String pVara, String pCategoria, String pOrgaoJudicial) {
        super(numAudiencia, dataAudiencia, comentarios, dataComentario, pNumProcesso, pAssunto, pNomeEmpregador, pNomeAdvogado, pStatus, pDataCadastro, pTribunal, pVara, pCategoria, pOrgaoJudicial);

        this.remuneracao = pRemuneracao;
        this.vaiRecorrer = pVaiRecorrer;
        this.sentenca = pSentenca;
        this.gerarRemuneracao = pGerarRemuneracao;
        this.gerarSentenca = pGerarSentenca;

    }

    public void menuFinalizarProcesso() {
        int opcaoMenu = -1;

        while (opcaoMenu != 0) {
            System.out.println("=========================================");
            System.out.println("======== MENU FINALIZAR PROCESSO ========");
            System.out.println("===== FINALIZADOS " + finalizarProcessos.size());
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
        finalizarProcessos.add(new FinalizarProcesso(0, "", "", false, false, 0, "", "", "", 0, "", "", "",
                "", "", "", "", "", ""));

        for (int i = 0; i < finalizarProcessos.size(); i++) {
            if (finalizarProcessos.get(i).getNumProcesso() == 0) {
                System.out.println("===== QUANTOS PROCESSOS FORAM FINALIZADOS: " + finalizarProcessos.size() + " =====");
                System.out.println("EM QUAL PROCESSO VOCÊ QUER COMENTAR: ");
                finalizarProcessos.get(i).setNumProcesso(Ler.nextInt());
                System.out.println("COM AUDIÊNCIA: ");
                finalizarProcessos.get(i).setNumAudiencia(Ler.nextInt());
                System.out.println("COM A DATA PARA: ");
                finalizarProcessos.get(i).setDataAudiencia(Ler.next());
                System.out.println("DO TRIBUNAL: ");
                finalizarProcessos.get(i).tribunal = Ler.next();
                System.out.println("DA VARA: ");
                finalizarProcessos.get(i).vara = Ler.next();
                System.out.println("DO EMPREGADOR: ");
                finalizarProcessos.get(i).setNomeEmpregador(Ler.next());
                System.out.println("COMENTÁRIO: ");
                finalizarProcessos.get(i).setComentarios(Ler.next());
                System.out.println("DATA DO COMENTÁRIO: ");
                finalizarProcessos.get(i).setDataComentario(Ler.next());
                System.out.println("DA CATEGORIA: ");
                finalizarProcessos.get(i).categoria = Ler.next();
                finalizarProcessos.get(i).setGerarRemuneracao(false);;
                finalizarProcessos.get(i).setGerarSentenca(false);
                System.out.println("O PRÓXIMO PASSO É GERAR REMUNERAÇÃO E SENTENÇA");

                i = finalizarProcessos.size();
                break;

            }

        }

    }

    public void gerarRemuneracao() {
        System.out.println("INFORME O NÚMERO DO PROCESSO: ");
        int valor = Ler.nextInt();
        for (int i = 0; i < finalizarProcessos.size(); i++) {
            if (finalizarProcessos.get(i).getNumProcesso() == valor) {

                if (finalizarProcessos.get(i).isGerarRemuneracao() == false) {

                    finalizarProcessos.get(i).setRemuneracao(5.500);

                    finalizarProcessos.get(i).setGerarRemuneracao(true);
                    System.out.println("REMUNERAÇÃO GERADA, VÁ PARA O PRÓXIMO PASSO: ");
                    i = finalizarProcessos.size();
                    break;
                } else {
                    System.out.println("JÁ FOI GERADO UMA REMUNERAÇÃO, VÁ PARA O PRÓXIMO PASSO");
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
            if (finalizarProcessos.get(i).getNumProcesso() == valor) {

                if (finalizarProcessos.get(i).isGerarSentenca() == false) {
                    System.out.println("DEFINA UMA SENTENÇA :");
                    finalizarProcessos.get(i).setSentenca(Ler.next());

                    finalizarProcessos.get(i).setGerarSentenca(true);

                    System.out.println("SENTENÇA GERADA, VÁ PARA O PRÓXIMO PASSO");
                    i = finalizarProcessos.size();
                    break;
                } else {
                    System.out.println("JÁ FOI GERADO UMA SENTENÇA, VÁ PARA O PRÓXIMO PASSO");
                    break;

                }

            }
            break;
        }

    }

    public void finalizarProcesso() {
        System.out.println("INFORME O NÚMERO DO PROCESSO");
        int valor = Ler.nextInt();

        for (int i = 0; i < finalizarProcessos.size(); i++) {
            if (finalizarProcessos.get(i).getNumProcesso() == valor) {
                if (finalizarProcessos.get(i).isGerarRemuneracao() == true) {
                    if (finalizarProcessos.get(i).isGerarSentenca() == true) {

                        System.out.println("O PROCESSO FOI FINALIZADO");
                        finalizarProcessos.get(i).status = "FINALIZADO";
                        i = finalizarProcessos.size();
                        break;
                    }
                }
            } else {
                System.out.println("PARA FINALIZAR VOCÊ PRECISA GERAR UMA REMUNERAÇÃO E DEPOIS GERAR A SENTENÇA.");
            }
            break;
        }

    }

    public void mostrarProcesso() {
        System.out.println("INFORME O NÚMERO DO PROCESSO");
        int valor = Ler.nextInt();

        for (int i = 0; i < finalizarProcessos.size(); i++) {
            if (finalizarProcessos.get(i).getNumProcesso() == valor) {

                System.out.println("NÚMERO DO PROCESSO: " + finalizarProcessos.get(i).getNumProcesso());
                System.out.println("AUDIÊNCIA: " + finalizarProcessos.get(i).getNumAudiencia());
                System.out.println("VAI RECORRER: " + finalizarProcessos.get(i).getVaiRecorrer());
                System.out.println("ASSUNTO: " + finalizarProcessos.get(i).getAssunto());
                System.out.println("NOME DO EMPREGADOR: " + finalizarProcessos.get(i).getNomeEmpregador());
                System.out.println("NOME DO ADVODGADO: " + finalizarProcessos.get(i).getNomeAdvogado());
                System.out.println("TRIBUNAL: " + finalizarProcessos.get(i).tribunal);
                System.out.println("VARA: " + finalizarProcessos.get(i).vara);
                System.out.println("ORGÃO JUDICIAL: " + finalizarProcessos.get(i).orgaoJudicial);
                System.out.println("CATEGORIA: " + finalizarProcessos.get(i).categoria);
                System.out.println("REMUNERAÇÃO: " + finalizarProcessos.get(i).getRemuneracao());
                System.out.println("SENTENÇA: " + finalizarProcessos.get(i).getSentenca());
                System.out.println("STATUS: " + finalizarProcessos.get(i).getStatus());

                i = finalizarProcessos.size();
                break;
            }
        }

    }

    public void mostrarTodosProcessos() {
        for (int i = 0; i < finalizarProcessos.size(); i++) {

            System.out.println("NÚMERO DO PROCESSO: " + finalizarProcessos.get(i).getNumProcesso());
            System.out.println("AUDIÊNCIA: " + finalizarProcessos.get(i).getNumAudiencia());
            System.out.println("VAI RECORRER:" + finalizarProcessos.get(i).getVaiRecorrer());
            System.out.println("ASSUNTO: " + finalizarProcessos.get(i).getAssunto());
            System.out.println("NOME DO EMPREGADOR: " + finalizarProcessos.get(i).getNomeEmpregador());
            System.out.println("NOME DO ADVODGADO: " + finalizarProcessos.get(i).getNomeAdvogado());
            System.out.println("TRIBUNAL: " + finalizarProcessos.get(i).tribunal);
            System.out.println("VARA: " + finalizarProcessos.get(i).vara);
            System.out.println("ORGÃO JUDICIAL: " + finalizarProcessos.get(i).orgaoJudicial);
            System.out.println("CATEGORIA: " + finalizarProcessos.get(i).categoria);
            System.out.println("REMUNERAÇÃO: " + finalizarProcessos.get(i).getRemuneracao());
            System.out.println("SENTENÇA : " + finalizarProcessos.get(i).getSentenca());
            System.out.println("STATUS: " + finalizarProcessos.get(i).getStatus());

        }
    }

    //Gets and Setters
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

    public boolean isGerarRemuneracao() {
        return gerarRemuneracao;
    }

    public void setGerarRemuneracao(boolean gerarRemuneracao) {
        this.gerarRemuneracao = gerarRemuneracao;
    }

    public boolean isGerarSentenca() {
        return gerarSentenca;
    }

    public void setGerarSentenca(boolean gerarSentenca) {
        this.gerarSentenca = gerarSentenca;
    }

}
