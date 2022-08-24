import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] argv) {
      List<Integer> a  = new ArrayList<Integer>();
      for(int i=1; i<=5; i++) {
        a.add(i);
      }
      stampa(a);
      
      List<Integer> b = map(a, Lambda::doppio);
      stampa(b);

      List<Integer> c = map(a, Lambda::triplo);
      stampa(c);

      List<Integer> d = map(a, Lambda::quadrato);
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

    private static<T1,T2> List<T2> map(List<T1> a, Funzione<T1,T2> g) {
      List<T2> b;
      b = new ArrayList<T2>();
        for(T1 e:a)
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