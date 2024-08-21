import java.io.*;
import java.util.*;
class Store_Data
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
FileOutputStream fout=new FileOutputStream("objFile.txt",true);
ObjectOutputStream oos=new ObjectOutputStream(fout);
System.out.println("how many emp data you want tlo enter:");
int n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
Employee e1=Employee.getData();
oos.writeObject(e1);
}
oos.close();

}
}