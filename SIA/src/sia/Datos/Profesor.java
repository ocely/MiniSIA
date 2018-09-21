package sia.Datos;

import java.util.ArrayList;

public class Profesor {

    private String nombre;
    private long id;
    private ArrayList<Notas> notas;
    private ArrayList<Grupo> grupo;
    private String nacimiento;
    
    public Profesor(){
    this("*Sin nombre", -1, "*Sin fecha de nacimiento");
    }
    
    public Profesor(String nombre, long id, String nacimiento){
    this.nombre = nombre;
    this.id = id;
    this.nacimiento = nacimiento;
    this.notas = new ArrayList();
    this.grupo = new ArrayList();
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
    
    public void setNotas(Notas nota){
        this.notas.add(nota);
    }
    
    public void setNacimiento(String nacimiento){
        this.nacimiento = nacimiento;
    }
    
    public void setGrupo(ArrayList<Grupo> grupo){
        this.grupo = grupo;
    }
    public void setGrupo(Grupo grupo){
        this.grupo.add(grupo);
    }

     private String imprimirGrupos (){
        String a = new String ();
    
        if(grupo == null || grupo.isEmpty()){
        a = ", *No hay Grupos Asignados aun.";
        }else{
             a = a.concat(", Da clases en los grupos: ");   
        for (int i = 0; i<grupo.size(); i++){
            a = a.concat(String.valueOf(grupo.get(i).getIdentificador()));
            a = a.concat(" de ");
            a = a.concat(grupo.get(i).getAsignatura().getNombre());
            a = a.concat(", ");
        }
        a = a.concat(". ");
        }
        return a;
    }
    
    @Override 
    
    public String toString(){
        String impresion = new String();
        impresion = "Nombre: " +nombre+" , Id: "+id;
        impresion = impresion.concat(imprimirGrupos());
        return impresion;
    }
    
}
