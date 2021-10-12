package nadoJava;

public class NadoArray {

	public static void main(String[] args) {
//		String [] name = {"혜린","감자","당근"};
//		System.out.println(name[2]);
//		//index : 0부터 시작 element 인덱스 안의 요소 length 길이
		//새로운 문자배열을 만듦
		String [] classGroup = new String[2]; //0,1,2,3까지의 길이로 만들것
		classGroup[0] = "혜린";
		System.out.println(classGroup.length);//몇 개의 값이 담겨질수 있을까?
		classGroup[1] = "땅땅근";
		System.out.println(classGroup[1]);
	}

}
