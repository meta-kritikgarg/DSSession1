package LinkList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkListTest {

	@Test
	public void testIsEmpty() {
		MyLinkList<Integer> mylink = new MyLinkList<Integer>();
		assertEquals(true, mylink.isEmpty());
		
		mylink.add(2);
		assertNotEquals(true, mylink.isEmpty());

	}

	@Test
	public void testGetSize() {
		MyLinkList<Integer> mylink = new MyLinkList<Integer>();
		assertEquals(0, mylink.getSize());

		mylink.add(2);
		assertEquals(1, mylink.getSize());

	}

	@Test
	public void testInsertAtStart() {
		MyLinkList<Integer> mylink = new MyLinkList<Integer>();
		assertEquals(0, mylink.getSize());
		mylink.add(2);
		mylink.add(4);
		mylink.add(12);
		mylink.add(34);
		
		mylink.insertAtStart(23);
		assertEquals(5, mylink.getSize());

		int x = mylink.getByIndex(3);
		assertEquals(12, x );
		x = mylink.getByIndex(0);
		assertEquals(23, x );


	}

	@Test
	public void testAdd() {
		MyLinkList<Integer> mylink = new MyLinkList<Integer>();
		assertEquals(0, mylink.getSize());
		mylink.add(2);
		mylink.add(4);
		assertEquals(2, mylink.getSize());

	}

	@Test
	public void testInsertAtPos() {
		MyLinkList<Integer> mylink = new MyLinkList<Integer>();
		mylink.add(2);
		mylink.add(4);
		mylink.add(14);
		mylink.add(43);

		mylink.insertAtPos(6, 2);
		assertEquals(5, mylink.getSize());
		int x = mylink.getByIndex(2);
		assertEquals(6, x );
	}

	@Test
	public void testDeleteAtPos() {
		MyLinkList<Integer> mylink = new MyLinkList<Integer>();
		mylink.add(2);
		mylink.add(4);
		mylink.add(14);
		mylink.add(43);
		
		mylink.deleteAtPos(2);
		assertEquals(3, mylink.getSize());

		int x = mylink.getByIndex(2);
		
		assertNotEquals(14, x );
		assertEquals(43, x );
		
	}

}
