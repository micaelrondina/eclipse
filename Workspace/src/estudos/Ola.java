package estudos;

public class Ola {
	public static void main(String args[]) {
		System.out.println("Ola");
		int n1[] = new int[3];
		n1[0] = 3;
		n1[1] = 2;
		n1[2] = 3;

		for (int aux : n1) {
			System.out.println(aux);
			System.out.println("ISSO ae");
		}
	}
}
