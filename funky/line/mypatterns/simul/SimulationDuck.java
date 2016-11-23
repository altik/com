package com.funky.line.mypatterns.simul;

import com.funky.line.mypatterns.ducks.ADuck;
import com.funky.line.mypatterns.ducks.RedHeadDuck;
import com.funky.line.mypatterns.ducks.ToyDuck;
import com.funky.line.mypatterns.ducks.WoodDuck;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public class SimulationDuck {

    public static void main(String[] args) {
        ADuck firstDuck = new RedHeadDuck();
        firstDuck.display();
        firstDuck.useFlyAbility();
        firstDuck.move();
        firstDuck.swim();
        System.out.println("");
        ADuck secondDuck = new ToyDuck();
        secondDuck.display();
        secondDuck.useFlyAbility();
        secondDuck.move();
        secondDuck.swim();
        System.out.println("");
        ADuck thirdDuck = new WoodDuck();
        thirdDuck.display();
        thirdDuck.useFlyAbility();
        thirdDuck.move();
        thirdDuck.swim();

    }
}
