package themis.themis;

import java.util.*;

public class Themis {

    public static void main(String[] args) {
        int i = 0;
        while (i == 0) {
            Scanner teclado = new Scanner(System.in);
            CadastroProcesso cadastrar;
            AgendarAudiencia agendar;
            ComentariosProcessos comentario = new ComentariosProcessos(0, 0, "", "",
                "", "", "", "", "", "",
                0, null, "", "", "", "",
                "", "", "", "");
            FinalizarProcesso finalizarProcesso = new FinalizarProcesso(0, 0, 0,
                    "", "", "", "", "", "", "", "",
                    "", "", false, false, 0, 0,
                    "", "", "", "", "", "", "",
                    "", 0, "", "", "", "",
                    "", "", "", "", "");
            

            System.out.println("Bem vindo! Escolha uma das opções!");
            System.out.println("-------------------------------------------------");
            System.out.println("1 - Cadastrar um Processo Civil.");
            System.out.println("2 - Acessar Resumo de um processo");
            System.out.println("3 - Agendar uma Audiência.");
            System.out.println("4 - Inserir comentário em um processo");
            System.out.println("5 - Adicionar um Lembrete.");
            System.out.println("6 - Finalizar um Processo.");
            System.out.println("7 - Sair");
            System.out.println("-------------------------------------------------");
            int opcao = Integer.parseInt(teclado.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Cadastrar um Processo Civil.");
                    cadastrar = new CadastroProcesso(1, "Assunto", "Mateus", "João", "OK", "03/03/2023", "Tribunal", "Vara", "Quebra de Contrato", "Governo");
                    cadastrar.verificarDados();
                    break;
                case 2:
                    System.out.println("Você escolheu Acessar Resumo.");
                    ResumoProcesso resumir = new ResumoProcesso(1, "Data cadastro: ", "Data audiencia: ", "Tribunal: ", "Vara: ", "Categoria: ", "Comentarios: ", "Nome empregador: ", "Nome advogado: ", "Orgão judicial: ");
                    resumir.atualizarDados(1);
                    break;
                case 3:
                    System.out.println("Você escolheu Agendar uma Audiência.");
                    agendar = new AgendarAudiencia(1, 2, "03/09/2002", "tribunal", "vara", "orgao", "Victor", "Matheus", "ativo");
                    //agendar.verificarAudiencia(1);
                    break;
                case 4:

                    comentario.menuComentariosProcessos();
                    break;
                    
                    
                case 5:
                    System.out.println("Você escolheu Adicionar um Lembrete.");
                    System.out.println("1 - Adicionar Lembrete");
                    System.out.println("2 - Mostrar Bilhete");
                    System.out.println("3 - Sair");
                    int innerOpcao = Integer.parseInt(teclado.nextLine());
                    LembreteProcesso lembreteProcesso = new LembreteProcesso(1, 1, 01, new Date().toString(),
                            "Tribunal", "Vara", "Empregador", "Advogado", "Categoria", "Assunto", "Em Amdamento");
                    String bilhete;
                    switch (innerOpcao) {
                        case 1:
                            System.out.println("Escreva o lembrete que deseja adicionar: ");
                            bilhete = teclado.nextLine();
                            lembreteProcesso.gerarLembrete(1, new Date().toString(), "Tribunal", bilhete, "Status");
                            break;
                        case 2:
                            lembreteProcesso.mostrarLembrete(01);
                            break;
                        case 3:
                            System.out.println("Você escolheu Sair!");
                            break;
                    }
                    break;
                case 6:
                    finalizarProcesso.menuFinalizarProcesso();
                    break;
                case 7:
                    System.out.println("Você escolheu Sair");
                    i = 1;
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        }
    }

}
