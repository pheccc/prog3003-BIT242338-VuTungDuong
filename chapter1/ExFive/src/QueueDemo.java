import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        // 1. Sử dụng LinkedList để mô phỏng hàng đợi
        LinkedList<Integer> queue = new LinkedList<>();

        // 2. Thêm các số 10, 20, 30 vào danh sách
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // 3. Thêm số 5 vào đầu và 40 vào cuối danh sách
        queue.addFirst(5);
        queue.addLast(40);

        System.out.println("Danh sach truoc khi xoa: " + queue);

        // 4. Xóa phần tử đầu tiên và cuối cùng
        queue.removeFirst();
        queue.removeLast();

        // In danh sách còn lại
        System.out.println("Danh sach sau khi xoa dau va cuoi: " + queue);
    }
}
