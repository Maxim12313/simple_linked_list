import java.util.NoSuchElementException;

public class ListTester1
{
    // Tests addFirst, addLast, getFirst, getLast, and size

    public static void main(String[] args)
    {
        SimpleList<String> mylist = new SimpleLinkedList<String>();

        System.out.println("* new empty list");
        System.out.println("size should be 0: " + mylist.size());

        System.out.println("* addLast cat");
        mylist.addLast("cat");

        System.out.println("size should be 1: " + mylist.size());
        System.out.println("getFirst should be cat: " + mylist.getFirst());
        System.out.println("getLast should be cat: " + mylist.getLast());

        System.out.println("* addFirst dog");
        mylist.addFirst("dog");

        System.out.println("size should be 2: " + mylist.size());
        System.out.println("getFirst should be dog: " + mylist.getFirst());
        System.out.println("getLast should be cat: " + mylist.getLast());

        System.out.println("* addLast fish");
        mylist.addLast("fish");

        System.out.println("size should be 3: " + mylist.size());
        System.out.println("getFirst should be dog: " + mylist.getFirst());
        System.out.println("getLast should be fish: " + mylist.getLast());

        ///////////////////////////////////////////////////////////////////////

        /*SimpleList<String> mylist2 = new SimpleLinkedList<String>();

        System.out.println("*****************************************");
        System.out.println("* new empty list");

        System.out.println("* addFirst bird");
        mylist2.addFirst("bird");

        System.out.println("size should be 1: " + mylist2.size());
        System.out.println("getFirst should be bird: " + mylist2.getFirst());
        System.out.println("getLast should be bird: " + mylist2.getLast());

        System.out.println("* addLast frog");
        mylist2.addLast("frog");

        System.out.println("size should be 2: " + mylist2.size());
        System.out.println("getFirst should be bird: " + mylist2.getFirst());
        System.out.println("getLast should be frog: " + mylist2.getLast());

        System.out.println("* addFirst snake");
        mylist2.addFirst("snake");

        System.out.println("size should be 3: " + mylist2.size());
        System.out.println("getFirst should be snake: " + mylist2.getFirst());
        System.out.println("getLast should be frog: " + mylist2.getLast());*/

        ///////////////////////////////////////////////////////////////////////

        SimpleList<String> mylist3 = new SimpleLinkedList<String>();

        try {
            mylist3.getFirst();
            System.out.println("Whoops, getFirst on an empty list failed to throw a NoSuchElementException");
        }
        catch (NoSuchElementException ex) {
            System.out.println("Great, getFirst on an empty list correctly threw a NoSuchElementException");
        }

        try {
            mylist3.getLast();
            System.out.println("Whoops, getLast on an empty list failed to throw a NoSuchElementException");
        }
        catch (NoSuchElementException ex) {
            System.out.println("Great, getLast on an empty list correctly threw a NoSuchElementException");
        }

    }
}
