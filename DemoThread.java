class SampleThread extends Thread 
 {
int tBal = 0;
public void run() 
 {
 synchronized (this)
 {
System.out.println("Thread calculation for total balance");
for (int i = 0; i <= 30; i++) 
 {
tBal = tBal + i;
}
System.out.println("Thread gives notification call"); 
this.notify();
}
}
}
public class DemoThread
{
public static void main(String[] args) throws InterruptedException 
 {
SampleThread st = new SampleThread ();
st.start();
synchronized (st) 
 {
System.out.println("Thread calling wait() Method"); 
st.wait();
System.out.println("Thread got notification"); 
System.out.println("Totol Balance " + st.tBal);
 }
}
}
