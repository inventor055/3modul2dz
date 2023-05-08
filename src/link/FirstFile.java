package link;
//извините если не правильно понял задание)
public class FirstFile<E> {
    E data;
    FirstFile<E> next;

    FirstFile(E data) {
        this.data = data;
    }
}