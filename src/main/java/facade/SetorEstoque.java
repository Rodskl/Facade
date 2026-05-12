package facade;

public class SetorEstoque extends Setor {
    private static SetorEstoque instancia = new SetorEstoque();

    private SetorEstoque() {}

    public static SetorEstoque getInstancia() {
        return instancia;
    }
}