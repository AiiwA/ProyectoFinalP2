package co.edu.uniquindio.poo.model;

import java.time.LocalDateTime;

public class Pago {
    private final String idPago;
    private double monto;
    private LocalDateTime fecha;
    private MetodoPago metodoPago;
    private EstadoPago estado;
    private Envio envio;
    
    public enum EstadoPago {
        PENDIENTE,
        APROBADO,
        RECHAZADO,
        CANCELADO
    }
    
    private Pago(Builder builder) {
        this.idPago = builder.idPago;
        this.monto = builder.monto;
        this.fecha = builder.fecha;
        this.metodoPago = builder.metodoPago;
        this.estado = EstadoPago.PENDIENTE;
        this.envio = builder.envio;
    }
    
    // Builder Pattern
    public static class Builder {
        private String idPago;
        private double monto;
        private LocalDateTime fecha;
        private MetodoPago metodoPago;
        private Envio envio;
        
        public Builder(String idPago) {
            this.idPago = idPago;
        }
        
        public Builder conMonto(double monto) {
            this.monto = monto;
            return this;
        }
        
        public Builder conFecha(LocalDateTime fecha) {
            this.fecha = fecha;
            return this;
        }
        
        public Builder conMetodoPago(MetodoPago metodoPago) {
            this.metodoPago = metodoPago;
            return this;
        }
        
        public Builder conEnvio(Envio envio) {
            this.envio = envio;
            return this;
        }
        
        public Pago build() {
            return new Pago(this);
        }
    }
    
    // Getters y Setters
    public String getIdPago() {
        return idPago;
    }
    
    public double getMonto() {
        return monto;
    }
    
    public LocalDateTime getFecha() {
        return fecha;
    }
    
    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
    
    public EstadoPago getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }
    
    public Envio getEnvio() {
        return envio;
    }
}
