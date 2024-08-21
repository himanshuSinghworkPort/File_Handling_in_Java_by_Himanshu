// zip unzip file program 
import java.util.zip.*;
import java.io.*;
class Zip
{
public static void main(String[] args)throws Exception

{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter file name:");
String fname=br.readLine();

FileInputStream fin=null;
 try 
 {
fin=new FileInputStream(fname);
}
catch(FileNotFoundException fe)
{
System.out.println("file not found");
return;
}
FileOutputStream fout=new FileOutputStream("fname2");
DeflaterOutputStream dos=new DeflaterOutputStream(fout);


int ch;
while((ch=fin.read())!=-1)
dos.write(ch);
System.out.print((char)ch);
fin.close();
dos.close();
}
}