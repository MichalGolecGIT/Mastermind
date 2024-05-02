package test.java;

import Game.Gameplay;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameplayMainTest {

    @Test
    void main_AllPosition_True() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<4;i++){
            resultOK.add(2);
        }

        code.add(1);
        code.add(2);
        code.add(4);
        code.add(3);

        userCode.add(1);
        userCode.add(2);
        userCode.add(4);
        userCode.add(3);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertEquals(resultOK, result);

    }

    @Test
    void main_ThreePosition_True() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<1;i++){
            resultOK.add(0);
        }
        for (int i=0;i<3;i++){
            resultOK.add(2);
        }


        code.add(1);
        code.add(2);
        code.add(4);
        code.add(0);

        userCode.add(1);
        userCode.add(2);
        userCode.add(4);
        userCode.add(3);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertEquals(resultOK, result);

    }

    @Test
    void main_TwoPosition_True() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<2;i++){
            resultOK.add(0);
        }
        for (int i=0;i<2;i++){
            resultOK.add(2);
        }


        code.add(1);
        code.add(2);
        code.add(0);
        code.add(0);

        userCode.add(1);
        userCode.add(2);
        userCode.add(4);
        userCode.add(3);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertEquals(resultOK, result);

    }

    @Test
    void main_OnePosition_True() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<3;i++){
            resultOK.add(0);
        }
        for (int i=0;i<1;i++){
            resultOK.add(2);
        }



        code.add(1);
        code.add(0);
        code.add(0);
        code.add(0);

        userCode.add(1);
        userCode.add(2);
        userCode.add(4);
        userCode.add(3);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertEquals(resultOK, result);

    }

    @Test
    void main_noPosition_True() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<4;i++){
            resultOK.add(0);
        }


        code.add(0);
        code.add(0);
        code.add(0);
        code.add(0);

        userCode.add(1);
        userCode.add(2);
        userCode.add(4);
        userCode.add(3);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertEquals(resultOK, result);

    }

    @Test
    void main_AllColor_True() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<4;i++){
            resultOK.add(1);
        }

        code.add(1);
        code.add(2);
        code.add(4);
        code.add(3);

        userCode.add(2);
        userCode.add(4);
        userCode.add(3);
        userCode.add(1);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertEquals(resultOK, result);

    }

    @Test
    void main_AllPositionOneWrong_True() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        resultOK.add(0);
        for (int i=0;i<3;i++){
            resultOK.add(2);
        }

        code.add(0);
        code.add(2);
        code.add(4);
        code.add(3);

        userCode.add(1);
        userCode.add(2);
        userCode.add(4);
        userCode.add(3);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertEquals(resultOK, result);

    }

    @Test
    void main_AllPositionTwoWrong_False() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<2;i++){
            resultOK.add(2);
        }
        for (int i=0;i<2;i++){
            resultOK.add(0);
        }


        code.add(1);
        code.add(2);
        code.add(2);
        code.add(0);

        userCode.add(1);
        userCode.add(2);
        userCode.add(4);
        userCode.add(3);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertNotEquals(resultOK, result);

    }
@Test
    void main_threeColorOnePosition_True() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<3;i++){
            resultOK.add(1);
        }
        for (int i=0;i<1;i++){
            resultOK.add(2);
        }


        code.add(1);
        code.add(2);
        code.add(2);
        code.add(0);

        userCode.add(2);
        userCode.add(2);
        userCode.add(0);
        userCode.add(1);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertEquals(resultOK, result);

    }
    @Test
    void main_TwoPositionOneColor_True() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<1;i++){
            resultOK.add(0);
        }
        resultOK.add(1);
        for (int i=0;i<2;i++){
            resultOK.add(2);
        }



        code.add(1);
        code.add(2);
        code.add(4);
        code.add(0);

        userCode.add(1);
        userCode.add(2);
        userCode.add(0);
        userCode.add(3);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertEquals(resultOK, result);

    }
    @Test
    void main_TwoPositionOneColor_False() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<1;i++){
            resultOK.add(0);
        }
        resultOK.add(1);
        for (int i=0;i<2;i++){
            resultOK.add(2);
        }



        code.add(1);
        code.add(2);
        code.add(2);
        code.add(0);

        userCode.add(1);
        userCode.add(2);
        userCode.add(0);
        userCode.add(0);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertNotEquals(resultOK, result);

    }
@Test
    void main_TwoPositionOneColor_False2() {
        //given
        ArrayList<Integer> code=new ArrayList<Integer>();
        ArrayList<Integer> userCode= new ArrayList<Integer>();
        ArrayList<Integer> resultOK = new ArrayList<Integer>();
        for (int i=0;i<1;i++){
            resultOK.add(0);
        }
        resultOK.add(1);
        for (int i=0;i<2;i++){
            resultOK.add(2);
        }



        code.add(1);
        code.add(2);
        code.add(4);
        code.add(0);

        userCode.add(1);
        userCode.add(2);
        userCode.add(2);
        userCode.add(3);

        //while
        ArrayList<Integer> result = Gameplay.main(code,userCode);

        //then
        Assert.assertNotEquals(resultOK, result);

    }
}