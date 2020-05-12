
package bodega;
import java.time.LocalDate;

public class Paquete {
    public final String Descripción;
    public final float Peso;
    public final String Propietario;
    public final LocalDate FechaEntrada;
    public final int Destino;

    public Paquete(String Descripción, float Peso, String Propietario, LocalDate FechaEntrada, int Destino) {
        this.Descripción = Descripción;
        this.Peso = Peso;
        this.Propietario = Propietario;
        this.FechaEntrada = FechaEntrada;
        this.Destino = Destino;
    }

    public String getDescripción() {
        return Descripción;
    }

    public float getPeso() {
        return Peso;
    }

    public String getPropietario() {
        return Propietario;
    }

    public LocalDate getFechaEntrada() {
        return FechaEntrada;
    }

    public int getDestino() {
        return Destino;
    }
    
    
}
