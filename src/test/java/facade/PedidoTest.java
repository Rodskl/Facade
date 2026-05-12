package facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarPendenciaEstoquePreparo() {
        Pedido pedido = new Pedido();
        SetorEstoque.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.liberarPreparo());
    }

    @Test
    void deveRetornarPendenciaFinanceiroPreparo() {
        Pedido pedido = new Pedido();
        SetorFinanceiro.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.liberarPreparo());
    }

    @Test
    void deveRetornarPedidoSemPendenciaPreparo() {
        Pedido pedido = new Pedido();

        assertEquals(true, pedido.liberarPreparo());
    }
}