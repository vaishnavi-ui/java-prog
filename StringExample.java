
import java.io.*;
public class StringExample
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    String str; int w;

    void input()throws IOException
    {
        System.out.println("Enter a sentence ");
        str=in.readLine();
        str=" "+str;
        
    }

    void findWords(int x)
    {   if(x==str.length()-1)
            System.out.println("End");
        else
        {
            if(str.charAt(x)==' ')
            {
                if(str.charAt(x+1)=='A'||str.charAt(x+1)=='E'||str.charAt(x+1)=='I'||str.charAt(x+1)=='O'||str.charAt(x+1)=='U')
                {
                    w++;
                }
            }
             findWords(++x);
        }
    }

    void Result()
    {
        System.out.print("The no of capital vowels in the sentence are:");
        System.out.println(w);
    }

    void main() throws IOException
    {
        input(); int i=0;
        findWords(i);
        Result();
    }
}

