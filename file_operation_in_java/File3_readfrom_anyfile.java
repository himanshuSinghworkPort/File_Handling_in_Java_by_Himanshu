import java.io.*;
class File3_readfrom_anyfile
{
public static void main(String[] args)
throws IOException
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
BufferedInputStream bin=new BufferedInputStream(fin);

System.out.println("file contents are:");
int ch;
while((ch=bin.read())!=-1)
System.out.print((char)ch);
bin.close();
}
}