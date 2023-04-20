package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel{
    private ItemCompra[] itensCompra;
    private int qntdMaxima;

    public ItemCompra[] getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(ItemCompra[] itensCompra) {
        this.itensCompra = itensCompra;
    }

    public Integer getQntdMaxima() {
        return qntdMaxima;
    }

    public void setQntdMaxima(int qntdMaxima) {
        this.qntdMaxima = qntdMaxima;
    }

    public ListaCompra(ItemCompra[] itensCompra, int qntdMaxima) {
        this.itensCompra = itensCompra;
        this.qntdMaxima = qntdMaxima;
    }

    public void incluirItem(ItemCompra item){
        for (int i = 0; i < itensCompra.length; i++){
            if(itensCompra[i] == null){
                itensCompra[i] = item;
                return;
            }
        }
    }
    @Override
    public Double calcularPreco(){
        Double valorFinalCompra = 0.0;
        for(ItemCompra compra: itensCompra){
            double precoCompra = compra.getProduto().getPreco();
            double precoComDesconto = precoCompra - compra.getDesconto();
            valorFinalCompra = valorFinalCompra + precoComDesconto;
        }
        return valorFinalCompra;
    }
}
