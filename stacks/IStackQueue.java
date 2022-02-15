package stacks;

public interface IStackQueue {

    public boolean push(int value);
    public int pop();
    public boolean isFull();
    public boolean isEmpty();

    public void show();
}

/* 
push : add a implement SnQ
pop: get a implement SnQ
isFull: check SnQ is full? (array)
isEmpty: check SnQ is empty or Not?

*/