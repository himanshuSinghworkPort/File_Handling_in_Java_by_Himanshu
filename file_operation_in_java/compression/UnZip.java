// zip unzip file program 
import java.util.zip.*;
import java.io.*;
class UnZip
{
public static void main(String[] args)throws Exception

{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter file name to unzip:");
 String fname2=br.readLine();

FileInputStream fin=new FileInputStream(fname2);
FileOutputStream fout=new FileOutputStream("fname3");
InflaterInputStream iis=new InflaterInputStream(fin);


int ch;
while((ch=iis.read())!=-1)
fout.write(ch);

fout.close();
iis.close();
}
}