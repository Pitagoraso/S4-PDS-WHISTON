package Adapter;
public class AdaptadorBitcoin implements MetodoPago {
    private PagoBitcoin pagoBitcoin;

    public AdaptadorBitcoin(PagoBitcoin pagoBitcoin) {
        this.pagoBitcoin = pagoBitcoin;
    }

    @Override
    public void pagar(double monto) {
        pagoBitcoin.pagarConBitcoin(monto);
    }
}


