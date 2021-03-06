package set;

public class SetUtils {

	public Set union( Set s1, Set s2) throws ElementNotInsertedException{
		Set result = s1 ;
		int i = 0 ;
		
		int elements[] = s2.elements() ;
		while( i< elements.length){
			if( !s1.search(elements[i]))
				result.add(elements[i]) ;
			i++ ;
		}
		
		return result ;
	}	
	
	
	public Set intersection( Set s1, Set s2) throws ElementNotInsertedException{
		Set result = new Set() ;
		int s2Elements[] = s2.elements() ;
		
		int i = 0 ; // iterates over set 2
		
		while( i < s2Elements.length){
			if( s1.search(s2Elements[i])){
				result.add(s2Elements[i]) ;
			}
			i++ ;
		}
		return result ;
	}
}
