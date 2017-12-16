public class MyLinkedList<Item> {

  private Node<Item> node = new Node<Item>();

  boolean hasNext() {
    return node.next == null;
  }

  void setItem(Item item) {
    node.item = item;
  }

  void addNext(Item item) {
    Node<Item> oldNode = node;
    node = new Node<>();
    node.item = item;
    node.next = oldNode;
  }

  Node getNext() {
    return node.next;
  }
}