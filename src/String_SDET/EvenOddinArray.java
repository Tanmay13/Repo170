package String_SDET;

public class EvenOddinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 12, 43, 56, 76, 54, 53 };
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				System.out.println("Number is Even");

			} else {

				System.out.println(a[i]);
				System.out.println("Number is odd");
			}

		}

	}

}
