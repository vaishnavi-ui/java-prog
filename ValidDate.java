
import java.io.*; 
public class ValidDate
{
    String date;
    int m[]={0,31,30,31,30,31,30,31,31,30,31,30,31};
    void main()throws IOException
    {   int cont;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        {
            System.out.println("Enter the date separated by a slash in the form dd/mm/yyyy");
            date=in.readLine();
            int dd=Integer.parseInt(date.substring(0,2));
            int mm=Integer.parseInt(date.substring(3,5));
            int yy=Integer.parseInt(date.substring(6));
            if((yy%100!=0&&yy%4==0)||(yy%400==0))
                m[2]=29;
            if(yy>0)
            {
                if(mm>0&&mm<=12)
                {
                    if(dd<=m[mm])

                        System.out.println("VALID DATE");
                    else
                        System.out.println("INVALID DATE");
                }
                else
                    System.out.println("INVALID MONTH");
            }
            else
                System.out.println("INVALID YEAR");
            System.out.println("Do you wish to continue?1=YES,0=NO");
            cont=Integer.parseInt(in.readLine());
        }while(cont==1);
    }
}
