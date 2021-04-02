package biFunctional;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaComparatorEg1{
		
		public static void main(String[] args) {
			
			ArrayList<Student> obj = new ArrayList<Student>();
			obj.add(new Student(2,"Vizhal",85f));
			obj.add(new Student(1,"Sara",98f));
			obj.add(new Student(4,"Deepz",70f));
			obj.add(new Student(3,"Shila",65f));
			
			System.out.println("Sorting Based on Name");
			Collections.sort(obj,(n1,n2)->{
			return n1.StuName.compareTo(n2.StuName);	
			});
			
			for(Student s : obj) {
				System.out.println(s.StuID+ " "+s.StuName+ " "+s.StuMarks);
			}
			
			System.out.println("Sorting Based on Marks");
			Collections.sort(obj,(m1,m2)->{
				return m1.StuMarks.compareTo(m2.StuMarks);	
				});
			
			obj.forEach(
					(N)->System.out.println(N.StuID+" "+N.StuName+" "+N.StuMarks)
					);
			
			System.out.println("Sorting Based on ID");
			Collections.sort(obj,(i1,i2)->{
				return i1.StuID.compareTo(i2.StuID);
			});
			
			obj.forEach(
					(I)->System.out.println(I.StuID+" "+I.StuName+" "+I.StuMarks)
					);
			
	}}
		
	class Student{
		Integer StuID;
		String StuName;
		Float StuMarks;
		
		public Student(int stuID, String stuName, float stuMarks) {
			super();
			StuID = stuID;
			StuName = stuName;
			StuMarks = stuMarks;
	}
	}



