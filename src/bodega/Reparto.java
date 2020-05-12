
package bodega;

import java.util.ArrayList;



public class Reparto {
    
    public ArrayList<Paquete> Paquetes = new ArrayList<Paquete>();
    public Repartidor RepartidorEncargadoPaquetes;
    public float PesoActual;
    public float PorcentajeCapacidad;

    public Reparto(Repartidor RepartidorEncargadoPaquetes) {
        this.RepartidorEncargadoPaquetes = RepartidorEncargadoPaquetes;
    }
    
    public boolean valido(Paquete paquete, Repartidor repar){
        
        if((paquete.Peso < repar.CapacidadCarga) && (paquete.Destino == repar.AreaReparto)){
                return true;
        }
        
        return false;
    }
    
    public boolean Añadir(Paquete paquete){
        
        if(this.valido(paquete,null)!=false){
            Paquetes.add(paquete);
            return true;
        }
        return false;
    }

    public ArrayList<Paquete> getPaquetes() {
        return Paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> Paquetes) {
        this.Paquetes = Paquetes;
    }

    public Repartidor getRepartidorEncargadoPaquetes() {
        return RepartidorEncargadoPaquetes;
    }

    public void setRepartidorEncargadoPaquetes(Repartidor RepartidorEncargadoPaquetes) {
        this.RepartidorEncargadoPaquetes = RepartidorEncargadoPaquetes;
    }

    public float getPesoActual() {
        return PesoActual;
    }

    public void setPesoActual(float PesoActual) {
        this.PesoActual = PesoActual;
    }

    public float getPorcentajeCapacidad() {
        return PorcentajeCapacidad;
    }

    public void setPorcentajeCapacidad(float PorcentajeCapacidad) {
        this.PorcentajeCapacidad = PorcentajeCapacidad;
    }
    
    
    
}
