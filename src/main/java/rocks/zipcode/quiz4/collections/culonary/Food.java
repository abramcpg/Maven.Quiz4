package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    HashMap<Spice, Integer> spiceMap = new HashMap<>();

    public List<Spice> getAllSpices() {
        List<Spice> spiceList = new ArrayList<>();

        Set<Spice> spiceSet = spiceMap.keySet();

        spiceList.addAll(spiceSet);

        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return null;
    }

    public void applySpice(Spice spice) {
        if (spiceMap.containsKey(spice)){
            spiceMap.replace(spice, spiceMap.get(spice)+1);
        }else{
            spiceMap.put(spice, 1);
        }
    }
}
