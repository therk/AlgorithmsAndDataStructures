import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
  MyLinkedList<Object> linkedList;

  @Before
  public void init() {
    linkedList = new MyLinkedList<>();
  }

  @Test
  public void hasNextNullTest() {
    assertEquals(false, linkedList.hasNext());
  }

  @Test
  public void hasNextAfterAddTest() {
    linkedList.add(new Object());
    assertEquals(true, linkedList.hasNext());
  }
  @Test
  public void getNextAfterAddTest() {
    linkedList.setItem("test1");
    assertEquals("test1", linkedList.getItem());
    linkedList.add("test2");

    assertEquals("test2", (String) linkedList.getNext());
  }
}
