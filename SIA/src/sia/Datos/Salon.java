package sia.Datos;

import java.util.ArrayList;

public class Salon {
    
    private long identificador;
    private ArrayList<Grupo> grupo;
    
    public Salon(){
    this(-1);
    }
    
    public Salon(long identificador){
    this.identificador = identificador;
    this.grupo = new ArrayList();
    }
    
    public long getIdentificador(){
    return this.identificador;
    }
    
    public void setIdentificador(long identificador){
    this.identificador = identificador;
    }
    
    public ArrayList<Grupo> getGrupo(){
    return this.grupo;
    }
    
    public void setGrupo(ArrayList<Grupo> grupo){
    this.grupo = grupo;
    }
    public void setGrupo(Grupo grupo){
    this.grupo.add(grupo);
    }
    
    @Override
    
    public String toString (){
        return "Edificio: "+ (identificador/1000)+ " Salon: "+(identificador%1000);
    }
    
}
