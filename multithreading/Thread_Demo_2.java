//multithreading
class Thread_Demo_2 implements Runnable
{
public void run()
{
System.out.println("task thread");

}
public static void main(String[] arg)
{
Thread_Demo_2 t=new Thread_Demo_2();
Thread th=new Thread(t);
th.start(); // once athread is in dead state you can not access it again.
//t.start();
}
}