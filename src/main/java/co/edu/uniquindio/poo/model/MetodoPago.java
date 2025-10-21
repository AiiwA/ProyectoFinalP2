package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.strategy.EstrategiaPago;

public class MetodoPago {
    private final String idMetodoPago;
    private final EstrategiaPago estrategia;
    
    private MetodoPago(Builder builder) {
        this.idMetodoPago = builder.idMetodoPago;
        this.estrategia = builder.estrategia;
    }
    
    public boolean procesarPago(double monto) {
        return estrategia.procesarPago(monto);
    }
    
    public String getTipo() {
        return estrategia.getTipo();
    }
    
    // Builder Pattern
    public static class Builder {
        private String idMetodoPago;
        private EstrategiaPago estrategia;
        
        public Builder(String idMetodoPago) {
            this.idMetodoPago = idMetodoPago;
        }
        
        public Builder conEstrategia(EstrategiaPago estrategia) {
            this.estrategia = estrategia;
            return this;
        }
        
        public MetodoPago build() {
            if (estrategia == null) {
                throw new IllegalStateException("La estrategia de pago no puede ser nula");
            }
            return new MetodoPago(this);
        }
    }
    
    // Getters
    public String getIdMetodoPago() {
        return idMetodoPago;
    }
    
    public EstrategiaPago getEstrategia() {
        return estrategia;
    }
}