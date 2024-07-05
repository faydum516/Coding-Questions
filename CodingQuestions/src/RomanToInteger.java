public class RomanToInteger {
	
	static int romanToInt(String s) {
		int num = 0, prev_val = 0;
        String[] strArr = s.split("");

        for (int i = 0; i < strArr.length; i++) {
            switch(strArr[i]) {
                case "M":
                    num += 1000;
                    if (prev_val < 1000) {
                        num -= 2 * prev_val;
                    }
                    prev_val = 1000;
                    break;
                case "D":
                    num += 500;
                    if (prev_val < 500) {
                        num -= 2 * prev_val;
                    }
                    prev_val = 500;
                    break;   
                case "C":
                    num += 100;
                    if (prev_val < 100) {
                        num -= 2 * prev_val;
                    }
                    prev_val = 100;
                    break;
                case "L":
                    num += 50;
                    if (prev_val < 50) {
                        num -= 2 * prev_val;
                    }
                    prev_val = 50;
                    break;
                case "X":
                    num += 10;
                    if (prev_val < 10) {
                        num -= 2 * prev_val;
                    }
                    prev_val = 10;
                    break;
                case "V":
                    num += 5;
                    if (prev_val < 5) {
                        num -= 2 * prev_val;
                    }
                    prev_val = 5;
                    break;
                case "I":
                    num += 1;
                    prev_val = 1;
                    break;
            }
        }

        return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("XCVII"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}

}
