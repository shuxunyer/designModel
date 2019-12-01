package code10;

import code10.ability.egg.EggAbility;
import code10.ability.egg.EggLayable;
import code10.ability.fly.FlyAbility;
import code10.ability.fly.Flyable;
import code10.ability.tweet.TweetAbility;
import code10.ability.tweet.Tweetable;

/**
 * 麻雀
 */
public class Sparrow implements Flyable, Tweetable, EggLayable {//集成需要的接口
    /**
     * 组合
     */
    private FlyAbility flyAbility = new FlyAbility();
    private TweetAbility tweetAbility = new TweetAbility();
    private EggAbility eggAbility = new EggAbility();

    public void layEgg() {
        eggAbility.layEgg();//委托
    }

    public void fly() {
        flyAbility.fly();
    }

    public void tweet() {
        tweetAbility.tweet();
    }
}
