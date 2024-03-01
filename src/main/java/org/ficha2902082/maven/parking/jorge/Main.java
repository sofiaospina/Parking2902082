package org.ficha2902082.maven.parking.jorge;

import java.util.List;

import org.ficha2902082.maven.parking.jorge.entities.Carro;
import org.ficha2902082.maven.parking.jorge.entities.Cliente;
import org.ficha2902082.maven.parking.jorge.entities.Cupo;
import org.ficha2902082.maven.parking.jorge.entities.Registro;
import org.ficha2902082.maven.parking.jorge.entities.TipoDocumento;
import org.ficha2902082.maven.parking.jorge.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.jorge.entities.Trabajador;

import java.util.List;
import java.util.ArrayList;
import java.time.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {

  public static void main(String[] args) {

    // Crear dos cupos
    // Instanciar dos cupos

    Cupo cupito1 = new Cupo();
    cupito1.ancho = 1.0;
    cupito1.largo = 4.5;
    cupito1.letra = 'A';

    Cupo cupito2 = new Cupo('B', 5.0, 2.5, null);
    Cupo cupito3 = new Cupo('C', 6.0, 2.5, null);
    Cupo cupito4 = new Cupo('D', 7.0, 2.5, null);
    Cupo cupito5 = new Cupo('E', 8.0, 2.5, null);

    Carro carrito1 = new Carro("ASD 123", TipoVehiculo.MOTO);
    Carro carrito2 = new Carro("KJH 354", TipoVehiculo.CAMIONETA);

    Trabajador tra1 = new Trabajador();
    tra1.nombre = "Andres";
    tra1.codigo = 1L;

    Trabajador tra2 = new Trabajador("Sofia", 2L);
    Trabajador tra3 = new Trabajador("Catalina", 3L);
    Trabajador tra4 = new Trabajador("Catalino", 4L);
    Trabajador tra5 = new Trabajador("Cata",5L);

    List<Trabajador> miTrabajador = new ArrayList<>();

    miTrabajador.add(tra1);
    miTrabajador.add(tra2);
    miTrabajador.add(tra3);

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
        cupito1, tra1);

    Registro regitro2 = new Registro(
        LocalDate.of(2023, Month.JANUARY, 22),
        LocalTime.of(20, 30, 00),
        LocalDate.of(2023, Month.JANUARY, 23),
        LocalTime.of(9, 01, 52),
        13000.00,
        clientecito1.misCarros.get(0),
        cupito2, tra2);

    Registro regitro3 = new Registro(
        LocalDate.of(2024, Month.FEBRUARY, 28),
        LocalTime.of(20, 30, 00),
        LocalDate.of(2026, Month.JANUARY, 23),
        LocalTime.of(9, 01, 52),
        13000.00,
        clientecito1.misCarros.get(0),
        cupito2, tra3);

    LocalDate fi1 = LocalDate.of(2023, Month.DECEMBER, 24);

    LocalTime hi1 = LocalTime.of(11, 32, 0);

    LocalDate ff1 = LocalDate.of(2024, Month.JANUARY, 24);

    LocalTime hif1 = LocalTime.of(22, 32, 0);

    Double valorR2 = 50000.0;

    Registro r2 = new Registro(fi1,
        hi1,
        ff1,
        hif1,
        valorR2,
        clientecito1.misCarros.get(0),
        cupito1, tra4);

    Registro regitro4 = new Registro(
        LocalDate.of(2024, Month.FEBRUARY, 28),
        LocalTime.of(20, 30, 00),
        LocalDate.of(2026, Month.JANUARY, 23),
        LocalTime.of(9, 01, 52),
        13000.00,
        clientecito1.misCarros.get(0),
        cupito2, tra5);

    // vincular los registros a la lista2
    // de registros
    misRegistros.add(regitro1);
    misRegistros.add(regitro2);
    misRegistros.add(r2);
    misRegistros.add(regitro3);
    misRegistros.add(regitro4);

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
          r.fechaFin.toString() + "/" +
          "Empleado:" +
          r.trabajador.codigo + "/"

      );
    }

  }

}
