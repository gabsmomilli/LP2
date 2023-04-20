package edu.fatec.lp2.execicio1;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    public Whatsapp(Contatinho[] contatos, Mensagem[] mensagens){
        this.contatos = contatos;
        this.mensagens = mensagens;
    }

    public void listarContatos() {
        System.out.println("Lista de contatos: ");
        for( Contatinho contato : contatos) {
            System.out.println(contato.getNome());
        }
    }

    public void listarMensagens() {
        System.out.println("Lista de Mensagens:");
        for (Mensagem mensagem : mensagens) {
            System.out.println(mensagem.getConteudo());
        }
    }
}
