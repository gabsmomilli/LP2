package edu.fatec.lp2.execicio1;

public class MsgTexto extends Mensagem{
    private Integer numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo, Integer numChar) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    public Integer getNumChar() {
        return numChar;
    }

    public void setNumChar(Integer numChar) {
        this.numChar = numChar;
    }

    @Override
    public Mensagem sendMessage(String mensagem) {
        return this;
    }
}
