package etapa3_questao6;

public abstract class Documento {
    private Formatacao estilo;
    private String mensagem;

    public Documento(Formatacao estilo, String mensagem) {
        this.estilo = estilo;
        this.mensagem = mensagem;
    }

    public String formatar() {
        return estilo.formatar(mensagem);
    }

    public Formatacao getEstilo() {
        return estilo;
    }

    public void setEstilo(Formatacao estilo) {
        this.estilo = estilo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
