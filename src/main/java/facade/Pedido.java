package facade;

public class Pedido {

    public boolean liberarPreparo() {
        return HamburgueriaFacade.verificarPendenciasPreparo(this);
    }
}