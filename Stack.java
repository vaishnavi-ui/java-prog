
import java.io.*;
public class Stack
{
    static String st[];
    static int size;
    static int top;static int ctrl;
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the size of the array.");
        size=Integer.parseInt(in.readLine());
        Stack ob=new Stack(size);
        Stack ob1=new Stack();
        st=new String[size];
        ctrl=-1;
        int cont=0;
        
        do
        {
            System.out.println("\f");
            System.out.println("MAKE A CHOICE");
            System.out.println("1.PUSH NAME");
            System.out.println("2.POP NAME");
            System.out.println("3.DISPLAY");
            int ch=Integer.parseInt(in.readLine());

            switch(ch)
            {
                case 1:
                System.out.println("Enter the name you want to push in");
                String push=in.readLine();
                ob.pushname(push);
                break;

                case 2:
                System.out.println("The topmost name will be popped out");
                String pp=ob.popname();
                break;

                case 3:
                ob.display();
                break;
            }
            System.out.println("Do you wish to continue? 1=YES,0=NO");
            cont=Integer.parseInt(in.readLine());
        }while(cont==1);
    }

    Stack()
    {
    }

    Stack(int cap)
    {   top=-1;
        cap=size;
    }

    void pushname(String n)
    {
        if(ctrl==size)
        {
            System.out.println("The stack is full");
        }
        else if(ctrl==-1&&top==-1)
        {
            ctrl=0;
            top=0;
            st[top]=n;
            ctrl++;
        }
        else
        {
            for(int i=ctrl;i>0;i--)
            {
                st[i]=st[i-1];
            }
            st[top]=n;
            ctrl++;
        }
    }

    String popname()
    {
        top=0;
        if(ctrl>0)
        {
            String pop=st[top];
            for(int i=0;i<ctrl-1;i++)
            {
                st[i]=st[i+1];
            }
            ctrl--;
            return pop;
        }
        else
        {
            System.out.println("The stack is empty");
            return null;
        }
    }

    void display()
    {
        System.out.println("The stack contents are:");
        for(int i=0;i<ctrl;i++)
        {
            System.out.println(st[i]);
        }
    }
}
