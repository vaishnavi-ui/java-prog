
import java.io.*;
public class Calender
{
    int d[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    String m[]={"","JANAURY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    String wk[]={"","SUN","MON","TUE","WED","THU","FRI","SAT"};
    int y=0;String dd="";String month=""; int temp;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the year");
        y=Integer.parseInt(in.readLine());int st=0;
        if((y%4==0&&y%100==0)||(y%400==0))
        {
            d[2]=29;
        }
        System.out.println("Enter the month");
        month=in.readLine();
        month=month.toUpperCase();
        for(int i=0;i<m.length;i++)
        {
            if(month.equalsIgnoreCase(m[i]))
            {
                temp=i;  
            }
        }
        System.out.println("Enter the day of the first date of the month");
        dd=in.readLine();
        for(int i=0;i<wk.length;i++)
        {
           if(dd.compareTo(wk[i])==0)
           {
                st=i;
            }
        }
        System.out.println("\t \t"+month+"\t \t");
        for(int i=0;i<wk.length;i++)
        {
            System.out.print(wk[i]+"\t");
        }
        
        int a=st;int c=0;
        while(a!=0)
        {
            System.out.print("\t");
            a--;
            c++;
        }

        for(int i=1;i<=d[temp];i++)
        {
            if(c%7==0)
            {
                System.out.println();
                c=0;
            }
            else
            {
                System.out.print(d[i]+"\t");
                c++;
            }
        }
    }
}
