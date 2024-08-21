import java.io.*;
class File3_efcnt
{
public static void main(String[] args)
throws IOException
{
DataInputStream dis=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("myfile3.txt",true);
BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
System.out.println("enter data (@ at the end):");
char ch;
while((ch=(char)dis.read())!='@')
bout.write(ch);
bout.close();
}
}