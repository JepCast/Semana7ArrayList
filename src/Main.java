import Alumnos.Alumno;
import Alumnos.Curso;

public class Main {
    public static void main(String[] args){
        Alumno alumno1 = new Alumno("0001","Juan Perez","88737522","5 calle 8-12");
        Curso  cur= new Curso("Programacion","555",500.00);
        alumno1.agregarCurso(cur);
        alumno1.agregarCurso(new Curso("Derecho","120", 1.0));

        Alumno alumno2 = new Alumno("0002","Mikel Barehz","88737384","6 calle 3-2");
        Curso cur2= new Curso("Programacion I","557",500.00);
        Curso cur3= new Curso("Diseño Grafico I","435",600.00);
        alumno2.agregarCurso(cur2);
        alumno2.agregarCurso(cur3);

        Alumno alumno3 = new Alumno("0003","Hidari Ediza","09215423","8 av 8-22");
        Curso cur4= new Curso("Diseño Avanzado","456",800.00);
        Curso cur5= new Curso("Modelado 3D","368",800.00);
        alumno3.agregarCurso(cur4);
        alumno3.agregarCurso(cur5);


        System.out.println("Nombre del alumno:"+alumno1.getNombre());
        System.out.println("Carnet:"+alumno1.getCarnet());
        System.out.println("Nombre del alumno:"+alumno2.getNombre());
        System.out.println("Carnet:"+alumno2.getCarnet());
        System.out.println("Nombre del alumno:"+alumno3.getNombre());
        System.out.println("Carnet:"+alumno3.getCarnet());

        for (Curso curso: alumno1.getCursos()){
            System.out.println("Curso"+curso.getNombre()+"Valor"+curso.getCosto());
        }
    }
}

//Crear 3 alumnos con dos cursos cada uno y obtener el sacar a pagar de esos cursos por alumno, obtener la suma total de todos los alumnos