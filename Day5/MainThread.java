package Day5;

class MainThread
{
     public static void main(String[] args)
     {
          try
          {
            MultiThreadFib G1 = new MultiThreadFib();
               G1.start();
               try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            MultiThreadFib G2 = new MultiThreadFib();
            G2.start();
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
