package code10;

import code10.ability.egg.EggAbility;
import code10.ability.egg.EggLayable;
import code10.ability.tweet.TweetAbility;
import code10.ability.tweet.Tweetable;

/**
 * 鸵鸟
 */
public class Ostrich implements Tweetable, EggLayable {//集成需要的接口
    /**
     * 组合
     */
    private TweetAbility tweetAbility = new TweetAbility();
    private EggAbility eggAbility = new EggAbility();

    public void layEgg() {
        tweetAbility.tweet();//委托
    }

    public void tweet() {
        eggAbility.layEgg();//委托
    }
}
