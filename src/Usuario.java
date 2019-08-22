import java.time.Year;
public class Usuario {
    private String nombre;
    private int id;
    private long telefono;
    private int anionacimiento;
    private int dni;

    public Usuario(String nombre, int id, long telefono , int anionacimiento, int dni) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.anionacimiento =  anionacimiento;
        this.dni = dni;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        if(String.valueOf(telefono).length() != 12){
            throw new IllegalStateException();
        }else {
            this.telefono = telefono;
        }

    }

    public void setAnioNacimiento(Integer anionacimiento){
        if(anionacimiento>(Year.now().getValue()-18)){
            throw new IllegalStateException();
        }else{
            this.anionacimiento = anionacimiento;
        }
    }

    public int getAnioNacimiento(){
        return this.anionacimiento;
    } 

    public void setDni(int dni){
        if(String.valueOf(dni).length()<=8){
            this.dni = dni;
        }else{
            throw new IllegalStateException();
        }   
    }
    public int getDni(){
        return dni;
    }
}
