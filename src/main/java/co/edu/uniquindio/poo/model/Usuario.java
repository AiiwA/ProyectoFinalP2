package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.AllArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
public class Usuario {
    private final String idUsuario;
    @Setter
    private String nombreCompleto;
    @Setter
    private String correoElectronico;
    @Setter
    private String telefono;
    @Builder.Default
    private List<Direccion> direccionesFrecuentes = new ArrayList<>();
    @Builder.Default
    private List<MetodoPago> metodosPago = new ArrayList<>();
    
    public List<Direccion> getDireccionesFrecuentes() {
        return new ArrayList<>(direccionesFrecuentes);
    }
    
    public List<MetodoPago> getMetodosPago() {
        return new ArrayList<>(metodosPago);
    }
    
    public void agregarDireccionFrecuente(Direccion direccion) {
        direccionesFrecuentes.add(direccion);
    }
    
    public void agregarMetodoPago(MetodoPago metodoPago) {
        metodosPago.add(metodoPago);
    }
    
    public void removerDireccionFrecuente(Direccion direccion) {
        direccionesFrecuentes.remove(direccion);
    }
    
    public void removerMetodoPago(MetodoPago metodoPago) {
        metodosPago.remove(metodoPago);
    }
}