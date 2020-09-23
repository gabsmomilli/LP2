public class InvoiceTest {
    public static void main(String[] args) {

        Invoice fatura = new Invoice(01021, "bolsa Victor Hugo", 2, 999.0);

        System.out.printf("A quantidade de itens é: " + fatura.getQuant() + ".\n");
        System.out.printf("O valor de cada item é R$ %.2f.",fatura.getPreco());
        System.out.printf("\nO valor da fatura é R$ %.2f.",fatura.getInvoiceAmount());
    }
}