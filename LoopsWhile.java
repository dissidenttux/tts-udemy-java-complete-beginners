/* 8. WhileLoops.java */
public class LoopsWhile {
    public static void main (String[] args) {
	// int value = 10;
	//less than (and more than signs) are comparative symbols for values
	// boolean loop = value < 20;
	//prints "true" because the [value of loop]("10") < 20
	// System.out.println(loop);
	
	
	//int value = 0;
	//// while value is less than ten (i.e. if this statement is true)..
	//while(value < 10) {
		//// ..print "Hello" to output
		//System.out.println("Hello");
		
		//value = value + 1;
	//}
	
	int value = 0;
	// while value is less than ten (i.e. if this statement is true)..
	while(value < 10) {
	    System.out.println("Hello " + value); // ..print "Hello" to output
	    value = value + 1; // add one to value
	    /* the value of "value" will increase by one every loop. Eventually, the while statement will no longer be
	     * true, stopping the loop.
	     * Because "value" is 0, and the condition is <10, the loop will print/loop 10 times, from 0-9 (index based)
	    */
	}
    
    }
} 
