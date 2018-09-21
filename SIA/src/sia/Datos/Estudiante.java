package sia.Datos;
import sia.Logica.SIA;
import java.util.ArrayList;

public class Estudiante {
    
    private String nombre;
    private long id;
    private ProgramaCurricular programacurricular;
    private ArrayList<Grupo> grupo;
    private String nacimiento;
    private ArrayList<Notas> notas;
    
    public Estudiante(){
    this("Aun no ha ingresado un nombre", -1," "," ");
    }
    
    public Estudiante(String nombre){
    this(nombre, -1,"","");
    }
    
    public Estudiante(String nombre, long id, String programa_curricular, String nacimiento){
    this.nombre = nombre;
    this.id = id;
    this.grupo = new ArrayList();
    this.programacurricular = SIA.buscarProgramaCurricularPorNombre(programa_curricular);//Haz esto :"v
    this.nacimiento = nacimiento;
    this.notas = new ArrayList();
    }
    
    public Estudiante(String nombre, long id, int programa_curricular, String nacimiento){
    this.nombre = nombre;
    this.id = id;
    this.grupo = new ArrayList();
    this.programacurricular = SIA.buscarProgramaCurricularPorCodigo(programa_curricular);//Podria tener bug
    this.nacimiento = nacimiento;
    this.notas = new ArrayList();
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public long getId(){
        return this.id;
    }
    
    public ProgramaCurricular getProgramaCurricular(){
        return this.programacurricular;
    }
    
    public ArrayList<Grupo> getGrupo(){
        return this.grupo;
    }
    
    public String getNacimiento(){
        return this.nacimiento;
    }
    
    public ArrayList<Notas> getNotas(){
        return this.notas;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setId(long id){
        this.id = id;
    }
    
    public void setProgramaCurricular(ProgramaCurricular programacurricular){
        this.programacurricular  = programacurricular;
    }
    
    public void setGrupo(ArrayList<Grupo> grupo){
        this.grupo = grupo;
    }
    
    public void setGrupo(Grupo grupo){
        this.grupo.add(grupo);
    }
    
    public void setNacimiento(String nacimiento){
        this.nacimiento = nacimiento;
    }
    
    public void setNotas(ArrayList<Notas> notas){
        this.notas = notas;
    }
    
    public void setNotas(Notas nota){
    this.notas.add(nota);
    }
    
    private ArrayList<Notas> buscarCalificacionesDelEstudiantePorGrupo(Grupo grupo){
         
        ArrayList <Notas> calificaciones = new ArrayList();
        if(grupo.getNotas().isEmpty() || grupo.getNotas() == null ){
        calificaciones = null;
        }else{
        for (int i = 0; i<grupo.getNotas().size(); i++){
             if(grupo.getNotas().get(i).getEstudiante().getId()== this.id){
             calificaciones.add(grupo.getNotas().get(i));
             }
         }
        }
         return calificaciones;
        
    }
    
    private String imprimirGrupos (){
        String a = new String ();
        if(grupo == null || grupo.isEmpty()){
        a = ", No hay grupos asignados aun.";
        }else{
        for (int i = 0; i<grupo.size(); i++){
            a = a.concat(". Grupo ");
            a = a.concat(String.valueOf(grupo.get(i).getIdentificador()));
            a = a.concat(" de ");
            a = a.concat(grupo.get(i).getAsignatura().getNombre());
            a = a.concat(", con calificaciones de: ");
                if(buscarCalificacionesDelEstudiantePorGrupo(grupo.get(i)) == null || buscarCalificacionesDelEstudiantePorGrupo(grupo.get(i)).isEmpty()){
                a = a.concat("*No hay calificaciones asignadas");
                }else{
                for(int j = 0; i<buscarCalificacionesDelEstudiantePorGrupo(grupo.get(i)).size(); j++){
                     a = a.concat(String.valueOf(buscarCalificacionesDelEstudiantePorGrupo(grupo.get(i)).get(j).getValor()));
                     a = a.concat(", ");
                }
                }
            a = a.concat(", ");
        }
        }
        return a;
    }
    
    @Override
    public String toString(){
        String impresion = new String();
        impresion =  "Estudiante: " +nombre+ ". Id: "+id ;
        impresion = impresion.concat(imprimirGrupos());
        impresion = impresion.concat(". Nacimiento: "+nacimiento);
        return impresion;
    }
}
