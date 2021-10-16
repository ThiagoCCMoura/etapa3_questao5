package etapa3_questao6;

public class Requisicao extends Documento {

    public Requisicao(Formatacao estilo, String mensagem) {
        super(estilo, mensagem);
    }

    @Override
    public String toString() {
        return "REQUISIÇÃO\n" + formatar();
    }

    
}
