package co.edu.uniquindio.poo.model;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.AllArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
public class Administrador {
    private final String idAdmin;
    @Setter
    private String nombre;
    @Setter
    private String correo;
    @Builder.Default
    private Set<Permiso> permisos = new HashSet<>();
    
    public enum Permiso {
        GESTIONAR_USUARIOS,
        GESTIONAR_REPARTIDORES,
        GESTIONAR_ENVIOS,
        GESTIONAR_TARIFAS,
        GESTIONAR_INCIDENCIAS,
        VER_METRICAS,
        GENERAR_REPORTES
    }
    
    public Set<Permiso> getPermisos() {
        return new HashSet<>(permisos);
    }
    
    public boolean tienePermiso(Permiso permiso) {
        return permisos.contains(permiso);
    }
    
    public void agregarPermiso(Permiso permiso) {
        permisos.add(permiso);
    }
    
    public void removerPermiso(Permiso permiso) {
        permisos.remove(permiso);
    }
}
