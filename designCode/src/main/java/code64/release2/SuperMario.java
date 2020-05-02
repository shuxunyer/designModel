package code64.release2;

public class SuperMario implements IMario {

    private MarioStateMachine stateMachine;

    public SuperMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        System.out.println("do nothing");
    }

    @Override
    public void obtainCape() {
        stateMachine.setCurrentState(new CapeMario(stateMachine));
        stateMachine.setSocre(stateMachine.getSocre() + 200);
    }

    @Override
    public void obtainFireFlower() {
        stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setSocre(stateMachine.getSocre() + 300);
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setSocre(stateMachine.getSocre() - 100);
    }
}
