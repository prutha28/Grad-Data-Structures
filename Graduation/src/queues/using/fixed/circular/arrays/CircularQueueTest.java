package queues.using.fixed.circular.arrays;

public class CircularQueueTest {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {

		CircularQueue q = new CircularQueue() ;

		System.out.println("Is the queue empty? " + q.isEmpty());
		System.out.println("The no of elements in the queue is " + q.size());
		System.out.println("Adding elements");

		// ENQUEUING
		q.enqueue(100) ;
		q.enqueue(200) ;
		q.enqueue(300) ;
		q.enqueue(400) ;
		q.enqueue(500) ;
		q.enqueue(600) ;

		System.out.println("The no of elements in the queue is " + q.size());
		q.display() ;

		q.enqueue(700) ;
		q.enqueue(800) ;
		q.enqueue(900) ;


		System.out.println("The no of elements in the queue is " + q.size());
		q.display() ;
		System.out.println("Is the queue empty? " + q.isEmpty());
		System.out.println("Is the queue full? " + q.isFull());

		System.out.println("The element at the front of the queue is " + q.front());
		System.out.println("The element at the rear of the queue is " + q.end());

		if( !q.isFull()){
			q.enqueue(1100) ;
		}

		// DEQUEUING
		System.out.println("Dequeuing " + q.dequeue());
		System.out.println("Dequeuing " + q.dequeue());

		System.out.println("The no of elements in the queue is " + q.size());
		q.display() ;

		System.out.println("Is the queue full ? " + q.isFull());
		// ENQUEUING AGAIN to illustrate circular behavior

		q.enqueue(110) ;
		q.enqueue(113) ;

		System.out.println("The no of elements in the queue is " + q.size());
		q.display() ;

		if( !q.isFull()){
			q.enqueue(1100) ;
		}
	}
}
