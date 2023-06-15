/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themis.themis;

import java.util.*;

/**
 *
 * @author Renan Alves Peregrino Desenvolvedor, Felipe Koji Analista
 * Desenvolvedor Atual: Nathan Felipe Oestreich Graebin
 */
public class ComentariosProcessos extends CadastroProcesso {

    List<ComentariosProcessos> comentariosProcessos = new ArrayList<>();

    Scanner Ler = new Scanner(System.in);
    private int numAudiencia;
    private String dataAudiencia;
    private String comentarios;
    private String dataComentario;

    public ComentariosProcessos(int numAudiencia, String dataAudiencia, String comentarios, String dataComentario, int pNumProcesso, String pAssunto, String pNomeEmpregador, String pNomeAdvogado,
            String pStatus, String pDataCadastro, String pTribunal, String pVara, String pCategoria, String pOrgaoJudicial) {
        super(pNumProcesso, pAssunto, pNomeEmpregador, pNomeAdvogado, pStatus, pDataCadastro, pTribunal, pVara, pCategoria, pOrgaoJudicial);
        this.numAudiencia = numAudiencia;
        this.dataAudiencia = dataAudiencia;
        this.comentarios = comentarios;
        this.dataComentario = dataComentario;

    }

    //Metodos
    public void menuComentariosProcessos() {
        int opcaoMenu = -1;

        while (opcaoMenu != 0) {
            System.out.println("=============MENU==============");
            System.out.println("====COMENTARIOS DO PROCESSO====");
            System.out.println("TAMANHO DA LISTA > " + comentariosProcessos.size());
            System.out.println("===============================");

            System.out.println("[1] ADICIONAR COMENTÁRIO");
            System.out.println("[2] APAGAR COMENTÁRIO");
            System.out.println("[3] VER COMENTÁRIO DE UM PROCESSO");
            System.out.println("[4] VER TODOS OS COMENTÁRIOS DOS PROCESSOS");
            System.out.println("");
            System.out.println("");
            System.out.println("[9] CARREGAR DADOS");
            System.out.println("[0] SAIR");

            int opcao = Ler.nextInt();
            switch (opcao) {

                case 1:

                    adicionarComentario();
                    break;

                case 2:

                    apagarComentario();

                    break;

                case 3:

                    verProcessos();

                    break;

                case 4:

                    verProcessos("iniciar");
                    break;
                case 9:

                    carregarDados();
                    break;

                case 0:

                    opcaoMenu = 0;
                    break;
            }
        }

    }

    public void adicionarComentario() {
        criarComentarioVazio();

        for (int i = 0; i < comentariosProcessos.size(); i++) {
            if (comentariosProcessos.get(i).getNumProcesso() == 0) {
                System.out.println("=====QUANTOS COMENTÁRIOS JA FORAM FEITOS: " + comentariosProcessos.size() + "=====");
                System.out.println("EM QUAL PROCESSO VOCÊ QUER COMENTAR: ");
                comentariosProcessos.get(i).setNumProcesso(Ler.nextInt());
                System.out.println("COM AUDIÊNCIA: ");
                comentariosProcessos.get(i).setNumAudiencia(Ler.nextInt());
                System.out.println("COM A DATA PARA: ");
                comentariosProcessos.get(i).setDataAudiencia(Ler.next());
                System.out.println("DO TRIBUNAL: ");
                comentariosProcessos.get(i).tribunal = Ler.next();
                System.out.println("DA VARA: ");
                comentariosProcessos.get(i).vara = Ler.next();
                System.out.println("ASSUNTO: ");
                comentariosProcessos.get(i).setAssunto(Ler.next());
                System.out.println("DO EMPREGADOR: ");
                comentariosProcessos.get(i).setNomeEmpregador(Ler.next());
                System.out.println("COMENTÁRIO: ");
                comentariosProcessos.get(i).setComentarios(Ler.next());
                System.out.println("DATA DO COMENTÁRIO: ");
                comentariosProcessos.get(i).setDataComentario(Ler.next());
                System.out.println("DA CATEGORIA: ");
                comentariosProcessos.get(i).categoria = Ler.next();
                i = comentariosProcessos.size();
                break;

            }

        }

    }

    //Overload
    public void adicionarComentario(int numAudiencia, String dataAudiencia, String comentarios, String dataComentario, int pNumProcesso, String pAssunto, String pNomeEmpregador, String pNomeAdvogado,
            String pStatus, String pDataCadastro, String pTribunal, String pVara, String pCategoria, String pOrgaoJudicial, int i) {

        comentariosProcessos.get(i).setNumAudiencia(numAudiencia);
        comentariosProcessos.get(i).setDataAudiencia(dataAudiencia);
        comentariosProcessos.get(i).setComentarios(comentarios);
        comentariosProcessos.get(i).setDataComentario(dataComentario);
        comentariosProcessos.get(i).setNumProcesso(pNumProcesso);
        comentariosProcessos.get(i).setAssunto(pAssunto);
        comentariosProcessos.get(i).setNomeEmpregador(pNomeEmpregador);
        comentariosProcessos.get(i).setNomeAdvogado(pNomeAdvogado);
        comentariosProcessos.get(i).status = pStatus;
        comentariosProcessos.get(i).dataCadastro = pDataCadastro;
        comentariosProcessos.get(i).tribunal = pTribunal;
        comentariosProcessos.get(i).vara = pVara;
        comentariosProcessos.get(i).categoria = pCategoria;
    }

    public void apagarComentario() {

        System.out.println("INFORME O NÚMERO DO PROCESSO PARA DELETAR O COMENTÁRIO: ");
        int index = Ler.nextInt();

        for (int i = 0; i < comentariosProcessos.size(); i++) {

            if (comentariosProcessos.get(i).getNumProcesso() == index) {

                comentariosProcessos.remove(index);
                System.out.println("TAMANHO DA LISTA ATUAL >DEPOIS< DE DELETAR: " + comentariosProcessos.size());
                i = comentariosProcessos.size();

            }

        }
    }

    public void verProcessos() {

        System.out.println("INFORME O NÚMERO DO PROCESSO QUE QUER VERIFICAR: ");
        int valor = Ler.nextInt();

        for (int i = 0; i < comentariosProcessos.size(); i++) {
            if (comentariosProcessos.get(i).getNumProcesso() == valor) {
                System.out.println("VERIFICANDO INFORMAÇÕES DA POSIÇÃO: " + i);
                System.out.println("NÚMERO PROCESSO: " + comentariosProcessos.get(i).getNumProcesso());
                System.out.println("NÚMERO AUDIÊNCIA: " + comentariosProcessos.get(i).numAudiencia);
                System.out.println("DATA AUDIÊNCIA: " + comentariosProcessos.get(i).getDataAudiencia());
                System.out.println("TRIBUNAL: " + comentariosProcessos.get(i).tribunal);
                System.out.println("VARA: " + comentariosProcessos.get(i).vara);
                System.out.println("ASSUNTO: " + comentariosProcessos.get(i).getAssunto());
                System.out.println("COMENTÁRIO: " + comentariosProcessos.get(i).getComentarios());
                System.out.println("DATA DO COMENTÁRIO: " + comentariosProcessos.get(i).getDataComentario());
                System.out.println("NOME DO EMPREGADOR: " + comentariosProcessos.get(i).getNomeEmpregador());
                System.out.println("DA CATEGORIA: " + comentariosProcessos.get(i).getCategoria());
                System.out.println("============================================");
            }
        }

    }

    //Overload
    public void verProcessos(String a) {
        for (int i = 0; i < comentariosProcessos.size(); i++) {
            System.out.println("VERIFICANDO INFORMAÇÕES DA POSIÇÃO " + i);
            System.out.println("NÚMERO PROCESSO: " + comentariosProcessos.get(i).getNumProcesso());
            System.out.println("NÚMERO AUDIÊNCIA: " + comentariosProcessos.get(i).numAudiencia);
            System.out.println("DATA AUDIÊNCIA: " + comentariosProcessos.get(i).getDataAudiencia());
            System.out.println("TRIBUNAL: " + comentariosProcessos.get(i).tribunal);
            System.out.println("VARA: " + comentariosProcessos.get(i).vara);
            System.out.println("ASSUNTO: " + comentariosProcessos.get(i).getAssunto());
            System.out.println("COMENTÁRIO: " + comentariosProcessos.get(i).getComentarios());
            System.out.println("DATA DO COMENTÁRIO: " + comentariosProcessos.get(i).getDataComentario());
            System.out.println("NOME DO EMPREGADOR: " + comentariosProcessos.get(i).getNomeEmpregador());
            System.out.println("DA CATEGORIA: " + comentariosProcessos.get(i).getCategoria());
            System.out.println("============================================");
            
        }
    }

    public void carregarDados() {

        for (int i = 0; i < 5; i++) {
            criarComentarioVazio();
            if (comentariosProcessos.get(i).getNumProcesso() == 0) {
                adicionarComentario(i, "" + i, "" + i, "" + i, i, "" + i, "" + i, "" + i, "" + i, "" + i, "" + i, "" + i, "" + i, "" + i, i);

            }
        }
        System.out.println("TODOS OS DADOS FORAM CARREGADOS");

    }

    public void criarComentarioVazio() {
        comentariosProcessos.add(new ComentariosProcessos(0, "", "", "", 0, "", "", "", "", "", "", "", "", ""));

    }
    
    //Getters And Seters
    public int getNumAudiencia() {
        return numAudiencia;
    }

    public void setNumAudiencia(int numAudiencia) {
        this.numAudiencia = numAudiencia;
    }

    public String getDataAudiencia() {
        return dataAudiencia;
    }

    public void setDataAudiencia(String dataAudiencia) {
        this.dataAudiencia = dataAudiencia;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(String dataComentario) {
        this.dataComentario = dataComentario;
    }

}
