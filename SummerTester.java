public class SummerTester
{
  public static void main(String[] args)
  {
    Summer default = new Summer();
    System.out.println( default.getSum() );

    default.add(9);
    System.out.println( default.getSum() );

    //Summer s = new Summer(5);
    
    //s.add(3);
    //s.add(7);

    //System.out.println( default.getSum() );
    
    //System.out.println( s.toString() );
  }
}