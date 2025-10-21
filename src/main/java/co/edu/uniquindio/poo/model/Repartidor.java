package co.edu.uniquindio.poo.model;

public class Repartidor {
    private final String idRepartidor;
    private String nombre;
    private String documento;
    private String telefono;
    private EstadoDisponibilidad estado;
    private String zonaCobertura;
    
    public enum EstadoDisponibilidad {
        ACTIVO,
        INACTIVO,
        EN_RUTA
    }
    
    private Repartidor(Builder builder) {
        this.idRepartidor = builder.idRepartidor;
        this.nombre = builder.nombre;
        this.documento = builder.documento;
        this.telefono = builder.telefono;
        this.zonaCobertura = builder.zonaCobertura;
        this.estado = EstadoDisponibilidad.INACTIVO;
    }
    
    // Builder Pattern
    public static class Builder {
        private String idRepartidor;
        private String nombre;
        private String documento;
        private String telefono;
        private String zonaCobertura;
        
        public Builder(String idRepartidor) {
            this.idRepartidor = idRepartidor;
        }
        
        public Builder conNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        
        public Builder conDocumento(String documento) {
            this.documento = documento;
            return this;
        }
        
        public Builder conTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }
        
        public Builder conZonaCobertura(String zonaCobertura) {
            this.zonaCobertura = zonaCobertura;
            return this;
        }
        
        public Repartidor build() {
            return new Repartidor(this);
        }
    }
    
    // Getters y Setters
    public String getIdRepartidor() {
        return idRepartidor;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDocumento() {
        return documento;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public EstadoDisponibilidad getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoDisponibilidad estado) {
        this.estado = estado;
    }
    
    public String getZonaCobertura() {
        return zonaCobertura;
    }
}