import java.io.*;
class File3_readfrom_file
{
public static void main(String[] args)
throws IOException
{
FileInputStream fin=new FileInputStream("data_java1.txt");
System.out.println("file contents are:");
int ch;
while((ch=fin.read())!=-1)
System.out.print((char)ch);
fin.close();
}
}