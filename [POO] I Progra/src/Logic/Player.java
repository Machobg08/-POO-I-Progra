
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
public class Player {

    private String playerIcon;
    private ArrayList<Integer> turns;
    private int position;
    
    Player(String pPlayerIcon) {
        this.turns = new ArrayList();
        this.position = -1;
        this.playerIcon = pPlayerIcon;
        
    }
    
    void addLooseTurn() {
        int index = 0;
        int i = turns.get(index);
        while(index<=turns.size()){
            if(i == 1){
                turns.set(index, 0);
                return;
            }
            if(i==2){
                turns.add(index, 0);
            }
            else{
                index++;
                i = turns.get(index);
            }
        }
    }

    public String getPlayerIcon() {
        return playerIcon;
    }

    public void setPlayerIcon(String playerIcon) {
        this.playerIcon = playerIcon;
    }

    public ArrayList getTurns() {
        return turns;
    }

    public void setTurns(ArrayList turns) {
        this.turns = turns;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    public String getImageIcon() {
        return this.playerIcon;
    }


    
}
