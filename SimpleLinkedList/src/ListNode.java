//Maxim Kim
public class ListNode<ElementType> {
    ElementType data;
    ListNode<ElementType> next;
    ListNode<ElementType> prev;

    ListNode(ElementType data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    ListNode(ElementType data, ListNode<ElementType> next, ListNode<ElementType> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
