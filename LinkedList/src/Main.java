package LinkedList.src;

import java.util.LinkedList;
import LinkedList.src.entities.*;

public class Main {
    public static void main(String[] args) {
        LinkedList2<String> list = new LinkedList2<>();
        list.addFirst("lalalalallalal alallalalla");
        list.addFirst("lelelellel lelellelel");

        for (var s : list) {
            System.out.println(s);
        }

        System.out.println(list);
    }
}