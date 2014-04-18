package complexNumbers;

public class ComplexTest {
    
    private Double real; // real part
    private Double imaginary; // imaginary part
    
    public ComplexTest()
    {// constructor that intializes to zero
           this ( 0.0, 0.0 );
    }

    public ComplexTest (double r, double i) 
    {//Complex function that assigns two private data members
      real = r;
      imaginary = i;
    }
   
    public ComplexTest ComplexAddition (ComplexTest complex ) 
    {// divides adds numbers
		return new ComplexTest(real + complex.real, imaginary + complex.imaginary);
    }
    
    public ComplexTest ComplexSubtract (ComplexTest complex ) 
    {// divides subtracts numbers
		return new ComplexTest(real - complex.real, imaginary - complex.imaginary);
    }
    
    public ComplexTest ComplexMultiply (ComplexTest complex ) 
    {// divides multiples numbers
    	return new ComplexTest(real * complex.real - imaginary * complex.imaginary,
    			real*complex.imaginary + imaginary * complex.real);
    }
    
    public ComplexTest ComplexDivide (ComplexTest complex ) 
    { // divides complex numbers
    	return new ComplexTest((real * complex.real + imaginary * complex.imaginary)/(complex.real * complex.real + complex.imaginary * complex.imaginary) ,
    			(imaginary * complex.real - real * complex.imaginary)/(complex.real * complex.real + complex.imaginary * complex.imaginary));
    }
    
    public String toString()
    { //turn ComplexTest to String
		return String.format("(%.1f,  %.1f)", real, imaginary);
	}
}