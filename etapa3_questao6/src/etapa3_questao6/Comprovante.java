package etapa3_questao6;

public class Comprovante extends Documento {

    public Comprovante(Formatacao estilo, String mensagem) {
        super(estilo, mensagem);
    }

    @Override
    public String toString() {
        return "COMPROVANTE\n" + formatar();
    }
}

