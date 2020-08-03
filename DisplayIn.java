
import java.io.*;
public class DisplayIn
{
    int m[]={0,31,30,31,30,31,30,31,31,30,31,30,31}; int dc=0;	
    void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter  the day number");
        int day=Integer.parseInt(in.readLine());
        System.out.println("Enter  the year");
        int yy=Integer.parseInt(in.readLine());
        int dd=0; int mm=0;
        while(day!=dc)
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
        if(mm==1)
            System.out.print("January");
        else if(mm==2)
            System.out.print("February");
        else if(mm==3)
            System.out.print("March");
        else if(mm==4)
            System.out.print("April");
        else if(mm==5)
            System.out.print("May");
        else if(mm==6)
            System.out.print("June");
        else if(mm==7)
            System.out.print("July");
        else if(mm==8)
            System.out.print("August");
        else if(mm==9)
            System.out.print("September");
        else if(mm==10)
            System.out.print("October");
        else if(mm==11)
            System.out.print("November");
        else if(mm==12)
            System.out.print("December");
        System.out.println(" "+dd+","+yy);
    }
}

        
    
    