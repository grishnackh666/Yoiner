    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodega;

import java.util.ArrayList;


public class Inteligente extends Almacen {
    
    public ArrayList<Paquete> Cliente = new ArrayList<Paquete>();

    public Inteligente(String nombre, Reparto Repartos) {
        super(nombre, Repartos);
    }
    
    
    
    public void añadeClientes(String... nombre){
        for(String k: nombre){
            this.Cliente.add(k);
        }
        
    }
    
    public void eliminarClientes(String nombre){
        for(Paquete l: Cliente){
            if(nombre==l.getPropietario()){
                this.Cliente.remove(l);
            }
        }
    }
    
}
