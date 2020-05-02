package code64.release2;

public class FireMario implements IMario {

    private MarioStateMachine stateMachine;

    public FireMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }

    @Override
    public void obtainMushRoom() {
        System.out.println(getName()+ "do nothing");
    }

    @Override
    public void obtainCape() {
        System.out.println(getName()+ "do nothing");
    }

    @Override
    public void obtainFireFlower() {
        System.out.println(getName()+ "do nothing");
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setSocre(stateMachine.getSocre()-300);
    }
}
