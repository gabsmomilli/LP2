public class Invoice {

    private int numItem;
    private String descricao;
    private int quant;
    private double preco;

    public Invoice(int numItem, String descricao, int quant, double preco) {
        this.numItem = numItem;
        this.descricao = descricao;
        if (quant < 0) {
            this.quant = 0;
        } else {
            this.quant = quant;
        }
        if (preco < 0.0) {
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }

    public double getInvoiceAmount() {
        return this.quant * this.preco;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        if (quant < 0) {
            this.quant = 0;
        } else {
            this.quant = quant;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0.0) {
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }
    public static Double getInvoiceAmount(double preco, double quant){
        return (preco * quant);
    }
}