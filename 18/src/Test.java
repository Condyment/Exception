
public class Test {

	public static void main(String[] args)
	{
		System.out.println(Math.tan(Math.PI/2));
		double a=-4;
		double b=0;
		
		try {
	radacina(a);
		}
		catch(EXC e)
		{
			
		System.out.println("Mesajul este :"+e.getMessage());
		e.printStackTrace(System.out);
		}
		try {
			division(a,b);
		}
		catch(EXC e) {
			System.out.println("Mesajul este :"+e.getMessage());
			e.printStackTrace(System.out);
		}
		try {
			logarithm(b);
		}
		catch(EXC e) {
			System.out.println("Mesajul este :"+e.getMessage());
			e.printStackTrace(System.out);
		}
		try {
			logarithmbaza10(b);
		}
		catch(EXC e) {
			System.out.println("Mesajul este :"+e.getMessage());
			e.printStackTrace(System.out);
		}
		try {
			tang(Math.tan(Math.PI/2));
		}
		catch(EXC e) {
			System.out.println("Mesajul este :"+e.getMessage());
			e.printStackTrace(System.out);
		}
		}
	
	public  static void radacina(double a)throws EXC
	{
		if(a<0)
		{
			throw new EXC("Erroare la numrele negative");
		}
		else
		{
			System.out.println(Math.sqrt(a));
			
		}
	}
	public  static void division(double a,double b )throws EXC
	{
		if(b==0)
		{
			throw new EXC("Erroare din cauza ca rezultatul e infinit");
		}
		else
		{
			
			System.out.printf("%f",a/b);
			
		}
		
		
	}
	public  static void logarithm(double b)throws EXC
	{
		if(b==0)
		{
			throw new EXC("Erroare din cauza ca e trebuie sa aiba la putere -infinit");
		}
		else
		{
			
			System.out.println(Math.log(b));
			
		}
		
		
	}
	public  static void logarithmbaza10(double b)throws EXC
	{
		if(b==0)
		{
			throw new EXC("Erroare din cauza ca 10 trebuie sa aiba la putere -infinit");
		}
		else
		{
			
			System.out.println(Math.log10(b));
			
		}
		
		
	}
	public  static void tang(double b)throws EXC
	{
		if(b==Math.tan(Math.PI/2))
		{
			throw new EXC("Erroare din cauza ca numaru tinde spre -+infinit");
		}
		else
		{
			
			System.out.println(Math.tan(b));
			
		}
		
		
	}
	
	
}
