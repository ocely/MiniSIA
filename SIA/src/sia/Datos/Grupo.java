package sia.Datos;

import java.util.ArrayList;
import sia.Logica.SIA;

public class Grupo {
    private int identificador;
    private Profesor profesor;
    private String horario;
    private ArrayList<Estudiante> estudiante;
    private Asignatura asignatura;
    private ArrayList<Notas> notas;
    private Salon salon;

    public Grupo(){
        this(-1,-1,"Sin horario hasta la semana 16 :c ", "No hay materia asignada", -1 );
    }

    public Grupo(int identificador, long profesor, String horario, String asignatura, int salon){
    this.identificador = identificador;
    this.profesor = SIA.buscarProfesor(profesor);
    this.horario = horario;
    this.estudiante = new ArrayList();
    this.asignatura = SIA.buscarAsignaturaPorNombre(asignatura); ////Hacer la funci[on de buscar
    this.notas = new ArrayList();
    this.salon = SIA.buscarSalon(salon);
    }


    public int getIdentificador(){
    return this.identificador;
    }

    public void setIdentificador(int identificador){
    this.identificador = identificador;
    }
    public Profesor getProgresor(){
        return this.profesor;
    }

    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }

    public String getHorario(){
        return this.horario;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public ArrayList<Estudiante> getEstudiante(){
        return this.estudiante;
    }

    public void setEstudiante(ArrayList<Estudiante> estudiante){
        this.estudiante = estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante){
        this.estudiante.add(estudiante);
    }

    public Asignatura getAsignatura(){
        return this.asignatura;
    }

    public void setAsignatura(Asignatura asignatura){
        this.asignatura = asignatura;
    }

    public ArrayList<Notas> getNotas(){
        return this.notas;
    }

    public void setNotas(ArrayList<Notas> notas){
        this.notas = notas;
    }
    
    public void setNotas(Notas nota){
        this.notas.add(nota);
    }

    public Salon getSalon(){
        return this.salon;
    }

    public void setSalon (Salon salon){
        this.salon = salon;
    }

}
