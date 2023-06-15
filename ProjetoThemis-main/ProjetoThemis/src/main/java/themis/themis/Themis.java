package themis.themis;

import java.util.*;

public class Themis {

    public static void main(String[] args) {
        int i = 0;
        while (i == 0) {
            Scanner teclado = new Scanner(System.in);
            CadastroProcesso cadastrar;
            AgendarAudiencia agendar;
            ComentariosProcessos comentario = new ComentariosProcessos(0,"","","",0, "", "", "", "", "", "", "", "", "");

            FinalizarProcesso finalizarProcesso = new FinalizarProcesso(0, "", "", false, false, 0, "", "", "", 0, "", "", "",
                "", "", "", "", "", "");
            

            System.out.println("BEM VINDO! ESCOLHA UMA DAS OPÇÕES!");
            System.out.println("-------------------------------------------------");
            System.out.println("1 - CADASTRAR UM PROCESSO CIVIL.");
            System.out.println("2 - ACESSAR RESUMO DE UM PROCESSO");
            System.out.println("3 - AGENDAR UMA AUDIÊNCIA");
            System.out.println("4 - INSERIR COMENTÁRIO EM UM PROCESSO");
            System.out.println("5 - ADICIONAR UM LEMBRETE");
            System.out.println("6 - FINALIZAR UM PROCESSO");
            System.out.println("7 - SAIR");
            System.out.println("-------------------------------------------------");
            int opcao = Integer.parseInt(teclado.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("VOCÊ ESCOLHEU CADASTRAR UM PROCESSO CIVIL");
                    cadastrar = new CadastroProcesso(1, "Assunto", "Mateus", "João", "OK", "03/03/2023", "Tribunal", "Vara", "Quebra de Contrato", "Governo");
                    cadastrar.verificarDados();
                    break;
                case 2:
                    System.out.println("VOCÊ ESCOLHEU ACESSAR O RESUMO");
                    ResumoProcesso resumir = new ResumoProcesso(1, "Data cadastro: ", "Data audiencia: ", "Tribunal: ", "Vara: ", "Categoria: ", "Comentarios: ", "Nome empregador: ", "Nome advogado: ", "Orgão judicial: ");
                    resumir.atualizarDados(1);
                    break;
                case 3:
                    System.out.println("VOCÊ ESCOLHEU AGENDAR UMA AUDIÊNCIA.");
                    agendar = new AgendarAudiencia(1, 2, "03/09/2002", "tribunal", "vara", "orgao", "Victor", "Matheus", "ativo");
                    //agendar.verificarAudiencia(1);
                    break;
                case 4:

                    comentario.menuComentariosProcessos();
                    
                    break;
                    
                    
                case 5:
                    System.out.println("VOCÊ ESCOLHEU ADICIONAR UM LEMBRETE");
                    System.out.println("1 - ADICIONAR LEMBRETE");
                    System.out.println("2 - MOSTRAR BILHETE");
                    System.out.println("3 - SAIR");
                    int innerOpcao = Integer.parseInt(teclado.nextLine());
                    LembreteProcesso lembreteProcesso = new LembreteProcesso(1, 1, 01, new Date().toString(),
                            "Tribunal", "Vara", "Empregador", "Advogado", "Categoria", "Assunto", "Em Amdamento");
                    String bilhete;
                    switch (innerOpcao) {
                        case 1:
                            System.out.println("ESCREVER O LEMBRETE QUE DESEJA ADICIONAR: ");
                            bilhete = teclado.nextLine();
                            lembreteProcesso.gerarLembrete(1, new Date().toString(), "Tribunal", bilhete, "Status");
                            break;
                        case 2:
                            lembreteProcesso.mostrarLembrete(01);
                            break;
                        case 3:
                            System.out.println("VOCÊ ESCOLHEU SAIR!");
                            break;
                    }
                    break;
                case 6:
                    finalizarProcesso.menuFinalizarProcesso();
                    break;
                case 7:
                    System.out.println("VOCÊ ESCOLHEU SAIR");
                    i = 1;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!");
            }
        }
    }

}
