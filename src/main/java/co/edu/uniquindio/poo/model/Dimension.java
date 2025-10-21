package co.edu.uniquindio.poo.model;

public class Dimension {
    private final double largo;
    private final double ancho;
    private final double alto;
    
    public Dimension(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double getLargo() {
        return largo;
    }
    
    public double getAncho() {
        return ancho;
    }
    
    public double getAlto() {
        return alto;
    }
    
    public double getVolumen() {
        return largo * ancho * alto;
    }
}