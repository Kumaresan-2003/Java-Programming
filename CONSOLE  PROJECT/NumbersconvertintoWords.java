public class NumbersconvertintoWords {
	public static void convertstr(String str) {
		String[] singledigit = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine" };
		String[] twodigit = new String[] { "ten", "Eleven", "twleve", "thirteen", "Fourteen", "fifteen", "sixteen",
				"seventeen", "Eighteen", "nineteen" };
		String[] tensmultiple = new String[] { "", "", "Twenty", "thirty", "fourty", "fifty", "Sixty", "Seventy",
				"eighty", "ninty" };
		String[] tenspower = new String[] { "hundered", "thousnad" };
		if (str.length() == 0) {
			System.out.println("");
			System.out.println("HI");
			return;
		} else if (str.length() == 1) {
			System.out.println(str.charAt(0) - '0');
			return;
		}
		int len = str.length();
		for (int i = 0; i < str.length(); i++) {
			if (len > 2) {
				if (str.charAt(i) - '0' != 0) {
					System.out.print(singledigit[str.charAt(i) - '0'] + " ");
					System.out.print(tenspower[len - 3] + " ");

				}
				len--;
			} else {
				if (str.charAt(i) - '0' == 1) {
					System.out.print(twodigit[str.charAt(i + 1) - '0'] + "");
					return;
				} else if (str.charAt(i) - '0' != 0) {
					System.out.print(tensmultiple[str.charAt(i) - '0'] + " ");
					if (str.charAt(i + 1) - '0' != 0)
						System.out.print(singledigit[str.charAt(i + 1) - '0']);
					return;

				}
			}
		}
	}

	public static void main(String[] args) {
		String str = "90";
		convertstr(str);
	}
}
