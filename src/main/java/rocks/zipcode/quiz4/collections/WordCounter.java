package rocks.zipcode.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounter {
    private String[] wordArray;
    private LinkedHashMap<String, Integer> wordMap;

    public WordCounter(String... strings) {

        this.wordArray = strings;
        this.wordMap = new LinkedHashMap<>();
    }

    public Map<String, Integer> getWordCountMap() {
        for (String str: this.wordArray) {
            this.wordMap.merge(str, 1, Integer::sum);
        }

        return this.wordMap;
    }
}
