package DoublyLinkList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyDoublyLinkListTest {

	@Test
	public void testGetSize() {
		MyDoublyLinkList<Integer> doublyLinkList = new MyDoublyLinkList<Integer>();
		doublyLinkList.add(2);
		doublyLinkList.add(44);
		doublyLinkList.add(23);
		doublyLinkList.add(56);
		assertEquals(4, doublyLinkList.size);
	}

	@Test
	public void testIsEmpty() {
		MyDoublyLinkList<Integer> doublyLinkList = new MyDoublyLinkList<Integer>();
		assertEquals(true, doublyLinkList.isEmpty());
	}

	@Test
	public void testAdd() {
		MyDoublyLinkList<Integer> doublyLinkList = new MyDoublyLinkList<Integer>();
		doublyLinkList.add(2);
		doublyLinkList.add(44);
		doublyLinkList.add(23);
		int x = doublyLinkList.getByIndex(2);
		assertEquals(23, x);
		x = doublyLinkList.getByIndex(1);
		assertEquals(44, x);
	}

	@Test
	public void testInsertAtStart() {
		MyDoublyLinkList<Integer> doublyLinkList = new MyDoublyLinkList<Integer>();
		doublyLinkList.add(2);
		doublyLinkList.add(44);
		doublyLinkList.add(23);
		doublyLinkList.insertAtStart(41);
		int x = doublyLinkList.getByIndex(0);
		assertEquals(41, x);
	}

	@Test
	public void testInsertAtPos() {
		MyDoublyLinkList<Integer> doublyLinkList = new MyDoublyLinkList<Integer>();
		doublyLinkList.add(2);
		doublyLinkList.add(44);
		doublyLinkList.add(23);
		doublyLinkList.insertAtPos(49, 1);
		int x = doublyLinkList.getByIndex(1);
		assertEquals(49, x);
	}

	@Test
	public void testDeleteAtPos() {
		MyDoublyLinkList<Integer> doublyLinkList = new MyDoublyLinkList<Integer>();
		doublyLinkList.add(2);
		doublyLinkList.add(44);
		doublyLinkList.add(23);
		doublyLinkList.deleteAtPos(1);
		int x = doublyLinkList.getByIndex(1);
		assertEquals(23, x);
		assertEquals(2, doublyLinkList.size);
	}

	@Test
	public void testDelete() {
		MyDoublyLinkList<Integer> doublyLinkList = new MyDoublyLinkList<Integer>();
		doublyLinkList.add(2);
		doublyLinkList.add(44);
		doublyLinkList.add(23);
		doublyLinkList.add(46);
		doublyLinkList.add(74);
		doublyLinkList.delete(23);
		int x = doublyLinkList.getByIndex(2);
		assertNotEquals(23, x);
		
		assertEquals(46, x);
	}

	@Test
	public void testGetByIndex() {
		MyDoublyLinkList<Integer> doublyLinkList = new MyDoublyLinkList<Integer>();
		doublyLinkList.add(2);
		doublyLinkList.add(44);
		doublyLinkList.add(23);
		doublyLinkList.deleteAtPos(1);
		int x = doublyLinkList.getByIndex(1);
		assertEquals(23, x);
	}

}
