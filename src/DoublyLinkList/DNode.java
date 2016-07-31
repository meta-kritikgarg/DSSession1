package DoublyLinkList;


public class DNode<E> {
	
	public E data;
    public DNode<E> next;
    public DNode<E> previous;
 
    //  Constructor
    public DNode() {
        next = null;
        data = null;
        previous = null;
    }    

    //  Constructor 
    public DNode(E d) {
        next = null;
        data = null;
    	data = d;
    }    

    /**
     * Function to set data to current Node
     * @param d
     */
    public void setData(E d) {
        data = d;
    }    
 
    /**
     * Function to get data from current Node 
     * @return
     */
    public E getData() {
        return data;
    }
}
