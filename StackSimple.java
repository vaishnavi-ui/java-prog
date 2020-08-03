
import java.io.*;
public class StackSimple
{   int a[]=new int[10];
    int top=-1;
    int l=a.length;
    int ctrl=-1;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int cont=0;
        do
        {
            System.out.println("\f");
            System.out.println("MAKE A CHOICE");
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.DISPLAY");
            int n=Integer.parseInt(in.readLine());

            switch(n)
            {
                case 1:
                System.out.println("Enter the array element to be pushed in");
                int j=Integer.parseInt(in.readLine());
                push(j);
                break;

                case 2:
                System.out.println("Topmost element will be popped out");
                pop();
                break;

                case 3:
                display();
                break;
            }
            System.out.println("Do you wish to continue? 1=YES,0=NO.");
            cont=Integer.parseInt(in.readLine());

        }while(cont==1);

    }

    void push(int val)
    { if(ctrl==l)
        {
            System.out.println("The stack is full");
        }
        else if(ctrl==-1&&top==-1)
        {
            ctrl=0;
            top=0;
            a[top]=val;
            ctrl++;
        }
        else
        {
           for(int i=ctrl;i>0;i--)
           {
               a[i]=a[i-1];
            }
           a[top]=val;
           ctrl++;
        }
    }

    void display()
    {
        System.out.println("The stack contents are:");
        for(int i=0;i<ctrl;i++)
        {
            System.out.println(a[i]);
        }
    }

    void pop()
    {
        for(int i=0;i<ctrl;i++)
        {
          a[i]=a[i+1];
        }
        ctrl--;
    }
}
