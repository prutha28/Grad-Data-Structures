package arrays.unsorted;

public class Array<T> implements IArray<T>
{
	T[] data ;
	int len ;
	
	/**
	 * NO Args Constructor.
	 */
	public Array(){
		this.data = null ;
		this.len = 0 ;
	}

	@Override
	public boolean insert(int element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAtStart(int element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAtEnd(int element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAtIndex(int element, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int elementAtIndex(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int search(int element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteElementAtIndex(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] deleteAll(int element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteFromBegin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteFromEnd() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int binarySearch(int element, int beginIndex, int endIndex) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}