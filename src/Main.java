import entities.LinkedList2;

public class Main {
    public static void main(String[] args) {
        LinkedList2<String> list = new LinkedList2<>();

        list.addFirst("Estrutura de dados 2");
        list.addFirst("Prog1");
        list.addFirst("Engenharia de Software");

        list.addLast("Anastofo");
        list.addLast("Jubileu");

        list.removeFirst();
        list.removeLast();

        System.out.println("\n");

        for (var s : list) {
            System.out.println(s);
        }

        System.out.println("\nSize of list = " + list.size());
    }
}