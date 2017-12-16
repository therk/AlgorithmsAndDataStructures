import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LinkedListStackTest {

  MyStack<String> ss;

  @Before
  public void setUp() {
    ss = new LinkedListStack<>();
  }

  @Test
  public void push() {
    ss.push("Test");
    ss.push(null);
  }

  @Test
  public void pop() {
    ss.push("Test");
    assertEquals("Test", ss.pop());
  }

  @Test
  public void isEmpty() {
    assertEquals(true, ss.isEmpty());
    ss.push("Test");
    assertEquals(false, ss.isEmpty());
  }

}