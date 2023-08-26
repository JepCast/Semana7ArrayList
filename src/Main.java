import Alumnos.Alumno;
import Alumnos.Curso;

public class Main {
    public static void main(String[] args){
        Alumno alumno1 = new Alumno("0902","Juan Perez","88737522","5 calle 8-12");
        Curso  cur= new Curso("Programacion","555",500.00);
        alumno1.agregarCurso(cur);
        alumno1.agregarCurso(new Curso("Derecho","12", 1.0));

        System.out.println("Nombre del alumno:"+alumno1.getNombre());
        System.out.println("Carnet:"+alumno1.getCarnet());
        for (Curso curso: alumno1.getCursos()){
            System.out.println("Curso"+curso.getNombre()+"Valor"+curso.getCosto());
        }
    }
}

//Crear 3 alumnos con dos cursos cada uno y obtener el sacar a pagar de esos cursos por alumno, obtener la suma total de todos los alumnos