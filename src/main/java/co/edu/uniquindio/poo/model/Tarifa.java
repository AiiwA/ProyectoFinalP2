package co.edu.uniquindio.poo.model;

public class Tarifa {
    private double base;
    private double pesoExtra;
    private double volumenExtra;
    private double recargoPrioridad;
    
    private Tarifa(Builder builder) {
        this.base = builder.base;
        this.pesoExtra = builder.pesoExtra;
        this.volumenExtra = builder.volumenExtra;
        this.recargoPrioridad = builder.recargoPrioridad;
    }
    
    // Builder Pattern
    public static class Builder {
        private double base;
        private double pesoExtra;
        private double volumenExtra;
        private double recargoPrioridad;
        
        public Builder() {
            // Valores por defecto
            this.base = 5000.0;
            this.pesoExtra = 1000.0;
            this.volumenExtra = 2000.0;
            this.recargoPrioridad = 8000.0;
        }
        
        public Builder conBase(double base) {
            this.base = base;
            return this;
        }
        
        public Builder conPesoExtra(double pesoExtra) {
            this.pesoExtra = pesoExtra;
            return this;
        }
        
        public Builder conVolumenExtra(double volumenExtra) {
            this.volumenExtra = volumenExtra;
            return this;
        }
        
        public Builder conRecargoPrioridad(double recargoPrioridad) {
            this.recargoPrioridad = recargoPrioridad;
            return this;
        }
        
        public Tarifa build() {
            return new Tarifa(this);
        }
    }
    
    // Getters
    public double getBase() {
        return base;
    }
    
    public double getPesoExtra() {
        return pesoExtra;
    }
    
    public double getVolumenExtra() {
        return volumenExtra;
    }
    
    public double getRecargoPrioridad() {
        return recargoPrioridad;
    }
}
