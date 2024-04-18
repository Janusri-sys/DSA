class StackArray{
    static int top=-1;
    static int[] stack=new int[5];
    public static void push(int element){
        if(top==stack.length-1){
            System.out.println("Stack overflow");
            return;
        }
        top=top+1;
        stack[top]=element;

    }
    static void pop(){

        if(top==-1){
            System.out.println("Stack underflow");
        }
        else{
        int delElement=stack[top];
        top--;
        System.out.println("Popped element : "+delElement);
        }
    }
    static void display(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
    }

    public static void main(String[] args){
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        // pop();
        display();


    }
}