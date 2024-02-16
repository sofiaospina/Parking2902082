package org.ficha2902082.maven.parking.jorge;
// importar dependencias 
import org.ficha2902082.maven.parking.jorge.entities.Carro;
import org.ficha2902082.maven.parking.jorge.entities.Cliente;
import org.ficha2902082.maven.parking.jorge.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.jorge.entities.TipoDocumento;
public class Main {
    public static void main(String[] args) {
      //crear dos instancias 
      // de la clase carro 
      Carro carrito1 = new Carro();
      carrito1.placa = "ASB 345"; 
      carrito1.tipovehiculo = TipoVehiculo.CAMIONETA;

      Carro carrito2 = new Carro();
      carrito2.placa = "ASB 456";
      carrito2.tipovehiculo = TipoVehiculo.TAXI;

      Carro carrito3 = new Carro();
      carrito3.placa = "HGF 358";
      carrito3.tipovehiculo = TipoVehiculo.CARRO; 

      Cliente clientecito1 = new Cliente();
      clientecito1.nombre = "Jorge";
      clientecito1.apellidos = "Niño"; 
      clientecito1.tipoDocumento = TipoDocumento.CC;
      clientecito1.numeroDocumento = 1028660935L;
      clientecito1.celular = 3216549870L;

      //añadir carros al cliente
      //

      clientecito1.addCar(carrito1);
      clientecito1.addCar(carrito2);
      clientecito1.addCar("ABC 123" , TipoVehiculo.TAXI);

      System.out.println("Cliente:" + clientecito1.nombre);
      System.out.println("Apellidos:" + clientecito1.apellidos);
      System.out.println("tipo de documento " + clientecito1.tipoDocumento);
      System.out.println("documento:" + clientecito1.numeroDocumento);
      System.out.println("Numero de celular:" + clientecito1.celular);
      System.out.println("Vehiculos:");
      for ( Carro c : clientecito1.misCarros) {
        
        System.out.println("placa:" + c.placa);
        System.out.println("tipo de vehiculo:" + c.tipovehiculo);
        System.out.println("______________");
      }
        
      

    

      }
    
      

    }
