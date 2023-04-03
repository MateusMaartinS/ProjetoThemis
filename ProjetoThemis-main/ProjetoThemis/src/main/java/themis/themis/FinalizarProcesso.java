package themis.themis;

/**
 *
 * @author Fernanda Desenvolvedor, Renan Analista
 */
public class FinalizarProcesso {
    private int numProcesso;
    private int numAudiencia;
    public String tribunal;
    public String vara;
    public String orgaoJudicial;
    public String categoria;
    private String assunto;
    private String nomeEmpregador;
    private String nomeAdvogado;
    public String status;
    private String sentenca;
    private double remuneracao;
    private boolean vaiRecorrer;
    
    public FinalizarProcesso (int numProcesso, int numAudiencia, String tribunal, String vara, String orgaoJudicial, String categoria, String assunto, String nomeEmpregador, String nomeAdvogado, String status, String sentenca, double remuneracao, boolean vaiRecorrer) {
        this.numProcesso = numProcesso;
        this.numAudiencia = numAudiencia;
        this.tribunal = tribunal;
        this.vara = vara;
        this.orgaoJudicial = orgaoJudicial;
        this.categoria = categoria;
        this.assunto = assunto;
        this.nomeEmpregador = nomeEmpregador;
        this.nomeAdvogado = nomeAdvogado;
        this.status = status;
        this.sentenca = sentenca;
        this.remuneracao = remuneracao;
        this.vaiRecorrer = vaiRecorrer;
    }
    
    public void verificarRecorrencia () {
        if (this.vaiRecorrer) {
            System.out.println("Audiência de número: " + this.numAudiencia + " irá recorrer");
        } else {
            System.out.println("Audiência de número: " + this.numAudiencia + " não irá recorrer");
        }
    }
    
    public void gerarRemuneracao (double remuneracao, String sentenca, boolean vaiRecorrer) {
        if (sentenca != null && !vaiRecorrer) {
            System.out.println("Remuneração: " + remuneracao);
        } else {
            System.out.println("A remuneração ainda não pode ser gerada");
        }
    }
    
    public void gerarSentenca () {
        System.out.print("Sentença: " + this.sentenca);
    }
    
    public int getNumProcesso () {
        return this.numProcesso;
    }
    
    public int getNumAudiencia () {
        return this.numAudiencia;
    }
    
    public String getTribunal () {
        return this.tribunal;
    }
    
    public String getVara () {
        return this.vara;
    }
    
    public String getOrgaoJudicial () {
        return this.orgaoJudicial;
    }
    
    public String getCategoria () {
        return this.categoria;
    }
    
    public String  getAssunto () {
        return this.assunto;
    }
    
    public String getNomeEmpregador () {
        return this.nomeEmpregador;
    }
    
    public String getNomeAdvogado () {
        return this.nomeAdvogado;
    }
    
    public String getStatus () {
        return this.status;
    }
    
    public String getSentenca () {
        return this.sentenca;
    }
    
    public double getRemuneracao () {
        return this.remuneracao;
    } 
    
    public boolean getVaiRecorrer () {
        return this.vaiRecorrer;
    }
}
