package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel{
    private Integer quantidade;
    private Produto produto;
    private Double desconto;

    public ItemCompra(Integer quantidade, Produto produto, Double desconto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public void ItemComprado(Produto produto, Double desconto){

    }

    public String itemComprado(){
        return this.produto.getNome() + "       "+
                this.quantidade + "x (" + this.produto.getPreco() + " cada";
    }

    @Override
    public Double calcularPreco(){
        double precoCompra = this.quantidade * this.produto.getPreco();
        double precoFinal = precoCompra - this.desconto;
        return precoFinal;
    }
}
