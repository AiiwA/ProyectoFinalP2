package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestion {
    private static SistemaGestion instancia;
    private List<Usuario> usuarios;
    private List<Repartidor> repartidores;
    private List<Envio> envios;
    private List<Pago> pagos;
    private List<Incidencia> incidencias;
    private List<Administrador> administradores;
    
    private SistemaGestion() {
        this.usuarios = new ArrayList<>();
        this.repartidores = new ArrayList<>();
        this.envios = new ArrayList<>();
        this.pagos = new ArrayList<>();
        this.incidencias = new ArrayList<>();
        this.administradores = new ArrayList<>();
    }
    
    public static SistemaGestion obtenerInstancia() {
        if (instancia == null) {
            instancia = new SistemaGestion();
        }
        return instancia;
    }
    
    // Métodos de gestión
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public void registrarRepartidor(Repartidor repartidor) {
        repartidores.add(repartidor);
    }
    
    public void registrarEnvio(Envio envio) {
        envios.add(envio);
    }
    
    public void registrarPago(Pago pago) {
        pagos.add(pago);
    }
    
    public void registrarIncidencia(Incidencia incidencia) {
        incidencias.add(incidencia);
    }
    
    public void registrarAdministrador(Administrador admin) {
        administradores.add(admin);
    }
    
    // Getters (retornando copias defensivas)
    public List<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios);
    }
    
    public List<Repartidor> getRepartidores() {
        return new ArrayList<>(repartidores);
    }
    
    public List<Envio> getEnvios() {
        return new ArrayList<>(envios);
    }
    
    public List<Pago> getPagos() {
        return new ArrayList<>(pagos);
    }
    
    public List<Incidencia> getIncidencias() {
        return new ArrayList<>(incidencias);
    }
    
    public List<Administrador> getAdministradores() {
        return new ArrayList<>(administradores);
    }
}
