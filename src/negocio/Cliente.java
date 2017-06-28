/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author alumno
 */
public class Cliente {
    private String nombre, apellido, calle;
    private Integer dni, altura;
    private Localidad localidad;

    public Cliente(String nombre, String apellido, String calle, Integer dni, Integer altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.dni = dni;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getDni() {
        return dni;
    }

    public Integer getAltura() {
        return altura;
    }

    public Localidad getLocalidad() {
        return localidad;
    }
    
}