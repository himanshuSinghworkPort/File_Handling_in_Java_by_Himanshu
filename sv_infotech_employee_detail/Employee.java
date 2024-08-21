import java.io.*;
import java.util.Date;

class Employee implements Serializable
{
String name;
int id;
int salery;
Date doj;
Employee(int i,String n,int s,Date d)
{
id=i;
name=n;
salery=s;
doj=d;
}
void display()
{
System.out.println(id+"\t"+name+"\t"+salery+"\t"+doj);
}
static Employee getData()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter employee detail:");
System.out.println("enter employee name:");
String name=br.readLine();
System.out.println("enter employee id:");
int id=Integer.parseInt(br.readLine());
System.out.println("enter employee salery:");
int salery=Integer.parseInt(br.readLine());
System.out.println("enter employee DATE OF JOINING IS:");
Date d=new Date();
Employee e=new Employee(id,name,salery,d);
return e;
}
}