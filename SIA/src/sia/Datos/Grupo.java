package sia.Datos;

import java.util.ArrayList;
import sia.Logica.SIA;

public class Grupo {
    private int identificador;
    private Profesor profesor;
    private String horario;
    private ArrayList<Estudiante> estudiante;
    private String materia;
    private ArrayList<Notas> notas;
    private Salon salon;

    public Grupo(){
        this(-1,-1,"Sin horario hasta la semana 16 :c ", "No hay materia asignada", -1 );
    }

    public Grupo(int identificador, long profesor, String horario, String materia, int salon){
    this.identificador = identificador;
    this.profesor = SIA.buscarProfesor(profesor);
    this.horario = horario;
    this.estudiante = null;
    this.materia = materia;
    this.notas = null;
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

    public String getMateria(){
        return this.materia;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    public ArrayList<Notas> getNotas(){
        return this.notas;
    }

    public void setNotas(ArrayList<Notas> notas){
        this.notas = notas;
    }

    public Salon getSalon(){
        return this.salon;
    }

    public void setSalon (Salon salon){
        this.salon = salon;
    }

}
