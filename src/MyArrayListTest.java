import static org.junit.Assert.*;

import org.junit.Test;


public class MyArrayListTest {
	
	@Test
	public void testAdd() {
		MyArrayList<Integer> testObj = new MyArrayList<Integer>() ;
		testObj.add(11);
		assertEquals(testObj.data[0], 11);
	}

	@Test
	public void testAddatIndex() {
		MyArrayList<Integer> testObj = new MyArrayList<Integer>() ;
		testObj.add(11);
		testObj.add(12);
		testObj.add(13);
		testObj.add(14);
		testObj.add(15);
		testObj.addatIndex(2, 121);
		
		assertEquals(testObj.data[2], 121);
	}

	@Test
	public void testGetFirst() {
		MyArrayList<Integer> testObj = new MyArrayList<Integer>() ;
		testObj.add(11);
		assertEquals(11, testObj.getFirst());
	}

	@Test
	public void testRemove() {
		MyArrayList<Integer> testObj = new MyArrayList<Integer>() ;
		testObj.add(11);
		testObj.add(12);
		testObj.add(13);
		testObj.remove(12);
		assertEquals(2, testObj.getSize());
		assertEquals(13, testObj.data[1]);
	}

	@Test
	public void testRemoveIndex() {
		MyArrayList<Integer> testObj = new MyArrayList<Integer>() ;
		testObj.add(11);
		testObj.add(12);
		testObj.add(13);
		testObj.add(14);
		testObj.add(15);
		assertEquals(5, testObj.getSize());
		assertEquals(true, testObj.removeIndex(2));
		assertEquals(4, testObj.getSize());
		assertEquals(14, testObj.data[2]);
		assertNotEquals(true, testObj.removeIndex(5));
		assertEquals(4, testObj.getSize());
	}

	@Test
	public void testRemoveAll() {
		MyArrayList<Integer> testObj = new MyArrayList<Integer>() ;
		testObj.add(11);
		testObj.add(12);
		testObj.add(13);
		testObj.add(14);
		assertEquals(4, testObj.getSize());
		testObj.removeAll();
		assertEquals(0, testObj.getSize());
	}

	@Test
	public void testReverse() {
		MyArrayList<Integer> testObj = new MyArrayList<Integer>() ;
		testObj.add(11);
		testObj.add(12);
		testObj.add(13);
		testObj.add(14);
		testObj.reverse();
		assertEquals(4, testObj.getSize());

		assertEquals(11, testObj.data[3]);
		assertEquals(12, testObj.data[2]);
		assertEquals(13, testObj.data[1]);
		assertEquals(14, testObj.data[0]);
	}

	@Test
	public void testGetSize() {
		MyArrayList<Integer> testObj = new MyArrayList<Integer>() ;
		assertEquals(0, testObj.getSize());
		testObj.add(11);
		assertEquals(1, testObj.getSize());
		testObj.add(11);
		assertEquals(2, testObj.getSize());
	}
	
	@Test
	public void testAddList() {
		MyArrayList<Integer> testObj1 = new MyArrayList<Integer>() ;
		testObj1.add(11);
		testObj1.add(12);
		testObj1.add(13);
		MyArrayList<Integer> testObj2 = new MyArrayList<Integer>() ;
		testObj2.add(11);
		testObj2.add(12);
		testObj2.add(13);
		
		testObj1.addList(testObj2);
		assertEquals(6, testObj1.getSize());
		assertEquals(13, testObj1.data[5]);

	}
}
