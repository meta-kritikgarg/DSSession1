

public interface MyList {
	
	void add(Object object) throws Throwable;
	void addatIndex(int index, Object object) throws Throwable;
	Object getFirst();
	boolean removeIndex(int index);
	boolean remove(Object object);
	void removeAll();
	void reverse();
	int getSize();
	<T> void addList(MyArrayList<T> list);
	
}
