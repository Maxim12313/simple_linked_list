import java.util.NoSuchElementException;

public class ListTester3 {

    // Tests add, get, set, remove

    public static void main(String[] args) {
        SimpleLinkedList<String> mylist = new SimpleLinkedList<String>();

        System.out.println("* add cat at index 0");
        mylist.add(0, "cat");

        System.out.println("size should be 1: " + mylist.size());
        System.out.println("getFirst should be cat: " + mylist.getFirst());
        System.out.println("getLast should be cat: " + mylist.getLast());
        System.out.println("get 0 should be cat: " + mylist.get(0));

        System.out.println("* add dog at index 1");
        mylist.add(1, "dog");

        System.out.println("size should be 2: " + mylist.size());
        System.out.println("getFirst should be cat: " + mylist.getFirst());
        System.out.println("getLast should be dog: " + mylist.getLast());
        System.out.println("get 0 should be cat: " + mylist.get(0));
        System.out.println("get 1 should be dog: " + mylist.get(1));

        System.out.println("* add fish at index 1");
        mylist.add(1, "fish");

        System.out.println("size should be 3: " + mylist.size());
        System.out.println("getFirst should be cat: " + mylist.getFirst());
        System.out.println("getLast should be dog: " + mylist.getLast());
        System.out.println("get 0 should be cat: " + mylist.get(0));
        System.out.println("get 1 should be fish: " + mylist.get(1));
        System.out.println("get 2 should be dog: " + mylist.get(2));

        System.out.println("* set bird at index 2");
        mylist.set(2, "bird");

        System.out.println("size should be 3: " + mylist.size());
        System.out.println("getLast should be bird: " + mylist.getLast());
        System.out.println("get 1 should be fish: " + mylist.get(1));
        System.out.println("get 2 should be bird: " + mylist.get(2));

        System.out.println("* add snake at index 0");
        mylist.add(0, "snake");

        System.out.println("size should be 4: " + mylist.size());
        System.out.println("getFirst should be snake: " + mylist.getFirst());
        System.out.println("getLast should be bird: " + mylist.getLast());
        System.out.println("get 0 should be snake: " + mylist.get(0));
        System.out.println("get 1 should be cat: " + mylist.get(1));
        System.out.println("get 2 should be fish: " + mylist.get(2));
        System.out.println("get 3 should be bird: " + mylist.get(3));

        //mylist.printList();
        System.out.println("* remove cat from index 1");
        mylist.remove(1);

        System.out.println("size should be 3: " + mylist.size());
        System.out.println("getFirst should be snake: " + mylist.getFirst());
        System.out.println("getLast should be bird: " + mylist.getLast());
        System.out.println("get 0 should be snake: " + mylist.get(0));
        System.out.println("get 1 should be fish: " + mylist.get(1));
        System.out.println("get 2 should be bird: " + mylist.get(2));

        System.out.println("* remove bird from index 2");
        mylist.remove(2);

        System.out.println("size should be 2: " + mylist.size());
        System.out.println("getFirst should be snake: " + mylist.getFirst());
        System.out.println("getLast should be fish: " + mylist.getLast());
        System.out.println("get 0 should be snake: " + mylist.get(0));
        System.out.println("get 1 should be fish: " + mylist.get(1));

        System.out.println("* remove snake from index 0");
        mylist.remove(0);

        System.out.println("size should be 1: " + mylist.size());
        System.out.println("getFirst should be fish: " + mylist.getFirst());
        System.out.println("getLast should be fish: " + mylist.getLast());
        System.out.println("get 0 should be fish: " + mylist.get(0));

        System.out.println("* remove fish from index 0");
        mylist.remove(0);

        System.out.println("size should be 0: " + mylist.size());
        System.out.println("isEmpty should be true: " + mylist.isEmpty());

        System.out.println("* add frog");
        mylist.add("frog");

        System.out.println("size should be 1: " + mylist.size());
        System.out.println("getFirst should be frog: " + mylist.getFirst());
        System.out.println("getLast should be frog: " + mylist.getLast());
        System.out.println("get 0 should be frog: " + mylist.get(0));

        System.out.println("* add toad");
        mylist.add("toad");

        System.out.println("size should be 2: " + mylist.size());
        System.out.println("getFirst should be frog: " + mylist.getFirst());
        System.out.println("getLast should be toad: " + mylist.getLast());
        System.out.println("get 0 should be frog: " + mylist.get(0));
        System.out.println("get 1 should be toad: " + mylist.get(1));





        SimpleLinkedList<String> mylist3 = new SimpleLinkedList<String>();
        for (int i=0;i<51;i++){
            mylist3.add(String.valueOf(i));
        }
        //mylist3.printList();
        //System.out.println("///////////////////////////////////////");

        for (int d=0;d<51;d++){
            System.out.println(mylist3.get(d));
        }
        System.out.println("Contains 3 should be true: "+ mylist3.contains("3"));
        System.out.println("Contains 29 should be true: "+ mylist3.contains("29"));
        System.out.println("indexOf 8 should be 8: "+ mylist3.indexOf("8"));
        System.out.println("indexOf 46 should be 46: "+ mylist3.indexOf("46"));

        try {
            mylist.get(2);
            System.out.println("Whoops, get index 2 on a list with two elements failed to throw an IndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Great, get index 2 on a list with two elements correctly threw a IndexOutOfBoundsException");
        }


    }


}
