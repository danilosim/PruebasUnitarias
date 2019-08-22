public class Usuario {
    private String nombre;
    private int id;
    private long telefono;
    private int anionacimiento;

    public Usuario(String nombre, int id, long telefono , int anionacimiento) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.anionacimiento =  anionacimiento;
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
        if(anionacimiento.toString().length()>2001){
            throw new IllegalStateException();
        }else{
            this.anionacimiento = anionacimiento;
        }
    }

    public int getAnioNacimiento(){
        return this.anionacimiento;
    }
}
