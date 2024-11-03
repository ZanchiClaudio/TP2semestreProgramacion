
package domain;


public class Persona {
    //Atributos de herencia
    protected String nombre;//todo lo que es private no se hereda a la clase hija, por lo que se utiliza protected
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //Constructor vacio: este es para crear objetos sin necesidad de inicializar los atributos de la clase
    //aqui se da una sobrecarga de constructores ya que tienen el mismo nombre
    public Persona(){ //Constructor 1
        
    }
    public Persona(String nombre){ //Constructor 2
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {//constructor 3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString()); //nos muestra el espacio de memoria usado 
        sb.append('}');
        return sb.toString();
    }

    
}
