package U1.IntentoExamen;
import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        Deque<Student> stackStudent = new ArrayDeque<>();

        Student s1 = new Student(1,"as4d","a5sd");
        Student s2 = new Student(2,"asd2","as3d");
        Student s3 = new Student(3,"as1d","as1d");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);
        Utils utils = new Utils(students);
        List<Student> reverse = utils.reverseList(students);
        System.out.println("reverse U1.list"+ reverse);
        System.out.println("------queue------");
        Queue<Student> queueStudents = new LinkedList<>(reverse);
        while(!queueStudents.isEmpty()){
            System.out.println("Estudiante atendido"+queueStudents.peek());
            queueStudents.poll();
            if(!queueStudents.isEmpty()){
                System.out.println("Siguiente estudiante en ser atendido"+queueStudents.peek());
                stackStudent.push(queueStudents.peek());
            }else {
                System.out.println("ya no hay nadie en la fila");
            }
        }
        System.out.println("------stack------");
        System.out.println("top en stock "+stackStudent.peek());

    }
}
