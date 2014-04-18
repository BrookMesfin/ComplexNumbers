package complexNumbers;

public class ComplexNumbers {

    public static void main(String[] args) {
        
    	//instantiating ComplexTest with values
    	ComplexTest a = new ComplexTest(9.5,7.7);
    	ComplexTest b = new ComplexTest(1.2,3.1);
    	
    	//printing to console about program
    	System.out.println("A complex number in the \nform (x, y) is equal to \nx + yi, where i is \nsquare root of -1.\n");
    	
    	//outputting calculations
    	System.out.println("*-Complex numbers calculations-*");
    	System.out.println("a = "+a);
    	System.out.println("b = "+b);
    	System.out.printf("a + b = %s\n", a.ComplexAddition(b));
    	System.out.printf("a - b = %s\n", a.ComplexSubtract(b));
    	System.out.printf("a * b = %s\n", a.ComplexMultiply(b));
    	System.out.printf("a / b = %s\n", a.ComplexDivide(b));	
    }
    
}
