public class Main {
    public static void main(String[] args) {
        System.out.println("Singly circular linked list");
        CircularLinkedList cl = new CircularLinkedList();
        cl.Insert(1);
        cl.Insert(2);
        cl.Insert(3);
        cl.Insert(4);
        cl.Insert(5);

        cl.display();

        //Remove the top element from the list
        try {
            System.out.println("Removed element  : " + cl.Remove());
            System.out.println("Removed element  : " + cl.Remove());
            System.out.println("Removed element  : " + cl.Remove());
            System.out.println("Removed element  : " + cl.Remove());
            System.out.println("Removed element  : " + cl.Remove());
            System.out.println("Removed element  : " + cl.Remove());
        }catch (RuntimeException err){
            System.out.println(err);
        }
        cl.display();
    }
}