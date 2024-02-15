package arrays;

public class ArraysTest {
    public static void main(String[] args) {
        Array nums = new Array(5);
        nums.print();
        nums.insert(10);
        nums.insert(20);
        nums.insert(30);
        nums.insert(40);
        nums.insert(50);
        nums.insert(60);
        nums.removeAt(2);

        nums.print();

    }
}
