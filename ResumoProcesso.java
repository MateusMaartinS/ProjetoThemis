/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themis.themis;

import com.mycompany.cadastroprocesso.CadastroProcesso;
import java.util.*;

/**
 *
 * @author Felipe Koji Desenvolvedor e Analista Matheus Martins Desenvolvedor
 * atual: Mateus Martins da Silva
 */
public class ResumoProcesso extends CadastroProcesso {

    List<ResumoProcesso> resumoProcesso = new ArrayList<>();

    Scanner Ler = new Scanner(System.in);

    private int numProcesso;
    public String dataCadastro;
    public String dataAudiencia;
    public String tribunal;
    public String vara;
    public String categoria;
    public String comentarios;
    private String nomeEmpregador;
    private String nomeAdvogado;
    public String orgaoJudicial;
    public int atualizarDados = 0;
    Scanner ler = new Scanner(System.in);

    public ResumoProcesso(int pNumProcesso,
            String pDataCadastro,
            String pDataAudiencia,
            String pTribunal,
            String pVara,
            String pCategoria,
            String pComentarios,
            String pNomeEmpregador,
            String pNomeAdvogado,
            String pOrgaoJudicial) {
        this.numProcesso = pNumProcesso;
        this.dataCadastro = pDataCadastro;
        this.dataAudiencia = pDataAudiencia;
        this.tribunal = pTribunal;
        this.vara = pVara;
        this.categoria = pCategoria;
        this.comentarios = pComentarios;
        this.nomeEmpregador = pNomeEmpregador;
        this.nomeAdvogado = pNomeAdvogado;
        this.orgaoJudicial = pOrgaoJudicial;
    }

    public void menuResumoProcessos() {
        int opcaoMenu = -1;

        while (opcaoMenu != 0) {
            System.out.println("=============MENU==============");
            System.out.println("=======RESUMO DO PROCESSO======");
            System.out.println("TAMANHO DA LISTA > " + resumoProcesso.size());
            System.out.println("===============================");
            System.out.println("[1] VER RESUMO DE UM PROCESSO");
            System.out.println("[0] SAIR");

            int opcao = Ler.nextInt();
            switch (opcao) {

                case 1:

                    verResumoProcesso();
                    break;

                case 0:

                    opcaoMenu = 0;
                    break;
            }
        }

    }

    public void verResumoProcesso() {

        System.out.println("INFORME O NUMERO DO PROCESSO QUE QUER VERIFICAR");
        int valor = Ler.nextInt();

        for (int i = 0; i < resumoProcesso.size(); i++) {
            if (resumoProcesso.get(i).numProcesso == valor) {
                System.out.println("VERIFICANDO INFORMAÇÕES DA POSIÇÃO " + i);
                System.out.println("NUMERO PROCESSO : " + resumoProcesso.get(i).numProcesso);
                System.out.println("DATA DE CADASTRO : " + resumoProcesso.get(i).dataCadastro);
                System.out.println("NUMERO AUDIENCIA : " + resumoProcesso.get(i).numProcesso);
                System.out.println("DATA AUDIENCIA : " + resumoProcesso.get(i).dataAudiencia);
                System.out.println("TRIBUNAL : " + resumoProcesso.get(i).tribunal);
                System.out.println("VARA : " + resumoProcesso.get(i).vara);
                System.out.println("COMENTARIOS :" + resumoProcesso.get(i).comentarios);
                System.out.println("NOME DO EMPREGADOR : " + resumoProcesso.get(i).nomeEmpregador);
                System.out.println("NOME DO ADVOGADO: " + resumoProcesso.get(i).nomeAdvogado);
                System.out.println("ORGÃO JUDICIAL : " + resumoProcesso.get(i).orgaoJudicial);
                System.out.println("DA CATEGORIA : " + resumoProcesso.get(i).categoria);
                
            }
        }
}
       

    public int getNumProcesso() {
        return this.numProcesso;
    }

    public String getdataCadastro() {
        return this.dataCadastro;
    }

    public String getdataAudiencia() {
        return this.dataAudiencia;
    }

    public String gettribunal() {
        return this.tribunal;
    }

    public String getvara() {
        return this.vara;
    }

    public String getcategoria() {
        return this.categoria;
    }

    public String getcomentarios() {
        return this.comentarios;
    }

    public String getnomeEmpregador() {
        return this.nomeEmpregador;
    }

    public String getnomeAdvogado() {
        return this.nomeAdvogado;
    }

    public String getorgaoJudicial() {
        return this.orgaoJudicial;
    }
}
