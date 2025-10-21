package co.edu.uniquindio.poo.model;

import java.util.HashSet;
import java.util.Set;

public class Administrador {
    private final String idAdmin;
    private String nombre;
    private Set<Permiso> permisos;
    
    public enum Permiso {
        GESTIONAR_USUARIOS,
        GESTIONAR_REPARTIDORES,
        GESTIONAR_ENVIOS,
        GESTIONAR_TARIFAS,
        GESTIONAR_INCIDENCIAS,
        VER_METRICAS,
        GENERAR_REPORTES
    }
    
    private Administrador(Builder builder) {
        this.idAdmin = builder.idAdmin;
        this.nombre = builder.nombre;
        this.permisos = new HashSet<>(builder.permisos);
    }
    
    // Builder Pattern
    public static class Builder {
        private String idAdmin;
        private String nombre;
        private Set<Permiso> permisos;
        
        public Builder(String idAdmin) {
            this.idAdmin = idAdmin;
            this.permisos = new HashSet<>();
        }
        
        public Builder conNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        
        public Builder conPermiso(Permiso permiso) {
            this.permisos.add(permiso);
            return this;
        }
        
        public Builder conPermisos(Set<Permiso> permisos) {
            this.permisos.addAll(permisos);
            return this;
        }
        
        public Administrador build() {
            return new Administrador(this);
        }
    }
    
    // Getters
    public String getIdAdmin() {
        return idAdmin;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Set<Permiso> getPermisos() {
        return new HashSet<>(permisos);
    }
    
    public boolean tienePermiso(Permiso permiso) {
        return permisos.contains(permiso);
    }
}
