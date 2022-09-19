class PriorityDemo extends Thread
{ 
public void run()
 { 
 System.out.println("running thread name is:"+Thread.currentThread().getName()); 
 System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
 } 
public static void main(String args[])
{ 
 PriorityDemo m1=new PriorityDemo(); 
 PriorityDemo m2=new PriorityDemo(); 
 m1.setPriority(Thread.MIN_PRIORITY); 
 m2.setPriority(Thread.MAX_PRIORITY); 
 m1.start(); 
 m2.start(); 
} 
} 
class First
{
 synchronized public void display(String msg)
 {
 System.out.print ("["+msg);
 try
 {
 Thread.sleep(1000);
 }
 catch(InterruptedException e)
 {
 e.printStackTrace();
 }
 System.out.println ("]");
 }
}
class Second extends Thread
{
 String msg;
 First fobj;
 Second (First fp,String str)
 {
 fobj = fp;
 msg = str;
 start();
 }
 public void run()
 {
 fobj.display(msg);
 }
}
public class MyThread
{
 public static void main (String[] args)
 {
 First fnew = new First();
 Second ss = new Second(fnew, "welcome");
 Second ss1= new Second(fnew,"new");
 Second ss2 = new Second(fnew, "programmer");
 }
}
