package Adapter;
public class Cliente {
    public static void main(String[] args) {
        PagoTarjetaCredito pagoTarjetaCredito = new PagoTarjetaCredito();
        MetodoPago adaptadorTarjetaCredito = new AdaptadorTarjetaCredito(pagoTarjetaCredito);
        
        PagoPayPal pagoPayPal = new PagoPayPal();
        MetodoPago adaptadorPayPal = new AdaptadorPayPal(pagoPayPal);
        
        PagoBitcoin pagoBitcoin = new PagoBitcoin();
        MetodoPago adaptadorBitcoin = new AdaptadorBitcoin(pagoBitcoin);

        adaptadorTarjetaCredito.pagar(100.0);
        adaptadorPayPal.pagar(200.0);
        adaptadorBitcoin.pagar(300.0);
    }
}


