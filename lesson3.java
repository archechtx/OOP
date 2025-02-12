import java.util.*;

public class lesson3 {
    ArrayList<String> arr = new ArrayList<String>();
    HashSet<String> set = new HashSet<String>();
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    // public lesson3(){
    //     arr.add("Kei");

    //     String word = arr.get(0);
    //     for(int i = 0; i < word.length(); i++){
    //         System.out.println(word.charAt(i));
    //     }
    // }

    // public lesson3(){
    //     set.add("2");
    //     set.add("1");
    //     set.add("3");
    //     System.out.println(set);
    // }

    public lesson3(){
        map.put("Kei", 99);
        map.put("Budi", 88);
        map.forEach(
            (k, v) -> System.out.println(k + " " + v)
        );
        System.out.println(map);
    }
    public static void main(String[] args) {
        new lesson3();
    }
}
