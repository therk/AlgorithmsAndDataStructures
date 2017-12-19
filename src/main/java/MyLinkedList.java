public class MyLinkedList<Item> {

  private Node<Item> currentNode = new Node<Item>();
  private Node<Item> headNode = currentNode;

  public boolean hasNext() {
    return (headNode.next != null);
  }

  public void setItem(Item item) {
    currentNode.item = item;
  }

  public Item getItem() {
    return currentNode.item;
  }

  public void add(Item item) {
    currentNode.next = new Node<>();
    currentNode.next.item = item;
    currentNode = currentNode.next;
  }

  public Item getNext() {
    if(hasNext()) {
      headNode = headNode.next;
      return headNode.item;
    }
    return null;
  }
}