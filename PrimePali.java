
import java.io.*;
public class PrimePali
{
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int k=0;int nn,r;int rever=0;

        System.out.println("Enter a number");
        int n=Integer.parseInt(in.readLine());

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                k++;
                break;
            }
        }

        if(k==0)
        {
            nn=n;
            while(nn!=0)
            { r=nn%10;
                rever=rever*10+r;
                nn=nn/10;

            }
            if(n==rever)
            {
                System.out.println("It is a prime palindrome number");
            }
        }
        else
        {
            System.out.println("Not a prime palindrome number");
        }
    }
}

