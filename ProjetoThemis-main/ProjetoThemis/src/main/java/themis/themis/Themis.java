package themis.themis;
import java.util.*;
public class Themis {
	public static void main(String[] args) {
            int i = 0;
            while (i == 0) {
            Scanner teclado = new Scanner(System.in);
            CadastroProcesso cadastrar;
            AgendarAudiencia agendar;
            
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
                    cadastrar.verificarDados(1);
                    break;
                case 2:
                    System.out.println("Você escolheu Acessar Resumo.");
                    ResumoProcesso resumir = new ResumoProcesso(1, "Data cadastro: ", "Data audiencia: ", "Tribunal: ", "Vara: ", "Categoria: ", "Comentarios: ", "Nome empregador: ", "Nome advogado: ", "Orgão judicial: ");
                    resumir.atualizarDados(1);
                    break;
                case 3:
                    System.out.println("Você escolheu Agendar uma Audiência.");
                    agendar = new AgendarAudiencia(1, 2, "03/09/2002", "tribunal", "vara", "orgao", "Victor", "Matheus", "ativo");
                    agendar.verificarAudiencia(2);
                    break;
                case 4:
                    System.out.println("Você escolheu inserir um comentário.");
                    System.out.println("1 - Adicionar Comentário");
                    System.out.println("2 - Apagar um comentário.");
                    System.out.println("3 - Sair");
                    opcao = Integer.parseInt(teclado.nextLine());
                    String comentarios;
                    ComentariosProcessos comentario = new ComentariosProcessos();
                    switch (opcao) {
                        case 1:
                            System.out.println("Escreva o comentário que deseja adicionar: ");
                            comentarios = teclado.nextLine();
                            comentario.comentariosProcesso(1, 2, "12/06/2023", "Tribunal", "Vara", "Quebra de Contrato", comentarios, "13/06/2023", "Jose");
                            System.out.println("Comentário Adicionado com sucesso!");
                            comentario.indentificarComentario(1, 2, "12/06/2023", "Tribunal", "Vara", "Quebra de Contrato", "Comentario", "13/06/2023", "Jose");
                            break;
                        case 2:
                            comentario.apagarComentario("Comentario", "13/06/2023");
                            break;
                        case 3:
                            System.out.println("Você escolheu Sair!");
                            break;
                        default:
                            System.out.println("Opção Invalida!");
                    }
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
                            lembreteProcesso.mostrarLembrte(01);
                            break;
                        case 3:
                            System.out.println("Você escolheu Sair!");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Você escolheu Finalizar um Processo.");
                    System.out.println("Informe os dados do processo :");
                    System.out.println("----------------------------------------");

                    System.out.print("Número do Processo: ");
                    int numProc = Integer.parseInt(teclado.nextLine());

                    System.out.print("Número da Audiência: ");
                    int numAudi = Integer.parseInt(teclado.nextLine());

                    System.out.print("Tribunal: ");
                    String trib = teclado.nextLine();

                    System.out.print("Vara: ");
                    String vara = teclado.nextLine();

                    System.out.print("Orgão Judicial: ");
                    String orgao = teclado.nextLine();

                    System.out.print("Categoria: ");
                    String categ = teclado.nextLine();

                    System.out.print("Assunto: ");
                    String assunto = teclado.nextLine();

                    System.out.print("Nome do Empregador: ");
                    String nomeEmp = teclado.nextLine();

                    System.out.print("Nome do Advogado: ");
                    String nomeAdv = teclado.nextLine();

                    System.out.print("Status: ");
                    String status = teclado.nextLine();

                    System.out.print("Sentença: ");
                    String sentenca = teclado.nextLine();

                    System.out.print("Remuneração: ");
                    double remun = teclado.nextDouble();

                    System.out.print("Vai Recorrer: ");
                    boolean recorrer = teclado.nextBoolean();

                    FinalizarProcesso processo = new FinalizarProcesso(numProc, numAudi, trib, vara, orgao, categ,
                            assunto,
                            nomeEmp, nomeAdv, status, sentenca, remun, recorrer);

                    System.out.println("Escolha uma opção:");
                    System.out.println("--------------------------------------");
                    System.out.println("1 - Verificar Recorrência");
                    System.out.println("2 - Gerar Remuneração");
                    System.out.println("3 - Gerar Sentença");
                    System.out.println("4 - Mostrar dados do processo");
                    System.out.println("Digite qualquer outro número para sair");
                    System.out.println("--------------------------------------");
                    opcao = teclado.nextInt();

                    switch (opcao) {
                        case 1:
                            processo.verificarRecorrencia();
                            break;
                        case 2:
                            processo.gerarRemuneracao(processo.getRemuneracao(), processo.getSentenca(),
                                    processo.getVaiRecorrer());
                            break;
                        case 3:
                            processo.gerarSentenca();
                            break;
                        case 4:
                            System.out.println("Número do Processo: " + processo.getNumProcesso());
                            System.out.println("Número da Audiência: " + processo.getNumAudiencia());
                            System.out.println("Tribunal: " + processo.getTribunal());
                            System.out.println("Vara: " + processo.getVara());
                            System.out.println("Orgão Judicial: " + processo.getOrgaoJudicial());
                            System.out.println("Categoria: " + processo.getCategoria());
                            System.out.println("Assunto: " + processo.getAssunto());
                            System.out.println("Nome do Empregador: " + processo.getNomeEmpregador());
                            System.out.println("Nome do Advogado: " + processo.getNomeAdvogado());
                            System.out.println("Status: " + processo.getStatus());
                            System.out.println("Sentença: " + processo.getSentenca());
                            System.out.println("Remuneração: " + processo.getRemuneracao());
                            System.out.println("Vai Recorrer: " + processo.getVaiRecorrer());
                        default:
                            break;
                    }
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
