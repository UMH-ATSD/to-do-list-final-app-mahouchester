package todolist.dto;

import java.util.Objects;

public class EquipoData {

    private Long id;
    private String nombre;
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){return true;}
        if (!(o instanceof EquipoData)) return false;

        EquipoData that = (EquipoData) o;

        if (id != null && that.id != null) {
            return Objects.equals(id, that.id);
        }

        return nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}