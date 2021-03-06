package applications.using.stacks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import fixed.size.stacks.of.strings.Stack;

public class BracketCheck {

	Stack lineStack = new Stack() ;
	Map<Character, Character> bracesMap = new HashMap<Character, Character>() ;

	public static void main(String[] args) {

		String line ;
//		line = "][" ;
//		line= "{[}]" ;
//		line = " ( gjhs)" ;
//		line = "[{[]}]()" ;
		line = "[][][" ;
		
		BracketCheck bc = new BracketCheck() ;
		bc.init() ;
		if( bc.parseString(line)){
			System.out.println("The sentence " + line + " is balanced!");
		}else{
			System.out.println("The sentence " + line + " is not balanced!");
		}

	}

	private void init() {
		bracesMap.put( ']','[') ;
		bracesMap.put( '}','{') ;
		bracesMap.put( ')','(') ;
	}


	public boolean parseString( String line){

		boolean isBalanced = true ;

		for (int i = 0; i < line.length(); i++) {
			char currentChar = line.charAt(i) ;

			// Case 1: Open Braces
			Collection<Character> keys = bracesMap.keySet() ;
	
			if( bracesMap.values().contains(currentChar)){
				// If the parsed character is an open brace, we push it onto the stack
				lineStack.push(currentChar) ;
			}			
			// Case 2: Closing Braces
			else if( keys.contains(currentChar)){
				// If the parsed character is a close brace, we compare it with the element at the top of the stack
				if( lineStack.isEmpty()){
					isBalanced = false ;
					return false ;
				}

				if( !bracesMap.get(currentChar).equals(lineStack.pop())){
					isBalanced = false ;
					break ;
				}
			}
			// Case 3: Otherwise
			else{
				continue ;
			}
		}

		if( !lineStack.isEmpty()){
			isBalanced = false ;
		}
		return isBalanced;
		
		// Or simply
//		return lineStack.isEmpty() ;
	}

}
