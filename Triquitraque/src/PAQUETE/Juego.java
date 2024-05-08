/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE;

/**
 *
 * @author juang
 */
public class Juego {
    public String turno; 
    public Boolean enJuego;
   

    public Juego() {
    }

    public Juego(String turno) {
        this.turno = turno;
    }

    public Juego(Boolean enJuego) {
        this.enJuego = enJuego;
    }
    
    

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Boolean getEnJuego() {
        return enJuego;
    }

    public void setEnJuego(Boolean enJuego) {
        this.enJuego = enJuego;
    }
    
    
    
    public void cambioTurno(){
        if(turno.equals("X")){
            turno="O";
        }else{
            turno="X";
        }
    }
    
    
}


