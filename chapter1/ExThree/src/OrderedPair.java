// KHÔNG CÓ DÒNG PACKAGE Ở ĐÂY
interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

public class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() { return key; }
    @Override
    public V getValue() { return value; }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<>("MSSV", 10170);
        Pair<String, String> p2 = new OrderedPair<>("HoTen", "To Thi Hoa");

        System.out.println("Key: " + p1.getKey() + ", Value: " + p1.getValue());
        System.out.println("Key: " + p2.getKey() + ", Value: " + p2.getValue());
    }
}