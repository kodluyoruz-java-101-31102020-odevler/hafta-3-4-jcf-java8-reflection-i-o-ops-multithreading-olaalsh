package Q3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Application {
public static void main(String[] args) {
		
		System.out.print("Öğrenci Numaranızı Giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String studentNo = scanner.next();
		System.out.print("Adınızı Giriniz: ");
		String studentName = scanner.next();
		System.out.print("Soyadınızı Giriniz: ");
		String studentSurname = scanner.next();
		System.out.print("Yaşınızı Giriniz: ");
		String studentAge = scanner.next();
		System.out.print("Bölümünüzü Giriniz: ");
		String studentSection = scanner.next();
		
		
		Map<String, List<Student>> studentLessonMap = new HashMap<String, List<Student>>();
	
		
		System.out.println(studentLessonMap);

}
}
