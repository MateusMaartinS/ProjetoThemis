/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themis.themis;

import java.util.*;

/**
 *
 * @author Analista Victor, Desenvolvedor Matheus Martins
 * Desenvolvedor Atual: Victor Fagundes Ramos
 */
public class CadastroProcesso {
    
    Scanner Ler = new Scanner(System.in);
    
     List<CadastroProcesso> cadastroProcesso = new ArrayList<>();

    private int numProcesso;
    private String assunto;
    private String nomeEmpregador;
    private String nomeAdvogado;
    public String status;
    public String dataCadastro;
    public String tribunal;
    public String vara;
    public String categoria;
    public String orgaoJudicial;

    public CadastroProcesso(int pNumProcesso, String pAssunto, String pNomeEmpregador, String pNomeAdvogado,
            String pStatus, String pDataCadastro, String pTribunal, String pVara, String pCategoria, String pOrgaoJudicial) {
        this.numProcesso = pNumProcesso;
        this.assunto = pAssunto;
        this.nomeEmpregador = pNomeEmpregador;
        this.nomeAdvogado = pNomeAdvogado;
        this.status = pStatus;
        this.dataCadastro = pDataCadastro;
        this.tribunal = pTribunal;
        this.categoria = pCategoria;
        this.orgaoJudicial = pOrgaoJudicial;
    }
    
    
    public void menuCadastroProcesso() {
        int opcaoMenu = -1;

        while (opcaoMenu != 0) {
            System.out.println("=============MENU==============");
            System.out.println("====CADASTRO DE PROCESSO====");
            System.out.println("TAMANHO DA LISTA > " + cadastroProcesso.size());
            System.out.println("===============================");

            System.out.println("[1] CADASTRAR PROCESSO");
            System.out.println("[2] VERIFICAR DADOS");
            System.out.println("[0] SAIR");

            int opcao = Ler.nextInt();
            switch (opcao) {

                case 1:

                    cadastrarProcesso();
                    break;

                case 2:

                    verificarDados();

                    break;

                case 0:

                    opcaoMenu = 0;
                    break;
            }
        }

    }
    
    public void cadastrarProcesso() {
        cadastroProcesso.add(new CadastroProcesso(numProcesso, assunto, nomeEmpregador, nomeAdvogado, status, dataCadastro, tribunal, vara, categoria, orgaoJudicial));

        for (int i = 0; i < cadastroProcesso.size(); i++) {
            if (cadastroProcesso.get(i).numProcesso == 0) {
                System.out.println("=====QUANTOS PROCESSOS JA FORAM CADASTRADOS: " + cadastroProcesso.size() + "=====");

                System.out.println("NÚMERO DO PROCESSO: ");
                cadastroProcesso.get(i).numProcesso = Ler.nextInt();

                System.out.println("ASSUNTO: ");
                cadastroProcesso.get(i).assunto = Ler.next();

                System.out.println("NOME DO EMPREGADOR: ");
                cadastroProcesso.get(i).nomeEmpregador = Ler.next();

                System.out.println("NOME DO ADVOGADO: ");
                cadastroProcesso.get(i).nomeAdvogado = Ler.next();

                System.out.println("STATUS: ");
                cadastroProcesso.get(i).status = Ler.next();

                System.out.println("DATA DE CADASTRADO: ");
                cadastroProcesso.get(i).dataCadastro = Ler.next();

                System.out.println("TRIBUNAL: ");
                cadastroProcesso.get(i).tribunal = Ler.next();

                System.out.println("VARA: ");
                cadastroProcesso.get(i).vara = Ler.next();

                System.out.println("CATEGORIA: ");
                cadastroProcesso.get(i).categoria = Ler.next();

                System.out.println("ORGÃO JUDICIAL: ");
                cadastroProcesso.get(i).orgaoJudicial = Ler.next();
                
                break;
            }

        }

    }
    
    //OVERLOAD
    public void cadastrarProcesso(int pNumProcesso, String pAssunto, String pNomeEmpregador, String pNomeAdvogado, String pStatus, String pDataCadastro,
            String pTribunal, String pVara, String pCategoria, String pOrgaoJudicial, int i) {

        cadastroProcesso.get(i).numProcesso = pNumProcesso;

        cadastroProcesso.get(i).assunto = pAssunto;

        cadastroProcesso.get(i).nomeEmpregador = pNomeEmpregador;

        cadastroProcesso.get(i).nomeAdvogado = pNomeAdvogado;

        cadastroProcesso.get(i).status = pStatus;

        cadastroProcesso.get(i).dataCadastro = pDataCadastro;

        cadastroProcesso.get(i).tribunal = pTribunal;

        cadastroProcesso.get(i).vara = pVara;

        cadastroProcesso.get(i).categoria = pCategoria;

        cadastroProcesso.get(i).orgaoJudicial = pOrgaoJudicial;
    }


    public void verificarDados() {
        
    System.out.println("INFORME O NUMERO DO PROCESSO QUE QUER VERIFICAR");
        int valor = Ler.nextInt();

        for (int i = 0; i < cadastroProcesso.size(); i++) {
            if (cadastroProcesso.get(i).numProcesso == valor) {
                System.out.println("VERIFICANDO INFORMAÇÕES DA POSIÇÃO " + i);
                System.out.println("NUMERO PROCESSO: " + cadastroProcesso.get(i).numProcesso);
                System.out.println("ASSUNTO: " + cadastroProcesso.get(i).assunto);
                System.out.println("NOME DO EMPREGADOR: " + cadastroProcesso.get(i).nomeEmpregador);
                System.out.println("NOME DO ADVOGADO: " + cadastroProcesso.get(i).nomeAdvogado);
                System.out.println("STATUS: " + cadastroProcesso.get(i).status);
                System.out.println("DATA DE CADASTRO: " + cadastroProcesso.get(i).dataCadastro);
                System.out.println("TRIBUNAL: " + cadastroProcesso.get(i).tribunal);
                System.out.println("VARA: " + cadastroProcesso.get(i).vara);
                System.out.println("CATEGORIA: " + cadastroProcesso.get(i).categoria);
                System.out.println("ORGÃO JUDICIAL: " + cadastroProcesso.get(i).orgaoJudicial);
            }
        }
    }

    public int getNumProcesso() {
        return numProcesso;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getNomeEmpregador() {
        return nomeEmpregador;
    }

    public String getNomeAdvogado() {
        return nomeAdvogado;
    }

    public String getStatus() {
        return status;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public String getTribunal() {
        return tribunal;
    }

    public String getVara() {
        return vara;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getOrgaoJudicial() {
        return orgaoJudicial;
    }

    public void setCadastroProcesso(List<CadastroProcesso> cadastroProcesso) {
        this.cadastroProcesso = cadastroProcesso;
    }

    public void setNumProcesso(int numProcesso) {
        this.numProcesso = numProcesso;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setNomeEmpregador(String nomeEmpregador) {
        this.nomeEmpregador = nomeEmpregador;
    }

    public void setNomeAdvogado(String nomeAdvogado) {
        this.nomeAdvogado = nomeAdvogado;
    }

    
    
}
