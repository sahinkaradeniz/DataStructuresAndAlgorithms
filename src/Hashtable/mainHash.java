package Hashtable;

public class mainHash {
    public static void main(String[] args) {
        HashTableArray<String> test=new HashTableArray<String>(10);
        test.put(12,"Akdeniz");
        test.put(13,"Sahin");
        test.put(12,"Karadeniz");
        System.out.println(test.get(12));
    }
}
