package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final String idUsuario;
    private String nombreCompleto;
    private String correoElectronico;
    private String telefono;
    private List<Direccion> direccionesFrecuentes;
    private List<MetodoPago> metodosPago;
    
    private Usuario(Builder builder) {
        this.idUsuario = builder.idUsuario;
        this.nombreCompleto = builder.nombreCompleto;
        this.correoElectronico = builder.correoElectronico;
        this.telefono = builder.telefono;
        this.direccionesFrecuentes = new ArrayList<>();
        this.metodosPago = new ArrayList<>();
    }
    
    // Builder Pattern
    public static class Builder {
        private String idUsuario;
        private String nombreCompleto;
        private String correoElectronico;
        private String telefono;
        
        public Builder(String idUsuario) {
            this.idUsuario = idUsuario;
        }
        
        public Builder conNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
            return this;
        }
        
        public Builder conCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
            return this;
        }
        
        public Builder conTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }
        
        public Usuario build() {
            return new Usuario(this);
        }
    }
    
    // Getters
    public String getIdUsuario() {
        return idUsuario;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public List<Direccion> getDireccionesFrecuentes() {
        return new ArrayList<>(direccionesFrecuentes);
    }
    
    public List<MetodoPago> getMetodosPago() {
        return new ArrayList<>(metodosPago);
    }
}