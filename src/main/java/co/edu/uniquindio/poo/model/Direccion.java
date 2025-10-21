package co.edu.uniquindio.poo.model;

public class Direccion {
    private final String idDireccion;
    private String alias;
    private String calle;
    private String ciudad;
    private double latitud;
    private double longitud;
    
    private Direccion(Builder builder) {
        this.idDireccion = builder.idDireccion;
        this.alias = builder.alias;
        this.calle = builder.calle;
        this.ciudad = builder.ciudad;
        this.latitud = builder.latitud;
        this.longitud = builder.longitud;
    }
    
    // Builder Pattern
    public static class Builder {
        private String idDireccion;
        private String alias;
        private String calle;
        private String ciudad;
        private double latitud;
        private double longitud;
        
        public Builder(String idDireccion) {
            this.idDireccion = idDireccion;
        }
        
        public Builder conAlias(String alias) {
            this.alias = alias;
            return this;
        }
        
        public Builder conCalle(String calle) {
            this.calle = calle;
            return this;
        }
        
        public Builder conCiudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }
        
        public Builder conCoordenadas(double latitud, double longitud) {
            this.latitud = latitud;
            this.longitud = longitud;
            return this;
        }
        
        public Direccion build() {
            return new Direccion(this);
        }
    }
    
    // Getters
    public String getIdDireccion() {
        return idDireccion;
    }
    
    public String getAlias() {
        return alias;
    }
    
    public String getCalle() {
        return calle;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    public double getLatitud() {
        return latitud;
    }
    
    public double getLongitud() {
        return longitud;
    }
}