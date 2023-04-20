package edu.fatec.lp2.execicio1;

public class MsgAudio extends Mensagem{
    private Integer duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, String conteudo, Integer duracao) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String mensagem) {
        return this;
    }
}
