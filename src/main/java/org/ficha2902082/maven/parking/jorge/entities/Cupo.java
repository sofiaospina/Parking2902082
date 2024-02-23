package org.ficha2902082.maven.parking.jorge.entities;

public class Cupo {

    public char letra;
    public double largo;
    public double ancho;
    public TipoCupo tipoCupo;

    // constructo de clase: un metodo especial en una
    // entidad:
    // -se ejecuta automaticamente cuando se crea un onjeto

    // constructor por defecto
    public Cupo() {
    }

    // constructor con parametros
    public Cupo(char letra,
            double largo,
            double ancho,
            TipoCupo tipoCupo) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
        this.tipoCupo = tipoCupo;
    }

}
