interface SimpleList<ElementType>
{
    // This is based on the java.util.List interface and the java.util.LinkedList class.
    // For documentation of these methods,
    //    see https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/LinkedList.html

    public int size();

    public ElementType getFirst();
    public ElementType getLast();
    public void addFirst(ElementType thing);
    public void addLast(ElementType thing);

    public ElementType removeFirst();
    public ElementType removeLast();

    public void clear();
    public boolean isEmpty();

    public boolean add(ElementType thing);
    public void add(int index, ElementType thing);
    public ElementType get(int index);
    public ElementType set(int index, ElementType thing);
    public ElementType remove(int index);

    public int indexOf(ElementType thing);
    public boolean contains(ElementType thing);
}
