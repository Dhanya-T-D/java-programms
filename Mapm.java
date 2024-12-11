import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapm {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        Map<Integer,String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 key value pair to map : ");
        for (int i = 0; i < 2; i++) {
            map.put(sc.nextInt(), sc.next());
        }
        System.out.println("map1 : "+map);
        map1.putAll(map);
        System.out.println("map2 : "+map1);
        System.out.println("key set : "+map.keySet());
        System.out.println("value set : "+map.values());
        System.out.println("entry set : "+map.entrySet());
        map.remove(4);
        System.out.println("After remove : "+map);
        System.out.println(map.getOrDefault(0,"key"));
        System.out.println("replace : ");
        map.replace(1,"name");
        System.out.println(map);
    }
}
