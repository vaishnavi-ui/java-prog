
import java.io.*;
public class Wondrous
{ 
    int a[][];int n;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Wondrous ob=new Wondrous();
        ob.input();
        ob.check();
        ob.prime();
    }

    void input()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        { System.out.println("Enter the size of the grid");
            n=Integer.parseInt(in.readLine());
        }while(n<2||n>10);  
        System.out.println("Enter the "+n*n+" elements of the array");
        a=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) 
            {
                a[i][j]=Integer.parseInt(in.readLine()); 
            }
        }
    }

    void check()
    {
        double s=0.5*n*(n*n+1);double l=0.0;double m=0.0;int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                l=l+a[i][j];
                m=m+a[j][i];
            }
            if(m==s&&l==s)
            {
                k++;
                break;
            }
        }
        if(k==1)
        {
            System.out.println("IT IS A WONDROUS SQUARE");
        }
        else
            System.out.println("IT IS NOT A WONDROUS SQUARE");
    }

    void prime()
    {
        System.out.println("PRIME \t"+"ROW \t"+"COLUMN ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int b=2;b<a[i][j];b++)
                {
                    if(a[i][j]%b!=0)
                    {
                        System.out.println(a[i][j]+"\t"+i+"\t"+j);
                        break;
                    }
                }
            }
        }
    }
}