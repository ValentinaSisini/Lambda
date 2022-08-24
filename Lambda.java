import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] argv) {
      List<Integer> a  = new ArrayList<Integer>();
      for(int i=1; i<=5; i++) {
        a.add(i);
      }
      stampa(a);
      
      List<Integer> b = f(a, Lambda::doppio);
      stampa(b);

      List<Integer> c = f(a, Lambda::triplo);
      stampa(c);

      List<Integer> d = f(a, Lambda::quadrato);
      stampa(d);
    }

    static Integer doppio(Integer n) {
      return 2*n;
    }

    static Integer triplo(Integer n) {
      return 3*n;
    }

    static Integer quadrato(Integer n) {
      return n*n;
    }

    private static List<Integer> f(List<Integer> a, Funzione g) {
      List<Integer> b;
      b = new ArrayList<Integer>();
        for(Integer e:a)
          b.add(g.applica(e));
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