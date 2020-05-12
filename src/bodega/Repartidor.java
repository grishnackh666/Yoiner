
package bodega;



public class Repartidor {
    
    public String nombre;
    public float CapacidadCarga;
    public int AreaReparto;

    public Repartidor(String nombre, float CapacidadCarga, int AreaReparto) {
        this.nombre = nombre;
        this.CapacidadCarga = CapacidadCarga;
        this.AreaReparto = AreaReparto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(float CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }

    public int getAreaReparto() {
        return AreaReparto;
    }

    public void setAreaReparto(int AreaReparto) {
        this.AreaReparto = AreaReparto;
    }
    
    
}
