package String_SDET;

public class RemoveWhiteSpaccesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String T = "Tanmay CJC Pune QA AutomationEngineer";
		System.out.println(T.length());
		for (int i = 0; i <= T.length(); i++) {
			char Ch = T.charAt(i);
			if (Ch != ' ') {
				System.out.print(Ch);

			} else {
				break;
			}

		}
	}

}