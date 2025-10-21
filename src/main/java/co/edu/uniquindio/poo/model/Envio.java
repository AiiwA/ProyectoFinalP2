package co.edu.uniquindio.poo.model;

public class Envio {
    private final String idEnvio;
    private Direccion origen;
    private Direccion destino;
    private double peso;
    private double volumen;
    private EstadoEnvio estado;
    private Usuario usuario;
    private Repartidor repartidor;
    private double costo;
    
    public enum EstadoEnvio {
        SOLICITADO,
        ASIGNADO,
        EN_RUTA,
        ENTREGADO,
        INCIDENCIA
    }
    
    private Envio(Builder builder) {
        this.idEnvio = builder.idEnvio;
        this.origen = builder.origen;
        this.destino = builder.destino;
        this.peso = builder.peso;
        this.volumen = builder.volumen;
        this.estado = EstadoEnvio.SOLICITADO;
    }
    
    // Builder Pattern
    public static class Builder {
        private String idEnvio;
        private Direccion origen;
        private Direccion destino;
        private double peso;
        private double volumen;
        
        public Builder(String idEnvio) {
            this.idEnvio = idEnvio;
        }
        
        public Builder conOrigen(Direccion origen) {
            this.origen = origen;
            return this;
        }
        
        public Builder conDestino(Direccion destino) {
            this.destino = destino;
            return this;
        }
        
        public Builder conPeso(double peso) {
            this.peso = peso;
            return this;
        }
        
        public Builder conVolumen(double volumen) {
            this.volumen = volumen;
            return this;
        }
        
        public Envio build() {
            return new Envio(this);
        }
    }
    
    // Getters
    public String getIdEnvio() {
        return idEnvio;
    }
    
    public Direccion getOrigen() {
        return origen;
    }
    
    public Direccion getDestino() {
        return destino;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getVolumen() {
        return volumen;
    }
    
    public EstadoEnvio getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Repartidor getRepartidor() {
        return repartidor;
    }
    
    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }
    
    public double getCosto() {
        return costo;
    }
    
    public void setCosto(double costo) {
        this.costo = costo;
    }
}