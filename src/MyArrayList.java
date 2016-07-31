
public class MyArrayList<T> implements MyList {
	
	Object[] data ;

	public MyArrayList() {
		 data = new Object[1];
	}

	@Override
	public void add(Object object) {
			try {
				addatIndex(data.length-1, object);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


	@Override
	public void addatIndex(int index, Object object) {
		if(data.length>=index) {
				Object[] tmp = new Object[data.length+1];
				for (int i = 0; i < index; i++) {
					tmp[i]= data [i];
				}
				tmp[index] = object;
				for (int i = index;i<data.length;i++) {
					tmp[i+1]=data[i];
				}
				data = tmp;
		}
		else {
			//throw new Exception("");
		}
		
	}

	@Override
	public Object getFirst() {
		if(data[0]!=null) {
			return data[0];
		}
		else {
			return null;
		}
	}

	@Override
	public boolean removeIndex(int index) {
		if(index<getSize()) {
			Object[] tmp = new Object[getSize()];
			for(int i = 0 ; i<index ; i++)
			{
				tmp[i]= data[i];
			}
			for(int i = index; i< tmp.length; i++) {
				tmp[i] = data[i+1];
			}
			data = tmp;
			return true ;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean remove(Object object) {
		for (int i = 0; i < data.length; i++) {
			if(data[i]==object)
			{
				removeIndex(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public void removeAll() {
		data = new Object[1];
	}

	@Override
	public void reverse() {
		Object[] tmp = new Object[data.length];
		for (int i = 0; i < tmp.length-1; i++) {
			tmp[i] = data[tmp.length-2-i];
		}
		data = tmp;
	}

	@Override
	public int getSize() {
		return data.length-1;
	}

	@Override
	public <T> void addList(MyArrayList<T> list) {
		for(int i=0; i<list.getSize(); i++) {
			add(list.data[i]);
		}
	}

	
}
