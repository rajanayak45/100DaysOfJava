package day5_Practice;

//write your own class(e.g, Mobile, Student)
public class Practice {
		String Mobile;
		String Student;
		
		void study() {
			System.out.println(Student+" check his result on "+Mobile);
		}
		
	public static void main(String[] args) {
		Practice p=new Practice();
		
		p.Mobile="Oppo a9 2020";
		p.Student="Raja";
		
		p.study();
	}

}
