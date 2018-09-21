package sia.Datos;

import java.util.ArrayList;
import sia.Logica.SIA;
public class ProgramaCurricular {
    private int codigo;
    private String nombre;
    private Facultad facultad;
    private ArrayList<Estudiante> estudiante;
    
    public ProgramaCurricular(){
    this(-1, "No ha asignado nombre a este programa curricular", "Sin Facultad :c ");
    }
    
    public ProgramaCurricular( int codigo, String nombre, String facultad){
    this.codigo = codigo;
    this.nombre = nombre;
    this.facultad = SIA.buscarFacultadPorNombre(facultad);
    this.estudiante = new ArrayList();
    }
    
    public ProgramaCurricular( int codigo, String nombre, int facultad){
    this.codigo = codigo;
    this.nombre = nombre;
    this.facultad = SIA.buscarFacultadPorCodigo(facultad);
    this.estudiante = null;
    }
        
    public int getCodigo(){
    return this.codigo;
    }
    
    public void setCodigo(int codigo){
    this.codigo = codigo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
        
    public Facultad getFacultad(){
        return this.facultad;
    }
    
    public void setFacultad(Facultad facultad){
        this.facultad = facultad;
    }
    
    public ArrayList<Estudiante> getEstudiante(){
        return this.estudiante;
    }
    
    public void setEstudiante (ArrayList<Estudiante> estudiante){
        this.estudiante = estudiante;
    }
    public void setEstudiante (Estudiante estudiante){
        this.estudiante.add(estudiante);
    }
            
    @Override 
    
    public String toString (){
        return "Nombre: "+nombre+" Facultad: "+facultad+" Codigo: "+codigo;
    }
    
}
