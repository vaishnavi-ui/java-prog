import java.util.*;
import java.io.*;
public class StGraph
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    String s; StringTokenizer st;
    int k; String n;
    int vo,wo,vv,ww;
    int v[]; int w[];
    void input()throws IOException
    {
        System.out.println("Enter a set of sentences separated by .,!?.The total no. of sentences should be less than 10 and enter in capitals");
        s=in.readLine();
        s=" "+s.toUpperCase();
    }

    void main()throws IOException
    {
        input();
        st=new StringTokenizer(s,".,!?");
        k=st.countTokens();
        v=new int[k];
        w=new int[k];

        extract();
        display();
        graph();
    }

    void extract()
    {

        while(st.hasMoreTokens())
        {
            for(int j=0;j<k;j++)
            {
                n=st.nextToken();

                v[j]=vowel(n);
                w[j]=word(n);
            }
        }
    }

    int vowel(String x)
    {   
        vo=0;
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);

            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                vo++;

        }
        return vo;
    }

    int word(String y)
    {
        wo=0;
        for(int i=0;i<y.length();i++)
        {
            char ch=y.charAt(i);
            if(ch==' ')
                wo++;
        }
        return wo;

    }

    void display()
    {
        System.out.println("Sentence    "+"No. of vowels    "+"No.of words  ");
        for(int m=0;m<k;m++)
        {
            System.out.println((m+1)+"  "+v[m]+"    "+w[m]);
        }
    }

    void graph()
    { 
        System.out.println("Sentence	"+"No of vowels/No of words	");
        for(int i=0;i<k;i++)
        {
            System.out.print((i+1)+"	");
            vv=3*v[i];
            for(int v=0;v<vv;v++)
            {
                System.out.print("v");
            }
			System.out.print("/");
            ww=3*w[i];
            for(int w=0;w<ww;w++)
            {
				System.out.print("w");
            } 
			System.out.println();       
        }
    }
}
