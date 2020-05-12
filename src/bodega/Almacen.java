
package bodega;

import java.util.ArrayList;
import java.time.*;
import java.time.format.*;


public class Almacen {
    
    public String nombre;
    public ArrayList<Paquete> paquetesRegistrados = new ArrayList<Paquete>();
    public Reparto Repartos;

    public Almacen(String nombre, Reparto Repartos) {
        this.nombre = nombre;
        this.Repartos = Repartos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Paquete> getPaquetesRegistrados() {
        return paquetesRegistrados;
    }

    public void setPaquetesRegistrados(ArrayList<Paquete> paquetesRegistrados) {
        this.paquetesRegistrados = paquetesRegistrados;
    }

    public Reparto getRepartos() {
        return Repartos;
    }

    public void setRepartos(Reparto Repartos) {
        this.Repartos = Repartos;
    }
    
    
    public Reparto notifica(Repartidor repa){
        
        Reparto e = new Reparto(repa);
        e.getPaquetes().add(e);
        return e;
    }
    
    
    public boolean Registrar(String desc,float peso,String Propietario,int Destino){
        LocalDate ahora = LocalDate.now();
        Paquete pa = new Paquete(desc,peso,Propietario,ahora,Destino);
        if((pa!=null)&&(Repartos.getPaquetes().add(pa))){
            this.paquetesRegistrados.add(pa);
            return true;
        }
        
        return false;
    }
    
    
    public Paquete ObtenerRepartosPreparados(){
        if(this.Repartos!=null){
        for(Paquete e: paquetesRegistrados){
                return e;
            }
        }
        return null;
    }
    
    public void EntregarReparto(Reparto e){
        if(e==this.getRepartos()){
        for(Paquete j: paquetesRegistrados){
                e.Paquetes.remove(e);
                this.paquetesRegistrados.remove(j);
            
            }
        }
    }
    
    public Paquete ObtenerInventario(){
        
        for(Paquete y: paquetesRegistrados){
            if(y.getDestino() == y.Destino){
                return y;
            }
        }
        return null;
    }
    
}
