
public class LineComparison{

  static double length(int x1,int x2,int y1,int y2) {
    double dis = (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
   return dis;
  }

  public static void main(String[] args) {
   int x1 = 0,y1 = 0;
   int x2 = 2,y2 = 2;

   int p1 = 0,q1 = 0;
   int p2 = 2,q2 = 2;

   double l1 = length(x1,y1,x2,y2);
   double l2 =  length(p1,q1,p2,q2);
   System.out.println(l1);
   System.out.println(l2);

   if(String.valueOf(l1).equals(String.valueOf(l2)))
   System.out.println("l1 and l2 are Equals");
   else
   System.out.println("l1 and l2 are Not Equals");
  }
}
