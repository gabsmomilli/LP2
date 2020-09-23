public class EmpregadoTest {
    public static void main(String[] args) {

        Empregado gabriela = new Empregado ("Gabriela", "Momilli", 850.00);
        Empregado ramon= new Empregado ("Ramon", "Fernandes", 0);

        System.out.println("Antes do aumento do salário:");

        System.out.printf("\nSalário do Gabriela: R$ %.2f .\n", gabriela.getSalario());
        System.out.printf("Salário da Ramon: R$ %.2f .\n", ramon.getSalario());

        gabriela.setSalario(gabriela.getSalario()*1.1);
        ramon.setSalario(ramon.getSalario()*1.1);

        System.out.println("\nDepois do aumento do salário:");

        System.out.printf("\nSalário do Gabriela: R$ %.2f .\n", gabriela.getSalario());
        System.out.printf("Salário da Ramon: R$ %.2f .\n", ramon.getSalario());
    }
}
