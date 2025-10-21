package co.edu.uniquindio.poo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.AllArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
public class Repartidor {
    private final String idRepartidor;
    @Setter
    private String nombre;
    @Setter
    private String documento;
    @Setter
    private String telefono;
    @Setter
    private EstadoDisponibilidad estado;
    @Setter
    private String zonaCobertura;
    
    public enum EstadoDisponibilidad {
        ACTIVO,
        INACTIVO,
        EN_RUTA
    }
    
    @Builder
    public Repartidor(String idRepartidor, String nombre, String documento, 
                     String telefono, String zonaCobertura) {
        this.idRepartidor = idRepartidor;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.zonaCobertura = zonaCobertura;
        this.estado = EstadoDisponibilidad.INACTIVO;
    }
}