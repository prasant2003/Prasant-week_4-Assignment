package Assignment4;

public class StudentManager {
   private Student[] students=new Student[10];
   private int p=0;
   public void add(Student s) {
	   if(p>=students.length) {
		   increaseArraysize();
	   }
	   students[p++]=s;
   }
   public void add(int index,Student s) {
	   if(index<=-1 || index>=size()) {
		   throw new IndexOutOfBoundsException();
	   }
	   if(p>=students.length)increaseArraysize();
	   for(int i=size();i>index;i--) {
		   students[i+1]=students[i];
	   }
	   students[index]=s;
	   p++;
   }
   public void remove(int index) {
	   if(index<=-1 || index>=size()) {
		   throw new IndexOutOfBoundsException();
	   }
	   for(int i=index;i<size()-1;i++) {
		   students[i-1]=students[i];
	   }
	   --p;
	   students[p]=null;
   }
   public Student display(int index) {
	   if(index<=-1 || index>=students.length) {
		   throw new IndexOutOfBoundsException();
	   }
	   return students[index];
   }
   public void increaseArraysize() {
	   Student[] temp=new Student[students.length+3];
	   System.arraycopy(students, 0, temp, 0, students.length);
   }
   public int size() {
	   return p;
   }
   public static void main(String[] args) {
	StudentManager s1=new StudentManager();
	s1.add(new Student("Prasant", 1));
	s1.add(new Student("Trilochan", 2));
	s1.add(new Student("PK", 3));
	for(int i=0;i<s1.size();i++) {
		System.out.println(s1.display(i));
	}
	s1.add(2, new Student("Tim David", 15));
	System.out.println("After inserting tim David into student list");
	
	for(int i=0;i<s1.size();i++) {
		System.out.println(s1.display(i));
	}
	
	
	s1.remove(1);
	System.out.println("After removing index number 2");
	for(int i=0;i<s1.size();i++) {
		System.out.println(s1.display(i));
	}
}   
   
}

