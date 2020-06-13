
package Logic;

import java.util.ArrayList;
import java.util.Random;


/*
 * @author Alex
 */

public class Controller {

    private Tablero tablero;
    private ArrayList<Player> players;
    private ArrayList<String> fotos;

    public Controller() {
        this.fotos = crearLista();
        this.players = new ArrayList<>();
    }

    public void addPlayer(String pPlayer) {
        Player nPlayer = new Player(pPlayer);
        players.add(nPlayer);
    }

    public boolean movePlayer(String pPlayer){
        Player player = getPlayer(pPlayer);
        int diceRoll_1 = roll(), diceRoll_2 = roll(), cantCasillas = diceRoll_1 + diceRoll_2;
        if(diceRoll_1 == 0 && diceRoll_2 == 0){
            player.addLooseTurn();
            player.addLooseTurn();
            return false;
        }if(diceRoll_1 == 0 || diceRoll_2 == 0){
            player.addLooseTurn();
            return tablero.movePlayer(player, cantCasillas);
        }else
            return tablero.movePlayer(player, cantCasillas);
    }
    
    private Player getPlayer(String pPlayer){
        for(Player i:players)
            if (i.getImageIcon().equals(pPlayer))
                return i;
        return null;
    }
    
    public int roll(){
        int num;
        Random dice = new Random();
        num = dice.nextInt(6);
        return num;
    }
    
    public ArrayList getPlayers() {
        return this.players;
    }

    private ArrayList<String> crearLista() {
        ArrayList<String> nFotos = new ArrayList();
       /* nFotos.add("/imagenes/e");
        nFotos.add("/imagenes/e");
        nFotos.add("/imagenes/e");
        nFotos.add("/imagenes/e");
        nFotos.add("/imagenes/e");
        nFotos.add("/imagenes/e");
        nFotos.add("/imagenes/e");
        nFotos.add("/imagenes/e");
        nFotos.add("/imagenes/e");
        nFotos.add("/imagenes/e");*/
        return nFotos;
    }

    public ArrayList<String> getFotos() {
        return this.fotos;
    }
    
    
    
    
    
}
