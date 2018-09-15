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
    grupo = new ArrayList<>();
    this.programacurricular = SIA.buscarProgramaCurricularPorNombre(programa_curricular);//Haz esto :"v
    this.grupo = null;
    this.nacimiento = nacimiento;
    this.notas = null;
    }
    
    public Estudiante(String nombre, long id, int programa_curricular, String nacimiento){
    this.nombre = nombre;
    this.id = id;
    grupo = new ArrayList<>();
    this.programacurricular = SIA.buscarProgramaCurricularPorCodigo(programa_curricular);//Podria tener bug
    this.grupo = null;
    this.nacimiento = nacimiento;
    this.notas = null;
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
    
    public void setNacimiento(String nacimiento){
        this.nacimiento = nacimiento;
    }
    
    public void setNotas(ArrayList<Notas> notas){
        this.notas = notas;
    }
    
    private String grupos (){
        String a = new String ();
        for (int i = 0; i<grupo.size(); i++){
            a.concat(String.valueOf(grupo.get(i).getIdentificador()));
            a.concat("  ");
            a.concat(String.valueOf(grupo.get(i).getMateria()));
            a.concat("  ");
            a.concat(String.valueOf(grupo.get(i).getNotas()));
            a.concat("  ");
        }
        return a;
    }
    
    @Override
    public String toString(){
        return "Estudiante: "+nombre+" Id: "+id+ " Grupo: "+grupos()+" Nacimiento: "+nacimiento;
    }
}
