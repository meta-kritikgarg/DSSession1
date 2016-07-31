package DoublyLinkList;

public class MyDoublyLinkList<E> {
	
	DNode<E> start;
	DNode<E> end;
	
	int size ;
	
	public MyDoublyLinkList() {
		start = null;
		end = null;
		size = 0;
	}
	
	/**
     * to get size of list
     * @return
     */
	public int getSize() {
		return size;
	}
	
	 /**
	 * Function to check if list is empty
	 * @return
	 */
	public boolean isEmpty() {
		if(start==null) {
			return true;
		}
		return false;
	}
	
    /**
     * Function to insert an element at end 
     * @param e
     */
    public void add(E e) {
    	DNode<E> newNode = new DNode<E>(e);
    	if(start==null) {
    		start = newNode;
    		end = start;
    	}
    	else {
    		end.next = newNode;
    		newNode.previous = end;
    		end = newNode;
    	}
    	size++;
    }
    
    
    /**
     * Function to insert an element at beginning
     * @param e
     */
    public void insertAtStart(E e) {
        DNode<E> newNode = new DNode<E>(e);    
        if(start == null) {
            add(e);
        }
        else {
            start.previous = newNode;
            newNode.next = start;
            start = newNode;
        }
        size++ ;    
    }
    
    
    /**
     * Function to insert an element at index 
     * @param data
     * @param index
     */
    public void insertAtPos(E e , int index) {
        DNode<E> newNode = new DNode<E>(e);                
        DNode<E> ptr = start;
        for (int i = 0; i < size; i++) {
            if (i == index-1) {
            	newNode.next = ptr.next;
            	ptr.next = newNode;
            	newNode.previous = ptr;
            	newNode.next.previous = newNode; 
                break;
            }
            ptr = ptr.next;
        }
        size++ ;
    }
    
    
    /**
     * Function to delete an element at index
     * @param index
     */
    public void deleteAtPos(int index) {        
        if (index == 0) {
            start = start.next;
            start.previous = null;
            size--; 
            return ;
        }
        
        if (index == size-1) {
            end = end.previous;
            end.next = null;
            size --;
            return;
        }
        
        DNode<E> ptr = start;
        for (int i = 0; i < size ; i++) {
            if (i == index-1) {
                DNode<E> tmp = ptr.next;
                tmp = tmp.next;
                tmp.previous = ptr;
                ptr.next = tmp;
                break;
            }
            ptr = ptr.next;
        }
        size-- ;
        return;
    }    
    
    
    /**
     * To delete a object
     * @param e object to delete
     */
    public void delete(E e) {
    	DNode<E> tmp = start;
    	int index = 0;
    	while(tmp.next!=null) {
    		if(tmp.getData()==e) {
    			deleteAtPos(index);
    			break;
    		}
    		tmp=tmp.next;
    		index++;
    	}
    	
    }
    
    
    public E getByIndex(int index) {
    	if(size>index) {
	    	 DNode<E> tmp = start;
	    	 for (int i = 0; i < index ; i++) {
		                tmp = tmp.next;
		     }
	    	 return tmp.getData();
    	}
    	else {
    		return null;
    	}
    }
    
    
}
