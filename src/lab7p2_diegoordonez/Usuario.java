
package lab7p2_diegoordonez;


public class Usuario {
    
    private String nombre;
    private String nombreU;
    private String contra;
    private int saldo;

    public Usuario() {
    }

    public Usuario(String nombre, String nombreU, String contra) {
        this.nombre = nombre;
        this.nombreU = nombreU;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", nombreU=" + nombreU + ", contra=" + contra + ", saldo=" + saldo + '}';
    }
    
    
}
