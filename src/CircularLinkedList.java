public class CircularLinkedList {
    private Node start = null;
    private Node current = null;

    CircularLinkedList(){};
    public void Insert(int data){
        if(this.start == null){
              start = new Node(data);
              start.next = start;
              current = start;
        }else{
            Node temp = new Node(data);
            temp.next = start;
            current.next = temp;
            current  = temp;
        }
    }

    private void reset(){
        start = null;
        current = null;
    }
    public int Remove(){
        Node temp;
        if(start == null){
            System.out.println("Nothing found to remove ");
            throw new RuntimeException("Nothing to remove in list");
        }
        if (start.next == start) {
            temp = start;
            this.reset();
            return temp.getNode();
        }
            temp = start;
            start = start.next;
            current.next = start;
            return temp.getNode();
    }

    public void display(){
        if(start == null){
            return;
        }
        Node temp = start;
        do{
            System.out.println(temp.getNode());
            temp = temp.next;
        }while(temp != start);
    }
}
