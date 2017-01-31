public class Student
{
	private String name;
	private int age;
	private static int oldestStudent;

	public Student()
	{
		this.name = "Stuart Dent";
		this.age = 18;
	}

	public int getAge()
	{
		return age;
	}

	public Student(String name)
	{
		this.name = name;
	}

	public Student(int age)
	{
		this.age = age;
	}

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void haveBirthday()
	{
		age++;
	}
}