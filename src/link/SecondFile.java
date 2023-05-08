package link;

public class SecondFile<E> {
    FirstFile<E> first;
    int size = 0;

    public SecondFile() {
        first = null;
    }

    public void InsertFirst(E data) {
        FirstFile<E> newNode = new FirstFile<>(data);
        newNode.next = first;
        first = newNode;
        size++;
    }

    public void DeleteFirst() {
        first = first.next;
        size--;
    }

    void InsertLast(E data) {
        if (first == null) {
            InsertFirst(data);
        } else {
            FirstFile<E> current = first;
            while (current.next != null) {
                current = current.next;
            }
            FirstFile<E> newNode = new FirstFile<>(data);
            current.next = newNode;
            size++;
        }
    }

    void DeleteAfter(FirstFile<E> after) {
        FirstFile<E> current = first;
        while (current.data != after.data) {
            current = current.next;
