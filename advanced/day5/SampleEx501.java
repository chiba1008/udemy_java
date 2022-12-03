package advanced.day5;

import java.util.ArrayList;

public class SampleEx501 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("test1", 1, 1));
        al.add(new Student("test2", 1, 2));
        al.add(new Student("test3", 2, 3));
        al.add(new Student("test4", 2, 4));
        al.add(new Student("test5", 3, 5));
        al.remove(3);
        for (int i = 0; i < al.size(); i++) {
            Student s = (Student) al.get(i);
            System.out.println("名前:" + s.getName());
            System.out.println("番号:" + s.getNumber());
            System.out.println("学年:" + s.getGrade());
            System.out.println();
        }

    }
}
