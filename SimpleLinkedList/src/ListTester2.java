public class ListTester2 {

    // Tests removeFirst, removeLast, clear, isEmpty
    // uses addFirst, addLast, getFirst, getLast, and size

    public static void main(String[] args) {
        SimpleList<String> mylist = new SimpleLinkedList<String>();

        System.out.println("* new empty list");
        System.out.println("isEmpty should be true: " + mylist.isEmpty());

        System.out.println("* addLast cat");
        mylist.addLast("cat");

        System.out.println("isEmpty should be false: " + mylist.isEmpty());

        System.out.println("* addLast dog");
        mylist.addLast("dog");

        System.out.println("* addLast fish");
        mylist.addLast("fish");

        System.out.println("size should be 3: " + mylist.size());
        System.out.println("getFirst should be cat: " + mylist.getFirst());
        System.out.println("getLast should be fish: " + mylist.getLast());

        System.out.println("* removeFirst");
        mylist.removeFirst();

        System.out.println("size should be 2: " + mylist.size());
        System.out.println("getFirst should be dog: " + mylist.getFirst());
        System.out.println("getLast should be fish: " + mylist.getLast());

        System.out.println("* removeLast");
        mylist.removeLast();

        System.out.println("size should be 1: " + mylist.size());
        System.out.println("getFirst should be dog: " + mylist.getFirst());
        System.out.println("getLast should be dog: " + mylist.getLast());

        System.out.println("* removeFirst");
        mylist.removeFirst();

        System.out.println("size should be 0: " + mylist.size());
        System.out.println("isEmpty should be true: " + mylist.isEmpty());

        System.out.println("* addFirst bird");
        mylist.addFirst("bird");

        System.out.println("* removeLast");
        mylist.removeLast();

        System.out.println("size should be 0: " + mylist.size());
        System.out.println("isEmpty should be true: " + mylist.isEmpty());

        System.out.println("* addLast frog");
        mylist.addLast("frog");

        System.out.println("* addLast snake");
        mylist.addLast("snake");

        System.out.println("size should be 2: " + mylist.size());
        System.out.println("isEmpty should be false: " + mylist.isEmpty());

        System.out.println("* clear");
        mylist.clear();

        System.out.println("size should be 0: " + mylist.size());
        System.out.println("isEmpty should be true: " + mylist.isEmpty());

        System.out.println("* addLast toad");
        mylist.addLast("toad");

        System.out.println("isEmpty should be false: " + mylist.isEmpty());
        System.out.println("size should be 1: " + mylist.size());
        System.out.println("getFirst should be toad: " + mylist.getFirst());
        System.out.println("getLast should be toad: " + mylist.getLast());
    }
}
