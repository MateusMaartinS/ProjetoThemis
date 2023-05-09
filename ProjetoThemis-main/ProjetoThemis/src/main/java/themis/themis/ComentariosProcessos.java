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

    private int numAudiencia;
    private int numProcesso;
    public String dataAudiencia;
    public String tribunal;
    public String vara;
    public String categoria;
    private String assunto;
    public String comentarios;
    public String dataComentario;
    private String nomeEmpregador;

    public void comentariosProcesso(int pNumProcesso, int pNumAudiencia, String pDataAudiencia, String pTribunal, String pVara, String pAssunto, String pComentarios, String pDataComentario, String pNomeEmpregador) {
        Scanner coment = new Scanner(System.in);
        this.numProcesso = pNumProcesso;
        this.numAudiencia = pNumAudiencia;
        this.dataAudiencia = pDataAudiencia;
        this.tribunal = pTribunal;
        this.vara = pVara;
        this.assunto = pAssunto;
        this.comentarios = pComentarios;
        this.dataComentario = pDataComentario;
        this.nomeEmpregador = pNomeEmpregador;

        System.out.println("O Processo:" + numProcesso);
        System.out.println("Com a Audiência" + numAudiencia);
        System.out.println("Com a data para : " + dataAudiencia);
        System.out.println("Do tribunal " + tribunal);
        System.out.println("Da Vara:" + vara);
        System.out.println("Do Empregador" + nomeEmpregador);
        System.out.println("A data deste comentário é: " + dataComentario);

    }

    //Metodos
    public void indentificarComentario(int pNumProcesso, int pNumAudiencia, String pDataAudiencia, String pTribunal, String pVara, String pAssunto, String pComentarios, String pDataComentario, String pNomeEmpregador) {
        System.out.println("O comentário Feito foi:" + this.comentarios);
    }

    public void apagarComentario(String aComentarios, String aDataComentario) {
        System.out.println("O comentário foi apagado com sucesso!");
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
