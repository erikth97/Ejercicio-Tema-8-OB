public class Main {
    public static void main(String[] args) {
        
        Personas persona=new Personas();
        persona.setNombre("Erik");
        System.out.println(persona.getNombre());
        persona.setEdad(25);
        System.out.println(persona.getEdad()+ ".");
        persona.setTelefono(987654321);
        System.out.println(persona.getTelefono());

    }
}
class Personas {
    private int edad;
    private String nombre;
    private int telefono;
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}