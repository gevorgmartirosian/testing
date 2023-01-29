package homework_4.Gevorg_Martirosian.tasks;

//class for dynamic type stack
class StatStack {
    private final int[] stackArray;

    public int[] getStackArray() {
        return stackArray;
    }

    //simple constructor.
    // by default the stack will have size 10
    public StatStack() {
        this.stackArray = new int[10];
    }

    //constructor with length parameter.
    // it will be used when the user need to create the stack with the size he/she want
    public StatStack(int length) {
        this.stackArray = new int[length];
    }

    //push method for static stack, it will add the given element onto a top of the stack
    protected void push(int element) {
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray[i] == 0) {
                stackArray[i] = element;
                return;
            }
        }
        //in case push method is invoked, but the stack already full, program prints message "The stack is already full!"
        System.out.println("the stack is full");
    }

    //pop method, it will return an element from the top of the stack
    protected int pop() {
        int result = 0;
        for (int i = stackArray.length - 1; i >= 0; i--) {
            if (stackArray[i] != 0) {
                result = stackArray[i];
                stackArray[i] = 0;
                return result;
            }
        }
        System.out.println("the stack is empty");
        return result;
    }
}
