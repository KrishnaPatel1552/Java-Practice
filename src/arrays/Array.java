package arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        //if array is full
        if(items.length == count){
            int[] newItems = new int[count*2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        // if array has enough space
        items[count] = item;
        count++;
    }

    public void removeAt(int index){
        //validate if index is in the array
        if(index<0 || index >=count){
            throw new IllegalArgumentException();
        }
        // now that index is valid, delete the item at index and shift items from right to left by one
        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count--;
    }
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]+"\t");
        }
        System.out.println();
    }
}
