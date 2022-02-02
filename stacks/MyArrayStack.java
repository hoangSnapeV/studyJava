package stacks;



public class MyArrayStack implements IStackQueue {

    private int[] array;
    private int SIZE;

    MyArrayStack(int size) {
        SIZE = size;
        array = new int[SIZE];
    }



    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
