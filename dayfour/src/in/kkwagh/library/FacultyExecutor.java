// program to demonstrate on access specifier
//driver class
package in.kkwagh.library;
import in.bkcmet.library.Library;
//import in.bkcmet.library.*;

public class FacultyExecutor {

	public static void main(String[] args) {
		Library l=new Library();
		l.libraryName="MET-Library";
		l.displayPublic();
		
		/*UserId and displayPrivate() method is private so,
		 * we cannot access into another package or class,
		 * only access in same class*/
		
		//l.userId=12346L;
		//l.displayPrivate();
		
		/*Books name and display default name method is default,
		 * we can't access into another package only we can access it 
		 * within the same package*/
		
		//l.booksName;
		//l.displayDefault();
		
	}

}
