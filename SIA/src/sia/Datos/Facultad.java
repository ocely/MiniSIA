package sia.Datos;

import java.util.ArrayList;

public class Facultad {
    
    private String nombre;
    private int codigo;
    private ArrayList<ProgramaCurricular> programacurricular;
    
    public Facultad(){
        this("Aun no ha asignado nombre para la facultad", -1);
    }
    
    public Facultad(String nombre, int codigo){
    this.nombre = nombre;
    this. codigo = codigo;
    this.programacurricular = null;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    public void setNombre(String nombre){
     this.nombre = nombre;
    }
    
    public int getCodigo(){
    return this.codigo;
    }
    
    public void setCodigo(int codigo){
    this.codigo = codigo;
    }
    
    public ArrayList<ProgramaCurricular> getProgramaCurricular(){
    return this.programacurricular;
    }
    
    public void setProgramaCurricular(ArrayList<ProgramaCurricular> programacurricular){
    this.programacurricular = programacurricular;
    }
    
}
