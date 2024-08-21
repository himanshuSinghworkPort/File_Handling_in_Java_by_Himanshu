/*
welcome to java programming today we will discuss stream and file operations in java
STREAM
FILE1.................................FILE2
INPUT STREAM READING DATA FROM SOURCE
OUTPUT STREAM WRITING DATA TO ANY DESTINATION
CLASS 
OBJECT
JAVA.IO.FILE
*/
import java.io.*;
class Create_File_04_readdata_from_file
{
public static void main(String[] args)
throws IOException
{
//DataInputStream dis=new DataInputStream(System.in);
//FileOutputStream fout=new FileOutputStream("myfile2.txt",true);
//BufferedOutputStream bout=new BufferedOutputStream(fout,1024);

FileInputStream fin=new FileInputStream("myfile4.txt");
System.out.println("file contents are:");
int ch;
//System.out.println("enter text(@ at the end)");
while((ch=fin.read())!=-1)
System.out.print((char)ch);
fin.close();
}
}