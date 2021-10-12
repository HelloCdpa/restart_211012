package nadoJava;

public class NadoWhile {

	public static void main(String[] args) {
		// while (조건 - 언제까지 하겠다) {반복 실행 영역}
		int i = 0; // i는 0부터
		// i의 값이 10보다 작을 때 까지!
		while (i < 10) {
			System.out.println("Happy Coding!" + i);
			i++; // i의 값에 1을 더하고 다시 반복
		}
	}

}
