package code64;

import java.util.HashMap;
import java.util.Map;

public class MarioStateMachine {

    private int socre;
    private State currentState;

    public MarioStateMachine() {
        this.socre = 0;
        this.currentState = State.SMALL;
    }

    Map<State, Map<State, Action>> registerStateTransition = new HashMap<State, Map<State, Action>>();


    /*private static final State[][] transitionTable = {
            {SUPER, CAPE, FIRE, SMALL},
            {SUPER, CAPE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL},
            {FIRE, FIRE, FIRE, SMALL}
    };

    private static final int[][] actionTable = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}
    };

    SMALL(0),SUPER(1),FIRE(2),CAPE(3);
    GOT_MUSHROOM(0), GOT_CAPE(1), GOT_FIRE(2), MET_MONSTER(3);

    private void executeEvent(Event event) {
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = transitionTable[stateValue][eventValue];
        this.score = actionTable[stateValue][eventValue];
    }
*/

    public void obtainMushRoom() {

    }

    public void obtainCape() {

    }

    public void obtainFireFlower() {

    }

    public void meetMonster() {

    }
}
