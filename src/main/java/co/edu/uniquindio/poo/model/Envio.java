package co.edu.uniquindio.poo.model;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@ToString
@Builder(toBuilder = true)
public class Envio {
    @NonNull
    private final String idEnvio;
    
    @Setter @NonNull
    private Direccion origen;
    
    @Setter @NonNull
    private Direccion destino;
    
    @Builder.Default
    private double peso = 0.0;
    
    @Builder.Default
    private double largo = 0.0;
    
    @Builder.Default
    private double ancho = 0.0;
    
    @Builder.Default
    private double alto = 0.0;
    
    @Setter
    @Builder.Default
    private EstadoEnvio estado = EstadoEnvio.SOLICITADO;
    
    @Setter @NonNull
    private Usuario usuario;
    
    @Setter
    private Repartidor repartidor;
    
    @Setter
    @Builder.Default
    private double costo = 0.0;
    
    @Builder.Default
    private final LocalDateTime fechaCreacion = LocalDateTime.now();
    
    @NonNull
    private final LocalDateTime fechaEntregaEstimada;
    
    public enum EstadoEnvio {
        SOLICITADO,
        ASIGNADO,
        EN_RUTA,
        ENTREGADO,
        INCIDENCIA
    }
    
    public double getVolumen() {
        return largo * ancho * alto;
    }
}
