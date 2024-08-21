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
class Create_File_01
{
public static void main(String[] args)
throws IOException
{
DataInputStream dis=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("myfile.txt");
System.out.println("enter text(@ at the end)");
char ch;
while((ch=(char)dis.read())!='@')
fout.write(ch);
fout.close();
}
}