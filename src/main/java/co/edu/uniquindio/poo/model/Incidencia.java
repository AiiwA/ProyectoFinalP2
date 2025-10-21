package co.edu.uniquindio.poo.model;

import java.time.LocalDateTime;

public class Incidencia {
    private final String idIncidencia;
    private String descripcion;
    private LocalDateTime fecha;
    private EstadoIncidencia estado;
    private Envio envio;
    
    public enum EstadoIncidencia {
        REPORTADA,
        EN_REVISION,
        RESUELTA,
        CANCELADA
    }
    
    private Incidencia(Builder builder) {
        this.idIncidencia = builder.idIncidencia;
        this.descripcion = builder.descripcion;
        this.fecha = builder.fecha;
        this.estado = EstadoIncidencia.REPORTADA;
        this.envio = builder.envio;
    }
    
    // Builder Pattern
    public static class Builder {
        private String idIncidencia;
        private String descripcion;
        private LocalDateTime fecha;
        private Envio envio;
        
        public Builder(String idIncidencia) {
            this.idIncidencia = idIncidencia;
        }
        
        public Builder conDescripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }
        
        public Builder conFecha(LocalDateTime fecha) {
            this.fecha = fecha;
            return this;
        }
        
        public Builder conEnvio(Envio envio) {
            this.envio = envio;
            return this;
        }
        
        public Incidencia build() {
            return new Incidencia(this);
        }
    }
    
    // Getters y Setters
    public String getIdIncidencia() {
        return idIncidencia;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public LocalDateTime getFecha() {
        return fecha;
    }
    
    public EstadoIncidencia getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoIncidencia estado) {
        this.estado = estado;
    }
    
    public Envio getEnvio() {
        return envio;
    }
}
