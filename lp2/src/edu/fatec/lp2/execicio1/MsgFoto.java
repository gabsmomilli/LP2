package edu.fatec.lp2.execicio1;

public class MsgFoto extends Mensagem{
    private Integer tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo, Integer tamanho) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String mensagem) {
        return this;
    }
}
