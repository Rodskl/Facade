package facade;

public class HamburgueriaFacade {

    public static boolean verificarPendenciasPreparo(Pedido pedido) {
        if (SetorEstoque.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        if (SetorFinanceiro.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        return true;
    }
}