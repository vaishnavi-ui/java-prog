
import java.io.*;
public class Arrange
{
    String sent;int l=0;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        {   System.out.println("Enter a sentence begining with a capital letter and ending with a full stop(.)");
            sent=in.readLine();
            l=sent.length();
            sent=sent.toLowerCase();
        }while(sent.charAt(l-1)!='.');
        sent=sent+" ";
        int k=0;
        for(int i=0;i<l;i++)
        {
            if(sent.charAt(i)==' ')
            {
                k++;
            }
        }
        int a[]=new int[k];
        String w[]=new String[k];
        for(int j=0;j<k;j++)
        {
            for(int i=0;i<l;i++)
            {
                char ch=sent.charAt(i);
                if(ch!=' ')
                {
                    w[j]=w[j]+ch;
                }
                else
                {
                    a[j]=w[j].length();
                }
            }
        }
        int temp;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        String s="";
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(a[i]==w[j].length())
                {
                    s=s+" "+w[j];
                }
            }
        }
        System.out.println("The new string is:"+s);
    }
}
