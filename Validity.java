
import java.io.*;
public class Validity
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    String date,d,m,y;
    int day,mon,yr,cont;int yy=0;
    void input() throws IOException
    {
        System.out.println("Enter the date separated by a slash(/) as dd/mm/yyyy");
        date=in.readLine();
    }

    void extract()
    {
        d=date.substring(0,2);
        day=Integer.parseInt(d);
        m=date.substring(3,5);
        mon=Integer.parseInt(m);
        y=date.substring(6,10);
        yr=Integer.parseInt(y);
    }

    void leapyear()
    {
        if(yr%4==0&&(yr%100!=0 || yr %400 ==0))
        {
            yy++;
        }
    }

    void validity()
    {
        if(mon>0&&mon<=12)
        {
            if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12&&(day>0&&day<=31))  
            {
                System.out.println("VALID DATE");
            }
            else if(mon==4||mon==6||mon==9||mon==11&&(day>0&&day<=30))
            {
                System.out.println("VALID DATE");
            }
            else if(mon==2)
            {
                if(yy!=0&&(day>0&&day<=29))

                    System.out.println("VALID DATE");
                else if(yy==0&&(day>0&&day<=28))
                    System.out.println("VALID DATE"); 
            }
        }
        else
            System.out.println("INVALID DATE");
    }
    void main()throws IOException
    {
        do
        {
            input();
            extract();
            validity();
            System.out.println("Do you wish to continue?Enter 1-yes and 0-no");
            cont=Integer.parseInt(in.readLine());
        }while(cont==1);
    }
}