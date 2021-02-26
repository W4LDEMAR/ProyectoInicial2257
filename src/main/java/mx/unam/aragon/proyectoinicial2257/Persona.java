package mx.unam.aragon.proyectoinicial2257;

public class Persona{

    private String nombre; // atributos
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private String curp;

    public Persona(){ // metodo constructor
    }

    public Persona(String nombre, String apPaterno, String apMaterno, int edad, String curp) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "\n apPaterno=" + apPaterno + "\n apMaterno=" + apMaterno + "\n edad=" + edad + "\n curp=" + curp + '}';
    }
    
}