import com.sun.security.jgss.GSSUtil;

public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;
    public void mostrarInformacion(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Tipo: " +tipo);
        System.out.println("Activo: " +activo);

    }
void mostrarEstado(){
        String estado = activo?"activo":"inhabilitado";
    System.out.println("Nombre: "+nombre+ "\nEstado:"+estado);


    }
}
