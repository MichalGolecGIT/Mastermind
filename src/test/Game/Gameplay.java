package Game;

import java.util.ArrayList;
import java.util.*;
import java.util.Random;

public class Gameplay {
    public static ArrayList<Integer> main(ArrayList<Integer> code,ArrayList<Integer> guessCode){// 0 - zle, 1 - ok kolor, 2 - ok miejsce i kolor
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> used = new ArrayList<Integer>();
        for (int i=0;i<code.size();i++){
            result.add(0);
            used.add(0);
        }
        for (int i=0;i<code.size();i++) {
            if (code.get(i) == guessCode.get(i)) {
                result.set(i, 2);
                used.set(i, 2);
            }
        }
        for (int i=0;i<code.size();i++){
            if(used.get(i)<2){
                for (int j=0;j<code.size();j++){
                    if(used.get(j)==0&&guessCode.get(j)==code.get(i)){
                        result.set(i,1);
                        used.set(j,1);
                    }
                }
            }
        }
        Collections.sort(result);
        return result;
    }
    public static boolean win(ArrayList<Integer> code){
        boolean result=false;
        int a=0;
        int b=0;
        for (int i : code){
            if(i==2){
                a++;
            }
            b++;
        }
        if(a==b){
            result=true;
        }
        return result;
    }
    public static ArrayList<Integer> random(int colors){
        ArrayList<Integer> result=new ArrayList<>();
        for (int i=0;i<4;i++){
            Random r = new Random();
            result.add(r.nextInt(colors));
        }
        return result;
    }
    public static boolean test2 (boolean a){
        a=true;
        return a;
    }
}
