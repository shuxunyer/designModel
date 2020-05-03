package code47;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class Demo2 {

    private Map<String, SearchWord> currentKeyWords = new HashMap<String, SearchWord>();

    private long lastUpdateTime = -1;

    public void refresh() {
        //从数据库中取出更新时间>lastUpdateTime的数据，放入到currentKeyWords中
        HashMap<String, SearchWord> newKeyWords = (HashMap<String, SearchWord>) currentKeyWords.clone();
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxUpdateTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getUpdateTime() > maxUpdateTime) {
                maxUpdateTime = searchWord.getUpdateTime();
            }
            if (newKeyWords.containsKey(searchWord.getKeyWord())) {
                newKeyWords.replace(searchWord.getKeyWord(), searchWord);
            } else {
                newKeyWords.put(searchWord.getKeyWord(), searchWord);
            }
        }
        lastUpdateTime = maxUpdateTime;
        currentKeyWords = newKeyWords;
    }


    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        return null;
    }

}
