package complexnumbers;

public class ComplexTest {
    
    private Double real;
    private Double imaginary;
    
    public ComplexTest()
    {
           this ( 0.0, 0.0 );
    }

    public ComplexTest (double r, double i) 
    {
      real = r;
      imaginary = i;
    }
   
    public ComplexTest ComplexAddition (double r, double i) 
    {
      
    }
    
    public ComplexTest ComplexSubtract (double r, double i) 
    {
      
    }
    
    public ComplexTest ComplexMultiply (double r, double i) 
    {
      
    }
    
    public ComplexTest ComplexDivide (double r, double i) 
    {
      
    }
    
public ComplexTest complexadd (ComplexTest c) {

double r, i;
ComplexTest result;
r=this.real+c.real;
i=this.imaginary-c.imaginary;
result = new ComplexTest (r,i);
return result;}
}