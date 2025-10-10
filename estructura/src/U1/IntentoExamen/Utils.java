package U1.IntentoExamen;
import java.util.ArrayList;
import java.util.List;
public class Utils {
    public List<Student> reverse = new ArrayList<>();
    List<Student> studentList;

    public Utils(List<Student> studentList){
        this.studentList=studentList;
    }

    public List<Student> reverseList(List<Student> list){
        if(list.size()<=0){
            return reverse;
        }
        reverse.add(list.get(list.size()-1));
        return reverseList(list.subList(0,list.size()-1));
    }
}
