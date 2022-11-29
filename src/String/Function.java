package String;

public class Function {

   public static char task1(String string1, int index) {
      return string1.charAt(index);
   }

   public static void task2(String string1) {

       for(int i = 0; i < string1.length(); i++) {
           System.out.println(string1.charAt(i));
       }
   }

    public static String task3(String string1, String string2) {
        if(string1.length() > string2.length()) {

            return string1;
        }else{

            return string2;
        }
   }

    public static String task4(String string1, String string2) {

       return string1 + string2;
   }

    public static boolean task5(String string1, char searchValue) {
      for(int i = 0; i < string1.length(); i++) {
          if(searchValue == string1.charAt(i)) {
              return true;
          }
       }

        return false;
    }

    public static String task6(String string1) {
       String string2 = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
        string2 += string1.charAt(i);
        }
        return string2;
    }

    public static String task7(String string1) {

        int lastIndex = string1.length() - 1;
        char lastSymbol = string1.charAt(lastIndex);
        if(lastSymbol != '.') {

            return string1 + '.';
        } else {
            return string1;
        }
    }

    public static String task8(String string1) {
       String string2 = "";
       for(int i = 0; i < string1.length(); i++) {
           string2 += string1.charAt(i) + "_";
       }

       return string2;
    }
}
