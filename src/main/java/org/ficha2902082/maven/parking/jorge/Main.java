package org.ficha2902082.maven.parking.jorge;

import java.util.List;

import org.ficha2902082.maven.parking.jorge.entities.Carro;
import org.ficha2902082.maven.parking.jorge.entities.Cliente;
import org.ficha2902082.maven.parking.jorge.entities.Cupo;
import org.ficha2902082.maven.parking.jorge.entities.Registro;
import org.ficha2902082.maven.parking.jorge.entities.TipoDocumento;
import org.ficha2902082.maven.parking.jorge.entities.TipoVehiculo;

import java.util.List;
import java.util.ArrayList;
import java.time.*;

public class Main {

  public static void main(String[] args) {

    // Crear dos cupos
    // Instanciar dos cupos

    Cupo cupito1 = new Cupo();
    cupito1.ancho = 1.0;
    cupito1.largo = 4.5;
    cupito1.letra = 'A';

    Cupo cupito2 = new Cupo('B', 5.0, 2.5, null);

    Carro carrito1 = new Carro("ASD 123", TipoVehiculo.MOTO);
    Carro carrito2 = new Carro("KJH 354", TipoVehiculo.CAMIONETA);

    Cliente clientecito1 = new Cliente("Jorge",
        "Niño",
        TipoDocumento.CC,
        1234567890L,
        1234568970L);
    clientecito1.addCar(carrito1);
    clientecito1.addCar(carrito2);
    clientecito1.addCar("ASD 345", TipoVehiculo.CAMION);

    // declarar una lista de registros
    List<Registro> misRegistros = new ArrayList<>();

    // crear dos registros de entrada y salida
    // instanciar dos registros

    Registro regitro1 = new Registro(
        LocalDate.of(2024, Month.JANUARY, 23),
        LocalTime.of(15, 30, 34),
        LocalDate.of(2023, Month.FEBRUARY, 1),
        LocalTime.of(6, 30, 23),
        50000.00,
        clientecito1.misCarros.get(0),
        cupito1);

    Registro regitro2 = new Registro(
        LocalDate.of(2023, Month.JANUARY, 22),
        LocalTime.of(20, 30, 00),
        LocalDate.of(2023, Month.JANUARY, 23),
        LocalTime.of(9, 01, 52),
        13000.00,
        clientecito1.misCarros.get(0),
        cupito2);

    // vincular los registros a la lista
    // de registros
    misRegistros.add(regitro1);
    misRegistros.add(regitro2);

    // recorrer la lista de registros
    for (Registro r : misRegistros) {
      System.out.println("Placa: " +
          r.carro.placa + "/" +
          "Cupo: " + r.cupo.letra +
          r.cupo.letra + "/" +
          "Valor: " +
          r.Valor + "/" +
          "Fecha inicio " +
          r.fechaInicio.toString() + "/" +
          "Fecha Fin " +
          r.fechaFin.toString() + "/"

      );
    }

  }

}
