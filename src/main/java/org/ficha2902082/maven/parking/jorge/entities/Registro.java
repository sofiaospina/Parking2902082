package org.ficha2902082.maven.parking.jorge.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {

    // atributos intrinsecos
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public Double Valor;

    // atributos de relacion
    public Carro carro;
    public Cupo cupo;
    public Trabajador trabajador;

    // constructor por defecto
    public Registro() {
    }

    // constructor parametrizado
    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Double valor,
            Carro carro, Cupo cupo, Trabajador trabajador) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        Valor = valor;
        this.carro = carro;
        this.cupo = cupo;
        this.trabajador = trabajador;

    }

}
