package workingwithanarraylist;

//import java.util.*;
import java.util.ArrayList;

public class WorkingWithAnArrayList {

    public static void main(String[] args) {
        System.out.println("Ch. 10 Array Lists by Kevin Bell");
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Kevin Bell");
        stringList.add("chess");
        stringList.add("eating and/or sleeping");
        stringList.set(1, "enjoys");
        stringList.add("Easter and/or Christmas");
        stringList.remove(3);
        stringList.add("February");
        stringList.set(2, "programming");
        stringList.set(0, stringList.get(0).toUpperCase());
        //stringList.remove(3);
        stringList.remove(stringList.size() - 1);
        System.out.println(stringList);
    }
}
