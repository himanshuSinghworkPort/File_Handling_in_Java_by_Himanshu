import java.io.*;
class File1
{
public static void main(String[] args)
throws IOException
{
DataInputStream dis=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("myfile.txt",true);
System.out.println("enter data (@ at the end):");
char ch;
while((ch=(char)dis.read())!='@')
fout.write(ch);
fout.close();
}
}