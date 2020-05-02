package code64.release2;

public class Demo {

    public static void main(String[] args) {
        MarioStateMachine marioStateMachine = new MarioStateMachine();
        marioStateMachine.obtainMushRoom();
        System.out.println(marioStateMachine.getCurrentState().getName());
        marioStateMachine.obtainFireFlower();
        System.out.println(marioStateMachine.getCurrentState().getName());
        marioStateMachine.meetMonster();
        System.out.println(marioStateMachine.getCurrentState().getName());
        marioStateMachine.obtainCape();
        System.out.println(marioStateMachine.getCurrentState().getName());

        System.out.println("score=" + marioStateMachine.getSocre());
        System.out.println("name=" + marioStateMachine.getCurrentState().getName());

    }
}
