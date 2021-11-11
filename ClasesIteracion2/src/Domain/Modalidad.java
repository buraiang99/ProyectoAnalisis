package Domain;

import java.util.List;

public class Modalidad {
    private int idModalidad;
    private String tipoModalidad;
    private List<Curso> cursos;

    public Modalidad() {
    }

    public Modalidad(int idModalidad, String tipoModalidad, List<Curso> cursos) {
        this.idModalidad = idModalidad;
        this.tipoModalidad = tipoModalidad;
        this.cursos = cursos;
    }

    public int getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(int idModalidad) {
        this.idModalidad = idModalidad;
    }

    public String getTipoModalidad() {
        return tipoModalidad;
    }

    public void setTipoModalidad(String tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Modalidad{" + "idModalidad=" + idModalidad + 
                ", tipoModalidad=" + tipoModalidad + ", cursos=" + cursos + '}';
    }
    
}
