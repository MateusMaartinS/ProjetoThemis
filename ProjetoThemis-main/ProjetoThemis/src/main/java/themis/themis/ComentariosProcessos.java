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
public class ComentariosProcessos {

    List<ComentariosProcessos> comentariosProcessos = new ArrayList<>();

    Scanner Ler = new Scanner(System.in);

    private int numAudiencia;
    private int numProcesso;
    private String assunto;
    private String nomeEmpregador;
    public String dataAudiencia;
    public String tribunal;
    public String vara;
    public String categoria;

    public String comentarios;
    public String dataComentario;

    public ComentariosProcessos() {

    }

    public ComentariosProcessos(int pNumAudiencia, int pNumProcesso, String pAssunto, String pNomeEmpregador,
            String pDataAudiencia, String pTribunal, String pVara, String pCategoria, String pComentarios,
            String pDataComentario) {

        this.numProcesso = pNumProcesso;
        this.numAudiencia = pNumAudiencia;
        this.dataAudiencia = pDataAudiencia;
        this.tribunal = pTribunal;
        this.vara = pVara;
        this.assunto = pAssunto;
        this.comentarios = pComentarios;
        this.dataComentario = pDataComentario;
        this.nomeEmpregador = pNomeEmpregador;
        this.categoria = pCategoria;

    }

    //Metodos
    public void menuComentariosProcessos() {
        int opcaoMenu = -1;

        while (opcaoMenu != 0) {
            System.out.println("=============MENU==============");
            System.out.println("====COMENTARIOS DO PROCESSO====");
            System.out.println("TAMANHO DA LISTA > " + comentariosProcessos.size());
            System.out.println("===============================");

            System.out.println("[1] ADICIONAR COMENTARIO");
            System.out.println("[2] APAGAR COMENTARIO");
            System.out.println("[3] VER COMENTARIO DE UM PROCESSO");
            System.out.println("[4] VER TODOS OS COMENTARIOS DOS PROCESSOS");
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

                    verComentariosProcesso();

                    break;

                case 4:

                    verTodosProcessos();
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
        comentariosProcessos.add(new ComentariosProcessos());

        for (int i = 0; i < comentariosProcessos.size(); i++) {
            if (comentariosProcessos.get(i).numProcesso == 0) {
                System.out.println("=====QUANTOS COMENTARIO JA FORAM FEITOS: " + comentariosProcessos.size() + "=====");

                System.out.println("EM QUAL PROCESSO VOCÊ QUER COMENTAR ?");
                comentariosProcessos.get(i).numProcesso = Ler.nextInt();

                System.out.println("COM AUDIÊNCIA : ");
                comentariosProcessos.get(i).numAudiencia = Ler.nextInt();

                System.out.println("COM A DATA PARA : ");
                comentariosProcessos.get(i).dataAudiencia = Ler.next();

                System.out.println("DO TRIBUNAL : ");
                comentariosProcessos.get(i).tribunal = Ler.next();

                System.out.println("DA VARA : ");
                comentariosProcessos.get(i).vara = Ler.next();

                System.out.println("ASSUNTO : ");
                comentariosProcessos.get(i).assunto = Ler.next();

                System.out.println("DO EMPREGADOR : ");
                comentariosProcessos.get(i).nomeEmpregador = Ler.next();

                System.out.println("COMENTARIO : ");
                comentariosProcessos.get(i).comentarios = Ler.next();

                System.out.println("DATA DO COMENTARIO : ");
                comentariosProcessos.get(i).dataComentario = Ler.next();

                System.out.println("DA CATEGORIA : ");
                comentariosProcessos.get(i).categoria = Ler.next();

                i = comentariosProcessos.size();
                break;

            }

        }

    }

    //Overload
    public void adicionarComentario(int pNumAudiencia, int pNumProcesso, String pAssunto, String pNomeEmpregador,
            String pDataAudiencia, String pTribunal, String pVara, String pCategoria, String pComentarios,
            String pDataComentario, int i) {

        comentariosProcessos.get(i).numProcesso = pNumProcesso;

        comentariosProcessos.get(i).numAudiencia = pNumAudiencia;

        comentariosProcessos.get(i).dataAudiencia = pDataAudiencia;

        comentariosProcessos.get(i).tribunal = pTribunal;

        comentariosProcessos.get(i).vara = pVara;

        comentariosProcessos.get(i).assunto = pAssunto;

        comentariosProcessos.get(i).nomeEmpregador = pNomeEmpregador;

        comentariosProcessos.get(i).comentarios = pComentarios;

        comentariosProcessos.get(i).dataComentario = pDataComentario;

        comentariosProcessos.get(i).categoria = pCategoria;

    }

    public void apagarComentario() {

        System.out.println("INFORME O NUMERO DO PROCESSO PARA DELETAR O COMENTARIO");
        int valor = Ler.nextInt();

        for (int i = 0; i < comentariosProcessos.size(); i++) {

            if (comentariosProcessos.get(i).numProcesso == valor) {

                comentariosProcessos.remove(valor);

                i = comentariosProcessos.size();

            }

        }
    }

    public void verComentariosProcesso() {

        System.out.println("INFORME O NUMERO DO PROCESSO QUE QUER VERIFICAR");
        int valor = Ler.nextInt();

        for (int i = 0; i < comentariosProcessos.size(); i++) {
            if (comentariosProcessos.get(i).numProcesso == valor) {
                System.out.println("VERIFICANDO INFORMAÇÕES DA POSIÇÃO " + i);
                System.out.println("NUMERO PROCESSO : " + comentariosProcessos.get(i).numProcesso);
                System.out.println("NUMERO AUDIENCIA : " + comentariosProcessos.get(i).numProcesso);
                System.out.println("DATA AUDIENCIA : " + comentariosProcessos.get(i).dataAudiencia);
                System.out.println("TRIBUNAL : " + comentariosProcessos.get(i).tribunal);
                System.out.println("VARA : " + comentariosProcessos.get(i).vara);
                System.out.println("ASSUNTO :" + comentariosProcessos.get(i).assunto);
                System.out.println("COMENTARIOS :" + comentariosProcessos.get(i).comentarios);
                System.out.println("DATA DO COMENTARIO : " + comentariosProcessos.get(i).dataComentario);
                System.out.println("NOME DO EMPREGADOR : " + comentariosProcessos.get(i).nomeEmpregador);
                System.out.println("DA CATEGORIA : " + comentariosProcessos.get(i).categoria);
            }
        }

    }

    public void verTodosProcessos() {
        for (int i = 0; i < comentariosProcessos.size(); i++) {
            System.out.println("VERIFICANDO INFORMAÇÕES DA POSIÇÃO " + i);
            System.out.println("NUMERO PROCESSO : " + comentariosProcessos.get(i).numProcesso);
            System.out.println("NUMERO AUDIENCIA : " + comentariosProcessos.get(i).numProcesso);
            System.out.println("DATA AUDIENCIA : " + comentariosProcessos.get(i).dataAudiencia);
            System.out.println("TRIBUNAL : " + comentariosProcessos.get(i).tribunal);
            System.out.println("VARA : " + comentariosProcessos.get(i).vara);
            System.out.println("ASSUNTO :" + comentariosProcessos.get(i).assunto);
            System.out.println("COMENTARIOS :" + comentariosProcessos.get(i).comentarios);
            System.out.println("DATA DO COMENTARIO : " + comentariosProcessos.get(i).dataComentario);
            System.out.println("NOME DO EMPREGADOR : " + comentariosProcessos.get(i).nomeEmpregador);
            System.out.println("DA CATEGORIA : " + comentariosProcessos.get(i).categoria);
            System.out.println("============================================");
        }
    }

    public void carregarDados() {

        for (int i = 0; i < 5; i++) {
            comentariosProcessos.add(new ComentariosProcessos());
            if (comentariosProcessos.get(i).numProcesso == 0) {
                adicionarComentario(i, i, "", "",
                        i + "/" + i + i + "/" + i + i + i + i, "", "", "", "", "", i);

            }
        }
        System.out.println("TODOS OS DADOS FORAM CARREGADOS");

    }

    //Getters And Seters
    public int getNumAudiencia() {
        return numAudiencia;
    }

    public void setNumAudiencia(int numAudiencia) {
        this.numAudiencia = numAudiencia;
    }

    public int getNumProcesso() {
        return numProcesso;
    }

    public void setNumProcesso(int numProcesso) {
        this.numProcesso = numProcesso;
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

}
