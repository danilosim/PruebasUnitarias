import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void setTelefono12Digits() {
        Usuario usuario = new Usuario();
        usuario.setTelefono(123456789012L);
        assertEquals(123456789012L, usuario.getTelefono());
    }

    @Test
    void setTelefonoLessDigits() {
        Usuario usuario = new Usuario();
        assertThrows(IllegalStateException.class, () ->{
            usuario.setTelefono(12345678901L);
        });
    }

    @Test
    void setTelefonoMoreDigits() {
        Usuario usuario = new Usuario();
        assertThrows(IllegalStateException.class, () ->{
            usuario.setTelefono(1234567890123L);
        });
    }

    @Test
    void setAnioNacimientoYdni(){
        Usuario usuario = new Usuario();
        usuario.setAnioNacimiento(2003);
        assertThrows(IllegalStateException.class, () ->{
            usuario.setAnioNacimiento(2003);
        });
        usuario.setDni(40597260);
        assertThrows(IllegalStateException.class, () ->{
            usuario.setDni(40597260);
        });
    }
    
     @Test
    void testValidEmail() {
    	Usuario usuario1 = new Usuario();
    	usuario1.EmailValidation("martin12@gmail.com");
    	if(usuario1.getEmail() != "martin12@gmail.com") {
    		fail("No se asigno el email correctamente");
    	}
    }
    
    @Test
    void testInvalidEmail() {
    	Usuario usuario1 = new Usuario();
    	assertThrows(IllegalArgumentException.class, () -> usuario1.EmailValidation("laura12@--gmail.com"),"Email invalido, debería tirar una Excepcion");
    
    }

}
