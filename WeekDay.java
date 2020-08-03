
import java.io.*;
public class WeekDay
{
    int m[]={0,31,30,31,30,31,30,31,31,30,31,30,31}; int dc;	
    String day[]={"","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String date; int d1=1;int m1=1;
        System.out.println("Enter a date separated by slashes like dd/mm/yyyy");
        date=in.readLine();

        int find=2;
        int dd=Integer.parseInt(date.substring(0,2));
        int mm=Integer.parseInt(date.substring(3,5));
        int yy=Integer.parseInt(date.substring(6));
        int y1=yy;
        System.out.println("ON 0"+d1+"/0"+m1+"/"+y1+" it was a "+day[2]);
        if((y1%100!=0&&y1%4==0)||(y1%400==0))
            m[2]=29;
        while(!(dd==d1&&mm==m1&&yy==y1))
        {
            ++dc;
            ++d1;
            if(d1>m[m1])
            {
                d1=1;
                m1++;
            }
            if(m1>12)
            {
                d1=1;
                m1=1;
                y1++;
                if((y1%100!=0&&y1%4==0)||(y1%400==0))
                    m[2]=29;
            }
        }
        if(dc%7==0)

            find=find;
        else
            find=find+(dc%7);
        System.out.println("ON "+date+"it was a "+day[find]);
    }
}
