import java.io.*;
class File2_data_append
{
public static void main(String[] args)
throws IOException
{
FileInputStream fin=new FileInputStream("data_java1.txt");
System.out.println("file contents are:");
int ch;
while((ch=(char)fin.read())!=-1)
System.out.println((char)ch);
fout.close();
}
}