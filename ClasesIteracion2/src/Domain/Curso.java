package Domain;

import java.util.List;

public class Curso {
    private int idCurso;
    private String sigla;
    private String nombre;
    private int creditos;
    private String ciclo;
    private boolean electivo;
    private int horasTeoria;
    private int horasPractica;
    private int horasLaboratorio;
    private int horasTeoricaPractica;
    private String descripcion;
    private String objetivoGeneral;
    private String modalidad;
    private List<Curso> electivos;
    private List<Curso> correquisitos;
    private List<Curso> requisitos;

    public Curso() {
    }

    public Curso(int idCurso, String sigla, String nombre, int creditos, 
            String ciclo, boolean electivo, int horasTeoria, 
            int horasPractica, int horasLaboratorio, int horasTeoricaPractica, 
            String descripcion, String objetivoGeneral, String modalidad, 
            List<Curso> electivos, List<Curso> correquisitos, List<Curso> requisitos) {
        this.idCurso = idCurso;
        this.sigla = sigla;
        this.nombre = nombre;
        this.creditos = creditos;
        this.ciclo = ciclo;
        this.electivo = electivo;
        this.horasTeoria = horasTeoria;
        this.horasPractica = horasPractica;
        this.horasLaboratorio = horasLaboratorio;
        this.horasTeoricaPractica = horasTeoricaPractica;
        this.descripcion = descripcion;
        this.objetivoGeneral = objetivoGeneral;
        this.modalidad = modalidad;
        this.electivos = electivos;
        this.correquisitos = correquisitos;
        this.requisitos = requisitos;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public boolean isElectivo() {
        return electivo;
    }

    public void setElectivo(boolean electivo) {
        this.electivo = electivo;
    }

    public int getHorasTeoria() {
        return horasTeoria;
    }

    public void setHorasTeoria(int horasTeoria) {
        this.horasTeoria = horasTeoria;
    }

    public int getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    public int getHorasTeoricaPractica() {
        return horasTeoricaPractica;
    }

    public void setHorasTeoricaPractica(int horasTeoricaPractica) {
        this.horasTeoricaPractica = horasTeoricaPractica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public List<Curso> getElectivos() {
        return electivos;
    }

    public void setElectivos(List<Curso> electivos) {
        this.electivos = electivos;
    }

    public List<Curso> getCorrequisitos() {
        return correquisitos;
    }

    public void setCorrequisitos(List<Curso> correquisitos) {
        this.correquisitos = correquisitos;
    }

    public List<Curso> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Curso> requisitos) {
        this.requisitos = requisitos;
    }

    @Override
    public String toString() {
        return "Curso{" + "idCurso=" + idCurso + ", sigla=" + 
                sigla + ", nombre=" + nombre + ", creditos=" + 
                creditos + ", ciclo=" + ciclo + ", electivo=" + 
                electivo + ", horasTeoria=" + horasTeoria + ", horasPractica=" + 
                horasPractica + ", horasLaboratorio=" + horasLaboratorio + 
                ", horasTeoricaPractica=" + horasTeoricaPractica + 
                ", descripcion=" + descripcion + ", objetivoGeneral=" + 
                objetivoGeneral + ", modalidad=" + modalidad + ", electivos=" + 
                electivos + ", correquisitos=" + correquisitos + 
                ", requisitos=" + requisitos + '}';
    }
    
}
