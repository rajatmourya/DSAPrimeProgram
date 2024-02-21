package Framework.CollectionInterface.SetInterface;

import java.util.*;


class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class learnSets {
    public static void main(String[] args) {
//        Set<Integer> s = new HashSet<>(); //0(1)
//        Set<Integer> s = new LinkedHashSet<>();  //0(n)
        Set<Integer> s = new TreeSet<>();  //0(logn)
        s.add(10);
        s.add(10);
        s.add(10);
        s.add(20);
        s.add(50);
        s.add(30);
        s.add(40);
        System.out.println(s);

        s.remove(20);
        System.out.println(s.contains(10));
        System.out.println(s);

//        String type set
        Set<String> set = new HashSet<>();
        set.add("Anuj");
        set.add("Ram");
        set.add("Rajat");
        set.add("Ram");
        set.add("Rajesh");
        System.out.println(set);

//        Generics type set
        Set<Student> stu = new HashSet<>();

        stu.add(new Student(1,"Rajat"));
        stu.add(new Student(2,"Ram"));
        stu.add(new Student(1,"Rajat"));
        stu.add(new Student(3,"Rohit"));
        stu.add(new Student(4,"Rajat"));
        stu.add(new Student(1,"Rajat"));
        stu.add(new Student(6,"Nakul"));
        System.out.println(stu);

        Student s1 = new Student(1,"Ram");
        Student s2 = new Student(1,"Ram");
        System.out.println(s1.equals(s2));

    }
}
