package sia.Datos;
import sia.Logica.SIA;
public class Notas {

    private Grupo grupo;
    private Estudiante estudiante;
    private double valor;
    private Profesor profesor;
    
    public Notas(){
    this(-1, -1, -1, -1);
    }
    
    public Notas(int grupo, long estudiante, double valor, long profesor ){
    this.grupo = SIA.buscarGrupo(grupo);
    this.estudiante = SIA.buscarEstudiante(estudiante);
    this.valor = valor;
    this.profesor = SIA.buscarProfesor(profesor);
    }
    
    public Grupo getGrupo(){
    return this.grupo;
    }
    
    public void setGrupo(Grupo grupo){
    this.grupo = grupo;
    }
    
    public Estudiante getEstudiante(){
    return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante){
    this.estudiante = estudiante;
    }
    
    public double getValor(){
    return this.valor;
    }
    
    public void setValor(double valor){
    this.valor = valor;
    }
    
    public Profesor getProfesor(){
    return this.profesor;
    }
    
    public void setProfesor(Profesor profesor){
    this.profesor = profesor;
    }
}
