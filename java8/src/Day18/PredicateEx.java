package Day18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
	private static List<Student02> list=Arrays.asList(
			new Student02("ȫ�浿","����",90),
			new Student02("�����","����",90),
			new Student02("���ڹ�","����",95),
			new Student02("���ѳ�","����",92)
			);
	public static double avg(Predicate<Student02> predicate) {
		int count =0, sum=0;
		for(Student02 student:list) {
			if(predicate.test(student)) {
				count++;
				sum+= student.getScore();
			}
		}
		return (double) sum/count;
	}
	
	public static void main(String[]args) {
		double maleAvg =avg(t-> t.getSex().equals("����"));
		System.out.println("���� ��� ����:"+maleAvg);
		
		double femaleAvg=avg(t-> t.getSex().equals("����"));
		System.out.println("���� ��� ����:"+femaleAvg);
	}
}
