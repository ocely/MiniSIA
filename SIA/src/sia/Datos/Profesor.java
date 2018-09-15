package sia.Datos;

import java.util.ArrayList;

public class Profesor {

    private String nombre;
    private long id;
    private ArrayList<Notas> notas;
    private ArrayList<Grupo> grupo;
    private String nacimiento;
    
    public Profesor(){
    
    }
    
    public Profesor(String nombre, long id, String nacimiento){
    this.nombre = nombre;
    this.id = id;
    this.nacimiento = nacimiento;
    this.notas = null;
    this.grupo = null;
    }
    public ArrayList<Notas> getNotas(){
        return this.notas;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public long getId(){
        return this.id;
    }
    
    public ArrayList<Grupo> getGrupo(){
        return this.grupo;
    }
    
    public String getNacimiento(){
        return this.nacimiento;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setId(long id){
        this.id = id;
    }
    
    public void setNotas(ArrayList<Notas> notas){
        this.notas = notas;
    }
    
    public void setNacimiento(String nacimiento){
        this.nacimiento = nacimiento;
    }
    
    public void setGrupo(ArrayList<Grupo> grupo){
        this.grupo = grupo;
    }

     private String grupos (){
        String a = new String ();
        for (int i = 0; i<grupo.size(); i++){
            a = a.concat(String.valueOf(grupo.get(i).getMateria()));
            a = a.concat("  ");
            a = a.concat(String.valueOf(grupo.get(i).getIdentificador()));
            a = a.concat("  ");
        }
        return a;
    }
    
    @Override 
    
    public String toString(){
        return "Nombre: " +nombre+" Id: "+id+" Grupos: "+grupos();
    }
    
}
