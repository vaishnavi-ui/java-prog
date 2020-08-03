import java.io.*;
public class linklist
{
    node start = new node ();
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    void main() throws IOException
    {
        linklist ob= new linklist();
        ob.createLink();
        ob.print();
        ob.addfront();
        ob.print();
        ob.addend();
        ob.print();
        ob.addmiddle();
        ob.print();
        ob.deletefront();
        System.out.println("After deleting front node");
        ob.print();
        ob.deleteend();
        System.out.println("After deleting end node");
        ob.print();
        ob.deletemiddle();
        System.out.println("After deleting middle node");
        ob.print();
    }

    void createLink() throws IOException
    { 
        System.out.println("How many links do you want to create");
        int x= Integer.parseInt(in.readLine());
        System.out.println("Enter the data you want to store in node");
        start.data= Integer.parseInt(in.readLine());
        node current = start;
        while(x!=1)
        {
            node temp= new node();
            System.out.println("Enter the data you want to store in node");
            temp.data= Integer.parseInt(in.readLine());
            current.next=temp;
            current=temp;
            x--;
        }
    }

    void print()
    {
        node current= start;
        while(current!=null)
        {
            System.out.print(current.data +" ");
            current=current.next;
        }
        System.out.println();
    }

    void addfront()throws IOException
    {
        node temp=new node();
        System.out.println("Enter the data you want to store in node in front");
        temp.data= Integer.parseInt(in.readLine());
        temp.next=start;
        start= temp;
    }

    void addend()throws IOException
    {
        node current= start;
        while(current.next!=null)
        {
            current=current.next;
        }
        node temp=new node();
        System.out.println("Enter the data you want to store in node in end");
        temp.data= Integer.parseInt(in.readLine());
        current.next=temp; 
    }

    void addmiddle() throws IOException
    { 
      System.out.println("Enter the number of node at which you want to add node");
      int n = Integer.parseInt(in.readLine());
      node current= start;
      int i=1;
      while(i<n)
        {
           current=current.next;
           i++;
        }
      node temp=new node(); 
      System.out.println("Enter the data you want to store in the node in middle");
      temp.data= Integer.parseInt(in.readLine());
      temp.next= current.next;
      current.next=temp;
    }

    void deletefront()
    {
        node current = start.next;
        start.next= null;
        start= current;
    }

    void deleteend()
    {
        node current= start;
        while(((current.next).next)!=null)
        { 
          current=current.next;
        }
        current.next=null; 
    }

    void deletemiddle() throws IOException
    {
        System.out.println("Enter the no. of node which you want to get deleted ");
        int n = Integer.parseInt(in.readLine());
        int i=1;
        node current= start;
        while(i<(n-1))
        {
            current=current.next;
            i++;
        }
        current.next=(current.next).next;
    }
}

