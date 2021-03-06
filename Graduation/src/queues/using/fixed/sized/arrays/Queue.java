package queues.using.fixed.sized.arrays;

import java.util.EmptyStackException;

/**
 * 
 * @author prutha
 * 
 *
 * QUEUES USING FIXED SIZE ARRAYS.
 *
 * front, rear = -1
 * ------------------------------------------
 * | | | | | | | | | | |
 * ------------------------------------------
 * 0 1 2 3 4 5 6 7 8 9
 *
 * front = 0 rear = 4
 * ------------------------------------------
 * | 2 | 5 | 6 | 8 | | | | | | |
 * ------------------------------------------
 * 0 1 2 3 4 5 6 7 8 9
 *
 * Initially front, rear both will be -1.
 * We add elements to the rear of the queue.
 * and remove from front.
 *
 * Front is the index of element to be removed next.
 * Rear is the index at which you will insert the element.
 * 
 * ASSUMPTIONS : 
 * At any point of time, the part of the data array between the [front, rear-1] 
 * is the valid part of the queue.
 * 
 * We use the value -1 as the sentinel value.
 */

public class Queue implements IQueue {

	private static final int CAPACITY = 10 ;
	int front ;
	int rear ;
	int[] data ;

	public Queue(){
		front = -1 ;
		rear = -1 ;
		data = new int[ CAPACITY ] ;
		for (int i = 0; i < CAPACITY; i++) {
			data[i]  = -1 ;
		}
	}

	// We always enqueue at the rear of the queue.( i.e. at index = rear)
	public void enqueue(int element) throws QueueFullException {

		if( isFull()){
			throw new QueueFullException("Queue is Full!") ;
		}

		// Only the first time, do this.
		if( isEmpty()){
			front++ ;
			rear++ ;
		}

		data[ rear ] = element ;
		rear++ ;
	}

	// We always dequeue from the front of the queue.( i.e. at index = front)
	public int dequeue() throws QueueEmptyException {
		if( isEmpty()){
			throw new QueueEmptyException("The Queue is Empty!") ;
		}

		int popped = data[front] ;
		front++;
		return popped;
	}

	public int front() {
		if( isEmpty()){
			System.out.println("Queue is empty.");
			throw new EmptyStackException() ;
		}
		return data[front];
	}

	public int end() {
		if( isEmpty()){
			System.out.println("Queue is empty.");
			throw new EmptyStackException() ;
		}
		return data[rear-1];
	}

	public int size() {
		if( isEmpty())
			return 0 ;

		return ( rear - front ) ;
	}


	// Either when both the front & rear are equal to -1 or both are equal to CAPACITY.
	public boolean isEmpty() {
		return ( front ==rear );
	}

	public boolean isFull() {
		return ( rear == CAPACITY);
	}

	public void display() {

		if( isEmpty()){
			System.out.println("The queue is empty.");
			return ;
		}

		System.out.println("The elements of the queue from the front to rear:");
		int index = front ;

		while( index < rear){
			System.out.print(data[index] + " ");
			index++ ;
		}
		System.out.println();
	}

}
