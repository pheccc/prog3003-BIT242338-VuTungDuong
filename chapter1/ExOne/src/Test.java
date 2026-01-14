public class Test<T> {
    // Khai báo biến private kiểu T
    private T value;

    // Phương thức set để gán giá trị
    public void set(T t) { 
        this.value = t; 
    }

    // Phương thức get để lấy giá trị
    public T get() { 
        return this.value; 
    }

    public static void main(String[] args) {
        // Kiểm thử với Integer
        Test<Integer> t1 = new Test<>();
        t1.set(100);
        System.out.println("Gia tri Integer: " + t1.get());

        // Kiểm thử với String (Lưu ý chữ S viết hoa)
        Test<String> t2 = new Test<>();
        t2.set("Hello Java");
        System.out.println("Gia tri String: " + t2.get());
    }
}
