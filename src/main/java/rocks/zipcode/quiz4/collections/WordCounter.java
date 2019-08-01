package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    String[] wordArray;
    public WordCounter(String... strings) {
        this.wordArray = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        HashMap<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < wordArray.length; i++) {
            if(wordMap.containsKey(wordArray[i])){
                wordMap.replace(wordArray[i], wordMap.get(wordArray[i])+1);
            }else {
                wordMap.put(wordArray[i], 1);
            }
        }

        return wordMap;
    }
}
