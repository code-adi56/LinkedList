class Stack
{
    static final int MAX = 1000;
    int top;
    int a[]=new int[MAX];
    boolean isEmpty()
    {
        return(top<0);
    }
    Stack(){
        top = -1;
    }
    boolean push(int x)
    {
        if (top>=(MAX-1))
        {
            System.out.println("STACK Overflow");
            return false;
        }
        else
        {
            a[++top]=x; 
            System.out.println(x+"pushed into stack ");
            return true;
        }
    }

    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack Overall");
            return 0;
        }
        else {int x= a[top--];
        return 0;
    }
    }
int peek()
{
    if(top<0)
    {
        System.out.println("Stack underflow");
        return 0;
    }
    else{
        int x= a[top];
        return x;
    }
}
void print()
{
    for(int i=top;i>-1;i--)
    {
        System.out.println(" "+a[i]);

    }
}

}

class Stackmain
{ 
public static void main(String[] args) 
{
    Stack s= new Stack();
    s.push(100);
    s.push(100);
    System.out.println(s.pop());
    s.print();

    
}

}