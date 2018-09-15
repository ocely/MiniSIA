package sia.Logica;

import sia.Datos.Asignatura;
import sia.Datos.Estudiante;
import sia.Datos.Profesor;
import sia.Datos.ProgramaCurricular;
import sia.Datos.Salon;
import sia.Datos.Facultad;
import sia.Datos.Notas;
import sia.Datos.Grupo;
import java.util.ArrayList;
public class SIA {
 
public static ArrayList<ProgramaCurricular> todos_los_programas_curriculares;
public static ArrayList<Grupo> todos_los_grupos;
public static ArrayList<Estudiante> todos_los_estudiantes;
public static ArrayList<Facultad> todas_las_facultades;
public static ArrayList<Profesor> todos_los_profesores;
public static ArrayList<Salon> todos_los_salones;
public static ArrayList<Asignatura> todas_las_asignaturas;

        public static Grupo buscarGrupo(int identificador){
         for(int i = 0; i<todos_los_grupos.size(); i++){
             
         if (todos_los_grupos.get(i).getIdentificador() == identificador){
         return todos_los_grupos.get(i);
         }
         }
         return null;
        }
        
         public static ProgramaCurricular buscarProgramaCurricularPorNombre(String nombre){
         for(int i = 0; i<todos_los_programas_curriculares.size(); i++){
             
         if (nombre.equals(todos_los_programas_curriculares.get(i).getNombre())){
         return todos_los_programas_curriculares.get(i);
         }
         }
         return null;
        }
        
         public static ProgramaCurricular buscarProgramaCurricularPorCodigo(int codigo){
         for(int i = 0; i<todos_los_programas_curriculares.size(); i++){
             
         if (codigo == todos_los_programas_curriculares.get(i).getCodigo()){
         return todos_los_programas_curriculares.get(i);
         }
         }
         return null;
        }
         
         
        public static Facultad buscarFacultadPorNombre(String nombre){
         for(int i = 0; i<todas_las_facultades.size(); i++){
             
         if (nombre.equals(todas_las_facultades.get(i).getNombre())){
         return todas_las_facultades.get(i);
         }
         }
         return null;
        }
        
        public static Facultad buscarFacultadPorCodigo(int nombre){
         for(int i = 0; i<todas_las_facultades.size(); i++){
             
         if (nombre == todas_las_facultades.get(i).getCodigo()){
         return todas_las_facultades.get(i);
         }
         }
         return null;
        }
        
         public static Profesor buscarProfesor(long id){
         for(int i = 0; i<todos_los_profesores.size(); i++){
             
         if (id == todos_los_profesores.get(i).getId()){
         return todos_los_profesores.get(i);
         }
         }
         return null;
        }
         
         
         public static Estudiante buscarEstudiante(long id){
         for(int i = 0; i<todos_los_estudiantes.size(); i++){
             
         if (id == todos_los_estudiantes.get(i).getId()){
         return todos_los_estudiantes.get(i);
         }
         }
         return null;
        }
         
        public static Salon buscarSalon(int identificador){
         for(int i = 0; i<todos_los_salones.size(); i++){
             
         if (identificador == todos_los_salones.get(i).getIdentificador()){
         return todos_los_salones.get(i);
         }
         }
         return null;
        }
        
    public static void main(String args[]) {
        boolean en_ejecucion = true;
        
        todos_los_programas_curriculares = new ArrayList<>();
        todos_los_grupos = new ArrayList<>();
        todos_los_estudiantes = new ArrayList<>();
        todas_las_facultades = new ArrayList<>();
        todos_los_profesores= new ArrayList<>();
        todos_los_salones = new ArrayList<>();
        todas_las_asignaturas = new ArrayList<>();
        
        Facultad facultad1 = new Facultad("Ingenieria",1);
        Facultad facultad2 = new Facultad("Ciencias", 2);
        todas_las_facultades.add(facultad1);
        todas_las_facultades.add(facultad1);
        ProgramaCurricular programa1 = new ProgramaCurricular (123, "Ingenieria Electronica", "Ingenieria");
        ProgramaCurricular programa2 = new ProgramaCurricular (132, "Fisica", 2);
        todos_los_programas_curriculares.add(programa1);
        todos_los_programas_curriculares.add(programa2);
        Asignatura asignatura1 = new Asignatura("Calculo Integral",1);
        Asignatura asignatura2 = new Asignatura("POO", 2);
        todas_las_asignaturas.add(asignatura1);
        todas_las_asignaturas.add(asignatura2);
        Salon salon1 = new Salon (453109);
        Salon salon2= new Salon (401204);
        todos_los_salones.add(salon1);
        todos_los_salones.add(salon2);
        Grupo grupo1 = new Grupo(1, 1000, "L8-10 C8-10", "Calculo Integral", 453109);
        Grupo grupo2 = new Grupo(2, 1000, "M12-14 J12-14", "Calculo Integral", 453109);
        Grupo grupo3 = new Grupo(3, 1001, "C14-16 V14-16", "POO", 401204);
        Grupo grupo4 = new Grupo(4, 1001, "M12-14 J12-14", "Calculo Integral", 401204);
        todos_los_grupos.add(grupo1);
        todos_los_grupos.add(grupo2);
        todos_los_grupos.add(grupo3);
        todos_los_grupos.add(grupo4);
        Estudiante estudiante1 = new Estudiante("Omar Andres Cely Villate", 1002697298, "Ingenieria Electronica", "02/09/2001");
        Estudiante estudiante2 = new Estudiante("Pedro Alonso Jimenez Rodriguez", 1002697298, 1, "02/09/2001");
        todos_los_estudiantes.add(estudiante1);
        todos_los_estudiantes.add(estudiante2);
        Profesor profesor1 = new Profesor ("Alexei Ochoa", 100123456, "02/09/1990");
        Profesor profesor2 = new Profesor ("Diana Serrano", 100123457, "02/09/1985");
        todos_los_profesores.add(profesor1);
        todos_los_profesores.add(profesor2);
        Notas nota1 = new Notas(1, 1002697298, 3.5, 100123456);
        Notas nota2 = new Notas(3, 1002697298, 3, 100123457);
        
        
        System.out.print(profesor1.toString());
    }
    
}
