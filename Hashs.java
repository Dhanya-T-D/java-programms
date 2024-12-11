import java.util.HashSet;

public class Hashs {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        System.out.println("\nhs :"+hs);
        hs2.add("e");
        hs2.add("b");
        hs2.add("g");
        hs2.add("d");
        System.out.println("\nhs1 :"+ hs1);
        System.out.println("\nhs2 :"+hs2);
        hs2.addAll(hs);

        System.out.println("\nunion : "+ hs2);
        System.out.println("\nhs2: "+hs2);

        hs2.retainAll(hs);
        System.out.println("\nintersecion : "+ hs2);
        System.out.println("\nhs2: "+hs2);

        System.out.println("\nSubset ? : "+hs.containsAll(hs2));
    }
}
