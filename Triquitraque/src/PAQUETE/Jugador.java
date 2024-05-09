/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE;

/**
 *
 * @author juang
 */
public class Jugador {
    private String nombre;
    private String color;
    private int victorias=0;

    //Constructores 
    public Jugador() {
    }

    public Jugador(String nombre, String color, int victorias) {
        this.nombre = nombre;
        this.color = color;
        this.victorias = victorias;
    }

    //Getters and setters y to String

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", color=" + color + '}';
    }
    public void victoria(){
        this.victorias=this.victorias+1;
    }
}
