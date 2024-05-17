package Adapter;
public class AdaptadorTarjetaCredito implements MetodoPago {
    private PagoTarjetaCredito pagoTarjetaCredito;

    public AdaptadorTarjetaCredito(PagoTarjetaCredito pagoTarjetaCredito) {
        this.pagoTarjetaCredito = pagoTarjetaCredito;
    }

    @Override
    public void pagar(double monto) {
        pagoTarjetaCredito.pagarConTarjetaCredito(monto);
    }
}

