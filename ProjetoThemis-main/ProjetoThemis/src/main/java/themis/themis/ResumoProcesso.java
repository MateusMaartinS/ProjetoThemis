/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themis.themis;
import java.util.*;
/**
 *
 * @author Felipe Koji Desenvolvedor e Analista Matheus Martins
 * Desenvolvedor atual: Mateus Martins da Silva
 */
public class ResumoProcesso {
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
                                    String pOrgaoJudicial){
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
        
        public void resumirProcesso(int pNumProcesso){
            if(this.numProcesso == pNumProcesso){
                System.out.println(String.format("O processo %d, cadastrado em %s está com a audiencia marcada para %s", numProcesso, dataCadastro, dataAudiencia));
                System.out.println(String.format( "Será no tribunal %s. Número Vara:%s. Categoria:%s",tribunal, vara, categoria));
                System.out.println(String.format("Comentarios sobre o processo:%s ", comentarios));
                System.out.println(String.format("Empregador:%s. Advogado:%s. Orgão Judicial:%s", nomeEmpregador, nomeAdvogado, orgaoJudicial));
            }else{
                System.out.println("Numero processo inválido. Tente novamente!");
            }
        }
        
        public void atualizarDados(int pAtualizarDados){
            System.out.println("Pressione 1 para atualizar dados ");
            System.out.println("Pressione 0 para sair");
            atualizarDados = ler.nextInt();
            if(this.atualizarDados == 1){
                System.out.println("Dados atualizados com sucesso");
            }else{   }    
        }   
        
        public void visualizarResumo(int pVisualizarResumo){
            System.out.println(String.format("Numero do processo:%s", numProcesso));
        }
        
        public void excluirProcesso(int pExcluirProcesso){
            System.out.println("Processo excluido com sucesso!");
        }
        
        public int getNumProcesso(){
            return this.numProcesso;
        } 
        public String getdataCadastro(){
            return this.dataCadastro;
        } 
        public String getdataAudiencia(){
            return this.dataAudiencia;
        } 
        public String gettribunal(){
            return this.tribunal;
        }
        public String getvara(){
            return this.vara;
        } 
        public String  getcategoria(){
            return this.categoria;
        }
        public String getcomentarios(){
            return this.comentarios;
        } 
        public String getnomeEmpregador(){
            return this.nomeEmpregador;
        } 
        public String getnomeAdvogado(){
            return this.nomeAdvogado;
        }
        public String getorgaoJudicial(){
            return this.orgaoJudicial;
        } 
}
