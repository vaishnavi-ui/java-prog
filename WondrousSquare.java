
import java.io.*;
public class WondrousSquare
{
    int a[][];int n;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the size of the array");
        n=Integer.parseInt(in.readLine());
        //if(n>=2&&n<=10)
        //{
        //int x=0;
        a=new int[n][n];
        System.out.println("Enter the "+(n*n)+" elements in the array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());
            }
        }
        //System.out.println("OUT");
        singleOccur();

        //}
        /*else
        {
            System.out.println("INVALID INPUT");
        }*/
    }

    void singleOccur()
    {
        int c=1;int k=0;
        while(c!=(n*n)+1)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(a[i][j]==c)
                    {
                        k++;
                    }
                }
            }
        }
        if(k==(n*n))
        {
            check();
        }
        else
        {
            System.out.println("NOT A WONDROUS SQUARE");
            prime();
        }
    }

    void check()
    {
        double val=0.5*n*(n*n+1);
        int k1=0;
        for(int i=0;i<n;i++)
        {
            double s1=0.0,s2=0.0;
            for(int j=0;j<n;j++)
            {
                s1=s1+a[i][j];
                s2=s2+a[j][i];
            }
            if(s1==val&&s2==val)
            {
                k1++;
            }
        }
        if(k1==n)
        {
            System.out.println("IT IS A WONDROUS SQUARE");
        }
        else
        {
            System.out.println("NOT A WONDROUS SQUARE");
        }
        prime();
    }

    void prime()
    {
        int b[];int row[];int column[];int d=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int p=2;p<a[i][j];p++)
                {
                    if(a[i][j]%p!=0)
                    {
                        d++;
                    }
                }
            }
        }
        if(d!=0)
        {
            b=new int[d];int p=0;
            row=new int[d];column=new int[d];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for(int pr=2;pr<a[i][j];pr++)
                    {
                        if(a[i][j]%p!=0)
                        {
                            b[p]=a[i][j];
                            row[p]=i;
                            column[p]=j;
                            p++;
                        }
                    }
                }
            }
            System.out.println("NUMBER \t"+"ROW \t"+"COLUMN \t");
            for(int i=0;i<d;i++)
            {
                System.out.println(b[i]+"\t"+row[i]+"\t"+column[i]+"\t");
            }
        }
    }
}
