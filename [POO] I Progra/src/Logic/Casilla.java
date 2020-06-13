/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
class Casilla {
    
    private String name;
    private int type;
    private ArrayList<Player> players;

    Casilla(int tipoCasilla) {
        this.type = tipoCasilla;
        this.players = new ArrayList();
        this.name = searchName(tipoCasilla);
    }
    
    public void addPlayer(Player pPlayer){
        this.players.add(pPlayer);
    }

    private String searchName(int tipoCasilla) {
        switch(tipoCasilla){
            case 0:
                return "Gato";
            case 1:
                return "Sopa de Letras";
            case 2:
                return "Memory Path";
            case 3:
                return "Memoria";
            case 4:
                return "Catch the Cat";
            case 5:
                return "Bomber-Mario";
            case 6:
                return "Guess Who";
            case 7:
                return "Collect the Coins";
            case 8:
                return "Mario Card's";
            case 9:
                return "Carcel";
            case 10:
                return "Estrella";
            case 11:
                return "Flor Fuego";
            case 12:
                return "Flor Hielo";
            case 13:
                return "Cola";
            case 14:
                return "Tuberia";
            default:
                break;
        }
        return null;
    }

    int getType() {
        return this.type;
    }

    void removePlayer(Player player) {
        this.players.remove(player);
    }
}
