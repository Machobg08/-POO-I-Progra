/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class Tablero {
    private ArrayList<Casilla> casillas;
    
    Tablero(){
        int cont = 0;
        int tipoCasilla;
        Random rand = new Random();
        while (cont != 27){
            tipoCasilla = rand.nextInt(15);
            if(isNeeded(tipoCasilla)){
                Casilla nueva = new Casilla(tipoCasilla);
            }
        }
    }

    private boolean isNeeded(int tipoCasilla) {
        if(tipoCasilla<=8)
            return verifyGame(tipoCasilla);
        if(9 >= tipoCasilla && tipoCasilla != 14)
            return verifySpecial(tipoCasilla);
        if(tipoCasilla == 14)
            return verifyTube();
        else
            return false;
                    
    }

    private boolean verifyGame(int tipoCasilla) {
        int timesOnBoard = 0;
        for(Casilla i:casillas){
            if(i.getType() == tipoCasilla)
                timesOnBoard++;
        }
        return timesOnBoard < 2;
    }

    private boolean verifySpecial(int tipoCasilla) {
        for(Casilla i:casillas){
            if(i.getType() == tipoCasilla)
                return false;
        }
        return true;
    }

    private boolean verifyTube() {
        int timesOnBoard = 0;
        for(Casilla i:casillas){
            if(i.getType() == 14)
                timesOnBoard++;
        }
        return timesOnBoard < 3;
    }

    public boolean  movePlayer(Player player, int cantCasillas) {
        int currentCasilla = player.getPosition();
        Casilla actual = this.casillas.get(currentCasilla);
        Casilla nueva;
        actual.removePlayer(player);
        if(currentCasilla + cantCasillas == 25){
            nueva = this.casillas.get(25);
            nueva.addPlayer(player);
            return true;
        }
        if (currentCasilla + cantCasillas < 25){
            nueva = this.casillas.get(25-(currentCasilla + cantCasillas));
            nueva.addPlayer(player);
            return false;
        }
        else{
            nueva = this.casillas.get(-1*((currentCasilla + cantCasillas) - 25));
            nueva.addPlayer(player);
            return false;
        }
    }
    
}
