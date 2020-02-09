package String_SDET;

public class NumberOFWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "Avenger the end game is in cinema";
		int count = 0;
		String[] split = S.split(" ");
		for (int i = 0; i < split.length; i++) {
			count++;

		}
		System.out.println(count);

	}

}
