package Adapter;
public class AdaptadorPayPal implements MetodoPago {
    private PagoPayPal pagoPayPal;

    public AdaptadorPayPal(PagoPayPal pagoPayPal) {
        this.pagoPayPal = pagoPayPal;
    }

    @Override
    public void pagar(double monto) {
        pagoPayPal.pagarConPayPal(monto);
    }
}


