
import java.io.*;
public class Armstrong
{
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number");
        int n=Integer.parseInt(in.readLine());
        int nn=n;
        int t=n;
        int r;
        int s=0;int j=0;
        while(nn!=0)
        {
            r=nn%10;
            s=s+(int)Math.pow(r,3);
            nn=nn/10;
        }
        if(s==t)
        System.out.println("It is a armstrong no.");
        else
        System.out.println("It isnt a armstrong no.");
    }
}
            
        
    
