package set;

public class SetUtils {

	public Set union( Set s1, Set s2) throws ElementNotInsertedException{
		Set result = s1 ;
		int i = 0 ;
		
		int elements[] = s2.elements() ;
		while( i< elements.length){
			result.add(elements[i]) ;
			i++ ;
		}
		
		return result ;
	}	
}