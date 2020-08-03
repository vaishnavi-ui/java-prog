import java.io.*;

//1.arry_of_obj a[]=new arry_of_obj[n];
//2.IN FOR LOOP OF N VALUE: a[i]=arry_of_obj();

public class Arry_of_obj
{
    String name; int n;
    int total; int sub[]=new int[5];
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the number of students");
        n=Integer.parseInt(in.readLine());

        Arry_of_obj a[]=new Arry_of_obj[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new Arry_of_obj ();
            System.out.println("Enter a name");
            a[i].name=in.readLine();
            System.out.println("Enter 5 subject marks");
            for(int j=0;j<5;j++)
            {
                a[i].sub[j]=Integer.parseInt(in.readLine());
            }
        }
        calculate(a);
        display(a);
    }

    void calculate(Arry_of_obj a[])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<5;j++)
            {
                a[i].total=a[i].sub[j]+a[i].total;
            }
        }

    }

    void display(Arry_of_obj a[])
    {
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.println("The name is--"+a[i].name);
            System.out.println("The total subject marks are--"+a[i].total);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
}


