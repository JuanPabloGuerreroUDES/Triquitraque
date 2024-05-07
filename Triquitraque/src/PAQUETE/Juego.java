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

    public Juego() {
    }

    public Juego(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void cambioTurno(){
        if(turno.equals("X")){
            turno="O";
        }else{
            turno="X";
        }
    }
    
    
}


