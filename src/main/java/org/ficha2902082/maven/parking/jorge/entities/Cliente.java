package org.ficha2902082.maven.parking.jorge.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellidos;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular; 

    public List <Carro> misCarros =
                    new ArrayList<Carro>();




    //metodo: añadir carro al cliente
    //definir metodo y modificador de acceso
    //tipo de dato de retorno
    //nombre del metodo
    //parametros (entradas, inputs):
    // tipo de dato del parametro
    // nombre del parametro
    
    public void addCar(Carro c ){
      this.misCarros.add(c);
    }

    
    
//sobrecargas del metodo addcar
    
public void addCar(String placa, TipoVehiculo tipovehiculo ){
    //instalar u construir
    Carro c = new Carro();
    c.placa = placa;
    c.tipovehiculo = tipovehiculo;
    this.misCarros.add(c);
  
    //sobrecargas del metodo
//en una clase se permiten metodos con el mismo nombre con diferente firma 
  

}
}

