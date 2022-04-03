import java.io.ObjectStreamException;
import java.util.*;

public class main_class {
    public static void main(String[] args) {
        Map obj =new HashMap();
        obj.put("name","Alireza");
        obj.put("studentId",400186);
        obj.put("avg",19.25);
        Set set =obj.keySet();
        for(Object o:set){
            System.out.print(o+":");;
            System.out.println(obj.get(o));
       }
        
    }
}