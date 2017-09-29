package frecuencia;
import java.util.*;
/**
 *
 * @author Jose
 */
public class Frecuencia {

    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Map<Integer,Integer> histogram = new HashMap<>();
        
        for (int key : data) {
            histogram.put(key,histogram.containsKey(key)? histogram.get(key) + 1 : 1);
        }
        for (int key : histogram.keySet()) {
            System.out.println(key+"-->"+ histogram.get(key)+" veces");
        }
    }
}
