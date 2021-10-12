package nadoJava;

public class NadoPrintMethhod {

	public static String[] getMembers() {
		String[] members = { "감자", "당근", "카레" };
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();
		System.out.println(members);
	}
	
}
