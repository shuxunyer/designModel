package code64.release2;

public class CapeMario implements IMario {

    private MarioStateMachine stateMachine;

    public CapeMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.CAPE;
    }

    @Override
    public void obtainMushRoom() {
        System.out.println("do nothing");
    }

    @Override
    public void obtainCape() {
        System.out.println("do nothing");
    }

    @Override
    public void obtainFireFlower() {
        System.out.println("do nothing");
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setSocre(stateMachine.getSocre()-200);
    }
}
