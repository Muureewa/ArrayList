import java.util.ArrayList;
import java.util.Arrays;

// Name: Murad Mohammed
// Date: 03/04/2023
// Project: ArrayList


public class Main {
  public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
    removeShorterOfTwo(list1);
    System.out.println(list1);

    ArrayList<String> list2 = new ArrayList<>(Arrays.asList("how", "are", "you?"));
    duplicate(list2, 4);
     System.out.println(list2); // [how, how, how, how, are, are, are, are, you?, you?, you?, you?]

    ArrayList<String> list3 = new ArrayList<>(Arrays.asList("hello", "world"));
    duplicate(list3, 0);
    System.out.println(list3);
    }


  public static void removeShorterOfTwo(ArrayList<String> list) {
    for (int i = 0; i < list.size() - 1; i += 2) {
      String one = list.get(i);
      String two = list.get(i + 1);
      if (one.length() <= two.length()) {
        list.remove(i);
      } else {
        list.remove(i + 1);
      }
    }
    if (list.size() % 2 == 1) {
      list.remove(list.size() - 1);
    }
  }

  public static void duplicate(ArrayList<String> list, int m) {
    if (m <= 0) {
      list.clear();
      return;
    }
    int originalSize = list.size();
    for (int i = 0; i < originalSize; i++) {
      String string = list.get(i);
      for (int k = 0; k < m - 1; k++) {
        list.add(i + 1, string);
      }
      i += m - 1;
    }
  }
  
  

}
