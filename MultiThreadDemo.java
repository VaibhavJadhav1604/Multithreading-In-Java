class MyThread extends Thread
{
String message;
MyThread(String message)
{
this.message = message;
}
public void run()
{
try
{
for(int i=1; i<=5; i++)
{
System.out.println(message + "-" + i);
Thread.sleep(5000); //sleep for 5 seconds
}
}
catch(InterruptedException ie) { }
}
}
public class MultiThreadDemo
{
public static void main( String[] args)
{
MyThread t1 = new MyThread("One");
MyThread t2 = new MyThread("Two");
System.out.println(t1);
System.out.println(t2); t1.start();
t2.start();
}
}


