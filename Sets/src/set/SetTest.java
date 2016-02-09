package set;

public class SetTest {

	public static void main(String[] args) {

		Set s = new Set() ;
		try{

			// INSERTIONS
			s.add(100) ;
			s.add(200) ;
			s.add(300) ;
			s.add(600) ;
			s.add(800) ;
			s.add(900) ;
			s.add(700) ;
			s.add(550) ;
			s.add(400) ;
			s.add(990) ;
			s.showContents() ;
			//			s.add(990) ;

			// DELETIONS
			s.delete(100) ;
			System.out.println("Contents after deleting 100 :");
			s.showContents() ;
			//			s.remove(60) ;
			//			s.showContents() ;

			// SEARCHING
			System.out.println("Is 100 found in the set?" + s.search(100));
			System.out.println("Is 600 found in the set?");
			s.find(600) ;

		}catch(ElementNotInsertedException e){
			System.out.println("The element is already present in the set.");
		}
	}
}
