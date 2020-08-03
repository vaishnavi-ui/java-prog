
import java.io.*;
public class QueSimple
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
            System.out.println("1.INSERT");
            System.out.println("2.DELETE");
            System.out.println("3.DISPLAY");
            int n=Integer.parseInt(in.readLine());

            switch(n)
            {
                case 1:
                System.out.println("Enter the array element to be inserted in");
                int j=Integer.parseInt(in.readLine());
                insert(j);
                break;

                case 2:
                System.out.println("Topmost element will be deleted");
                delete();
                break;

                case 3:
                display();
                break;
            }
            System.out.println("Do you wish to continue? 1=YES,0=NO.");
            cont=Integer.parseInt(in.readLine());

        }while(cont==1);

    }

    void insert(int val)
    { if(ctrl==l)
        {
            System.out.println("The queue is full");
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
           a[ctrl]=val;
           ctrl++;
        }
    }

    void display()
    {
        System.out.println("The queue contents are:");
        for(int i=0;i<ctrl;i++)
        {
            System.out.println(a[i]);
        }
    }

    void delete()
    {
        for(int i=0;i<ctrl;i++)
        {
          a[i]=a[i+1];
        }
        ctrl--;
    }
}
