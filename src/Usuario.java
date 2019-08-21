public class Usuario {
    private String nombre;
    private int id;
    private long telefono;

    public Usuario(String nombre, int id, long telefono) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
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
}
