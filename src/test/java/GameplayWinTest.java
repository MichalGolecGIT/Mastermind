package test.java;

import Game.Gameplay;
import org.junit.Assert;

import java.util.ArrayList;

class GameplayWinTest {

    @org.junit.jupiter.api.Test
    void test2() {
        boolean a=true;
        //then
        Assert.assertTrue(a);
    }
    @org.junit.jupiter.api.Test
    public void win_ok_True(){
        //given
        ArrayList<Integer> myTest = new ArrayList<>();
        for (Integer i=0;i<4;i++){
            myTest.add(2);
        }
        //while
        boolean result= Gameplay.win(myTest);
        //then
        Assert.assertTrue(result);
    }
    @org.junit.jupiter.api.Test
    public void test2_ok_True(){
        //given
        boolean a=true;
        //while
        boolean result = Gameplay.test2(a);
        //then
        Assert.assertTrue(result); // XDDDDDDDDDDDDDDD
    }
    @org.junit.jupiter.api.Test
    public void win_oneBad_False(){
        //given
        ArrayList<Integer> myTest = new ArrayList<>();
        for (Integer i=0;i<3;i++){
            myTest.add(2);
        }
        myTest.add(1);
        //while
        boolean result=Gameplay.win(myTest);
        //then
        Assert.assertFalse(result);
    }
    @org.junit.jupiter.api.Test
    public void win_twoBad_False(){
        //given
        ArrayList<Integer> myTest = new ArrayList<>();
        for (Integer i=0;i<2;i++){
            myTest.add(2);
        }
        myTest.add(1);
        myTest.add(0);
        //while
        boolean result=Gameplay.win(myTest);
        //then
        Assert.assertFalse(result);
    }




}