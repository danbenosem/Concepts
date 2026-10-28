import java.util.ArrayList;
import java.util.List;

public class CollectionsTask {


    static void main(String[] args) {
//
//        Object [] items = new Object[3];
//
//        items[0]="Ada";
//        items[1]="Tunde";
//        items[2]=42;
//
//        for(int index=0; index<items.length; index++){
//
//            items[index]= (String) items[index];
//        }
//
//        System.out.print(items.length);
//  //      It will show error


 List<String>list= new ArrayList<>(List.of("a","b","c","d"));

 for(String s:list) {

     if (s=="b") {
         list.remove(s);
     }
 }
 System.out.println(list);


    }
}
