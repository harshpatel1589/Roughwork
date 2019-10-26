class Person 
{
	public Person() 
	{
		System.out.println("Person class constructor called"); }
	}
	public class Employee2 extends Person 
	{
		
		public Employee2() 
		{
			System.out.println("Employee class constructor called"); 
		}
		public static void main (String args[]) 
		{
			Employee2 e = new Employee2(); 
		}
}
