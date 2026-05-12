package facade;

public class SetorFinanceiro extends Setor {
    private static SetorFinanceiro instancia = new SetorFinanceiro();

    private SetorFinanceiro() {}

    public static SetorFinanceiro getInstancia() {
        return instancia;
    }
}