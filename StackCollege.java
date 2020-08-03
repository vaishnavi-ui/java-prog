
import java.io.*;
public class StackCollege
{
    int top,n;
    int a[];
     void main()throws IOException
    {
        int c,ch;
        top=-1;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the size of array");
        n=Integer.parseInt(in.readLine());
        a=new int[n];
        do
        {
            System.out.println("Make a choice");
            System.out.println("1.is empty");
            System.out.println("2.is full");
            System.out.println("3.pop");
            System.out.println("4.push");
            System.out.println("5.peep");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:
                isEmpty();
                break;
                
                case 2:
                isFull();
                break;
                
                case 3:
                pop();
                break;
                
                case 4:
                push();
                break;
                
                case 5:
                peep();
                break;
                
                default:
                System.out.println("wrong choice");
            }
            System.out.println("Do you wish to continue?1=YES,0=NO");
            c=Integer.parseInt(in.readLine());
        }while(c==1);
    }
    void isEmpty()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
    }
    void isFull()
    {
        if(top==n)
        {
            System.out.println("Stack is full");
        }
    }
    void pop()
    {
        if(top>=0)
        {
            a[top]=0;
            top--;
        }
        else
        {
            System.out.println("Stack underflow");
        }
    }
    void push()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        if(top==n-1)
        {
            System.out.println("Overflow");
        }
        else
        {
            top++;
            a[top]=Integer.parseInt(in.readLine());
        }
    }
    void peep()
    {
        if(top==n-1)
        {
            System.out.println("Overflow");
        }
        else if(top==-1)
        {
            System.out.println("Underflow");
        }
        else
        System.out.println(a[top]);
    }
}
