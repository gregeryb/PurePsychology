/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package purepsychlogy;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class ComputerPlayerGood implements ComputerPlayer{

    private ArrayList<Integer> purse;

    public ComputerPlayerGood(){
        purse = new ArrayList<Integer>();
        for(int i = 1; i < 14; i++){
            purse.add(i);
        }
    }

    public int getMove(int biddingOn) {
        Random randGen = new Random();
        if(biddingOn > 10){
            int a = randGen.nextInt(3);
            if(a == 0){
                return purse.remove(randGen.nextInt(3));
            }
        }
        else if(biddingOn > 8){
            int a = randGen.nextInt(5);
            if(a == 0){
                return purse.remove(randGen.nextInt(2));
            }
        }
        if (biddingOn > 7){
            int a = randGen.nextInt(3);
            if(a == 0){
                for(int i = 0; i < purse.size(); i++){
                    if(purse.get(i) >= biddingOn){
                        if(i+3 < purse.size()){
                            return purse.remove(i+3);
                        }
                        else if(i+2 < purse.size()){
                            return purse.remove(i+2);
                        }
                        else if(i+1 < purse.size()){
                            return purse.remove(i+1);
                        }
                        else{
                            return purse.remove(i);
                        }
                    }
                }
            }
        }
        if (biddingOn > 3) {
            int a = randGen.nextInt(3);
            for (int i = 0; i < purse.size(); i++) {
                if(purse.get(i) >= biddingOn){
                    if(i+a < purse.size()){
                        return purse.remove(i+a);
                    }
                    else if(i+a-1 <purse.size()){
                        return purse.remove(i+a-1);
                    }
                    else return purse.remove(i);
                }
            }
        }
        return purse.remove(0);
    }


}
