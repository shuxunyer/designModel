package code47;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Demo1 {

    private ConcurrentMap<String, SearchWord> currentKeyWords = new ConcurrentHashMap<String, SearchWord>();

    private long lastUpdateTime = -1;

    public void refresh() {
        //从数据库中取出更新时间>lastUpdateTime的数据，放入到currentKeyWords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxUpdateTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getUpdateTime() > maxUpdateTime) {
                maxUpdateTime = searchWord.getUpdateTime();
            }
            if (currentKeyWords.containsKey(searchWord.getKeyWord())) {
                currentKeyWords.replace(searchWord.getKeyWord(), searchWord);
            } else {
                currentKeyWords.put(searchWord.getKeyWord(), searchWord);
            }
        }
        lastUpdateTime = maxUpdateTime;
    }


    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        return null;
    }

}
