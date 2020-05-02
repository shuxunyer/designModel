package code64.release2;

public class SmallMario implements IMario {

    private MarioStateMachine stateMachine;

    public SmallMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        stateMachine.setCurrentState(new SuperMario(stateMachine));
        stateMachine.setSocre(stateMachine.getSocre() + 100);
    }

    @Override
    public void obtainCape() {
        stateMachine.setCurrentState(new CapeMario(stateMachine));
        stateMachine.setSocre(stateMachine.getSocre() - 200);
    }

    @Override
    public void obtainFireFlower() {
        stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setSocre(stateMachine.getSocre() + 300);
    }

    @Override
    public void meetMonster() {
        System.out.println("do nothing");
    }
}
