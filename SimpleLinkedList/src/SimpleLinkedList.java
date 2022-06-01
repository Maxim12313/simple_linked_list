//Maxim Kim

import java.util.NoSuchElementException;

public class SimpleLinkedList<ElementType> implements SimpleList<ElementType> {
    private ListNode<ElementType> head = null;
    private ListNode<ElementType> tail = null;
    private int lastIndex = -1;

    //returns size
    //O(1)
    public int size() {
        return lastIndex + 1;
    }

    //returns first element of the list
    //O(1)
    public ElementType getFirst() {
        if (head == null)
            throw new NoSuchElementException("List is Empty");
        return head.data;
    }

    //returns last element of the list
    //O(1)
    public ElementType getLast() {
        if (head == null)
            throw new NoSuchElementException("List is Empty");
        return tail.data;
    }

    //adds the element to the beginning of the list
    //O(1)
    public void addFirst(ElementType thing) {
        ListNode<ElementType> newNode = new ListNode<>(thing, head, null);
        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
        lastIndex++;
    }

    //adds the element to the end of the list
    //O(1)
    public void addLast(ElementType thing) {
        ListNode<ElementType> newNode = new ListNode<>(thing, null, tail);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        lastIndex++;
    }

    //removes first element of list and returns removed element
    //O(1)
    public ElementType removeFirst() {
        if (head == null)
            throw new NoSuchElementException("List is Empty");
        ElementType oldElement = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head.next.prev=null;
            head = head.next;
        }
        lastIndex--;
        return oldElement;
    }

    //removes last element of list and returns removed element
    //O(1)
    public ElementType removeLast() {
        if (tail == null)
            throw new NoSuchElementException("List is Empty");
        ElementType oldElement = tail.data;
        if (tail == head) {
            head = null;
            tail = null;
        } else {
            tail.prev.next=null;
            tail = tail.prev;
        }
        lastIndex--;
        return oldElement;
    }

    //clears the list
    //O(1)
    public void clear() {
        head = null;
        tail = null;
        lastIndex = -1;
    }

    //checks if empty
    //O(1)
    public boolean isEmpty() {
        return lastIndex == -1;
    }

    //adds the element to the end of the list, always returns true
    //O(1)
    public boolean add(ElementType thing) {
        addLast(thing);
        return true;
    }

    //Inserts the specified element at the specified position in this list
    //Shifts the element currently at that position (if any) and any subsequent elements to the right
    //O(1) when index is 0 or last index+1, O(N) otherwise
    public void add(int index, ElementType thing) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException("Index out of Bounds");
        if (index == 0) //if empty or index is 0
            addFirst(thing);
        else if (index == size()) //if index is for the end of the list
            addLast(thing);
        else { //if index is the same as an existing node and must shift
            ListNode<ElementType> node = getNode(index);
            ListNode<ElementType> newNode = new ListNode<>(thing,node,node.prev);
            node.prev.next = newNode;
            node.prev = newNode;
            lastIndex++;

        }
    }

    //returns element at index
    //O(N)
    public ElementType get(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Index out of Bounds");
        return getNode(index).data;
    }

    //sets element at index to thing, returns old element
    //O(N)
    public ElementType set(int index, ElementType thing) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Index out of Bounds");
        ElementType oldElement = getNode(index).data;
        getNode(index).data = thing;
        return oldElement;
    }

    //removes element at index, shifts any subsequent elements to the left
    //O(1) when first or last index, O(N) otherwise
    public ElementType remove(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Index out of Bounds");
        ElementType oldElement = getNode(index).data;
        if (index==lastIndex) //if last node
            removeLast();
        else if (index==0) //if first node
            removeFirst();
        else { //if any other node and must shift
            ListNode<ElementType> node=getNode(index);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            lastIndex--;
        }
        return oldElement;
    }

    //Returns the index of the first occurrence of the specified element in this list,
    //or -1 if this list does not contain the element.
    //O(N)
    public int indexOf(ElementType thing) {
        ListNode<ElementType> currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data.equals(thing))
                return index;
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    //returns true if given element is in list
    //O(N)
    public boolean contains(ElementType thing) {
        return indexOf(thing)!=-1;
    }

    //returns node at given index
    //O(N)
    private ListNode<ElementType> getNode(int index) {
        ListNode<ElementType> currentNode = null;
        if (head != null) {
            if (index <= lastIndex / 2) { //if closer to head
                currentNode = head;
                for (int i = 0; i < index; i++) { //go forward from head
                    currentNode = currentNode.next;
                }
            } else { //if closer to tail
                currentNode = tail;
                for (int i = lastIndex; i > index; i--) { //go backwards from tail
                    currentNode = currentNode.prev;
                }
            }
        }
        return currentNode;
    }

    //prints data of whole list
    //O(N)
    public void printList() {
        ListNode<ElementType> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}

