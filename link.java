import java.io.*;
public class link
{
node start1 = new node ();
node start2 = new node ();
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read); 
void main() throws IOException
{
link ob= new link();
ob.createLink1();
ob.createLink2();
System.out.println("link 1");
ob. print ();
System.out.println("link 2");
ob. print2 ();
System.out.println("link 1 and 2 joined ");
ob.joinLink();
ob. print ();
}
void createLink1() throws IOException
{
System.out.println("how many links do you want to create");
int x= Integer.parseInt(in.readLine());
System.out.println("enter the data you want to store in node");
start1.data= Integer.parseInt(in.readLine());
node current = start1;
while(x!=1)
{
node temp= new node();
System.out.println("enter the data you want to store in node");
temp.data= Integer.parseInt(in.readLine());
current.next=temp;
current=temp;
x--;
}
}
void createLink2() throws IOException
{
System.out.println("how many links do you want to create");
int x= Integer.parseInt(in.readLine());
System.out.println("enter the data you want to store in node");
start2.data= Integer.parseInt(in.readLine());
node current = start2;
while(x!=1)
{
node temp= new node();
System.out.println("enter the data you want to store in node");
temp.data= Integer.parseInt(in.readLine());
current.next=temp;
current=temp;
x--;
}
}
void print ()
{
node current= start1;
while(current!=null)
{
System.out.print(current.data +" ");
current=current.next;
}
System.out.println();
}
void print2()
{
node current= start2;
while(current!=null)
{
System.out.print(current.data +" ");
current=current.next;
}
System.out.println();
}
void joinLink()
{
node current= start1;
while(current.next!=null)
{
current=current.next;
}

current.next=start2; 
}
    }
                                                                        