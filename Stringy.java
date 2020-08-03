
import java.io.*;
public class Stringy
{
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a word");
        String n=in.readLine(); String s="";
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            s=ch+s+" ";
        }
        System.out.println(s);
    }
}
    