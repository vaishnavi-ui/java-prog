
import java.io.*;
public class DisplayDate
{
    int m[]={0,31,30,31,30,31,30,31,31,30,31,30,31}; int dc;	
    String day[]={"","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
    void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int dd=1;int mm=1;int yy=2001;
        System.out.println("Enter a difference of dates");
        int diff=Integer.parseInt(in.readLine());
        int find=2;
        while(diff!=dc)
        {
            ++dc;
            ++dd;
            if(dd>m[mm])
            {
                dd=1;
                mm++;
            }
            if(mm>12)
            {
                dd=1;
                mm=1;
                yy++;
                if((yy%100!=0&&yy%4==0)||(yy%400==0))
                    m[2]=29;
            }
        }
        if(dc==diff)
        {
            if(dc%7==0)

                find=find;
            else
                find=find+(dc%7);
            System.out.println("ON "+dd+" "+mm+" "+yy+" "+"it was a "+day[find]);
        }
    }
}