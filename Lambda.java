import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] argv) {
      List<Integer> a  = new ArrayList<Integer>();
      for(int i=1; i<=5; i++) {
        a.add(i);
      }
      stampa(a);
      
      List<Integer> b;
      b = doppi(a);
      stampa(b);
    }

    private static List<Integer> doppi(List<Integer> a) {
        List<Integer> b;
        b = new ArrayList<Integer>();
          for(Integer e:a)
            b.add(e*2);
        return b;
    }

    public static void stampa(List<Integer> a) {
      for(Integer e: a) {
        System.out.print(e);
        System.out.print(" ");
      }
      System.out.println();
    }
}