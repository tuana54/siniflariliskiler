package sınıflarİlişkiler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student("tuana","dayanç","123","istanbul",85);
		Student st2=new Student("evren","dayanç","789","izmit",110);
		Student st3=new Student("yagiz","efe","952","sakarya",50);
		//System.out.println(st2.getNote());
		
		Instructor teacher=new Instructor("mustafa","sarı","mat");
		Course mat=new Course("mat101","mat",teacher);
		System.out.println(mat.getInstructor().getName());
		//Student[] stu= {st1,st2,st3};
		//System.out.println("ortalama: "+mat.ort(stu));
	}

}
