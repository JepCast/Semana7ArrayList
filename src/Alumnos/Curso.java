package Alumnos;

public class Curso {

    private String nombre;
    private String codigo;
    private Double costo;
    //Constructor
    public Curso( String nombre, String codigo, Double costo){
        this.nombre = nombre;
        this.codigo = codigo;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
