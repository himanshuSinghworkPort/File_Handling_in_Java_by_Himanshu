//multithreading
class Thread_Demo_1 extends Thread
{
public void run()
{
System.out.println("task thread");

}
public static void main(String[] arg)
{
Thread_Demo_1 t=new Thread_Demo_1();
t.start();
t.start();
}
}