import java.util.HashMap;
import java.util.Map;

public class Romanian {
       private  static HashMap<String, Integer> romanLine = new HashMap<String, Integer>() {

        static {
            romanLine.put("I", 1);
            romanLine.put("IV", 4);
            romanLine.put("V", 5);
            romanLine.put("IX", 9);
            romanLine.put("X", 10);
            romanLine.put("XL", 40);
            romanLine.put("L", 50);
            romanLine.put("XC", 90);
            romanLine.put("C", 100);

        }

    };
    public static int getArabianValue(String key) {
        return (int) romanLine.get(key);
    }
/*
   public static int romanToInt(String s){
       int result = 0;
       int sBefore = 0;

        for (int i = s.length(); i >= 0 ; i--) {
            int current = romanLine.get(s);
            if (current < sBefore) {
                result -= current;
            }else {
                result += current;
            }
            sBefore = current;
        }
        return result;
    }
*/

/*  СУПЕР РЕШЕНИЕ
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
    */


/*  КОНВЕРТЕР ИЗ АРАБСКИХ В РИМСКИЕ

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
}
*/