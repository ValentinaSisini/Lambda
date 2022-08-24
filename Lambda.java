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
      b = multipli(a, 2);
      stampa(b);

      List<Integer> c;
      c = multipli(a, 3);
      stampa(c);

      List<Integer> d;
      d = quadrati(a);
      stampa(d);
    }

    private static List<Integer> multipli(List<Integer> a, int moltiplicatore) {
      List<Integer> b;
      b = new ArrayList<Integer>();
        for(Integer e:a)
          b.add(e*moltiplicatore);
      return b;
  }

  private static List<Integer> quadrati(List<Integer> a) {
    List<Integer> b;
    b = new ArrayList<Integer>();
      for(Integer e:a)
        b.add(e*e);
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