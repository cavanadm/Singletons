import org.omg.CORBA.DynAnyPackage.InvalidValue;

public class Member implements Comparable<Member>{
	protected int rank;
	protected String firstName;
	protected String lastName;
	protected String title;
	protected int age;
	

	
	public Member(int rank, String firstName, String lastName, String title, int age) {
		this.rank = rank;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.age = age;
	}
	
	public Member() {
		
	}

	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) throws InvalidValue{
		if(rank > 0 && rank <= 5)
			{this.rank = rank;}
		else
			throw new InvalidValue("That is an invalid input");
		
			
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws InvalidValue {
		if(age > 0 && age <= 5)
		{this.age = rank;}
	else
		throw new InvalidValue("That is an invalid input");
	}
	
	@Override
	public int compareTo(Member compareMember) {
		
		int compareRank = (compareMember).getRank();
		return this.rank - compareRank;
	}
	
	@Override
	public String toString() {
		return "Rank: " + this.rank + " " + this.firstName + " " + this.lastName + " " + this.title + " Age: "
			+ this.age;}
	

	
}

class Leader extends Member{
	private static final Leader leader = new Leader("Dylan","Cavanaugh", "Boss", 38, 29);
	private int yearsWorked;
	
	private Leader(String firstName, String lastName, String title, int age, int yearsWorked) {
		super(1, firstName, lastName, title, age);
		this.yearsWorked = yearsWorked;
		
		
	}
	
	public static Leader getInstance() {

		
		return leader;
	}
	
	
	public int getYearsWorked() {
		return yearsWorked;
	}
	
	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}
	
	@Override
	public String toString() {
		return "Rank: " + this.rank + " " + this.firstName + " " + this.lastName + " " + this.title + " Age: "
				+ this.age + " Years Worked: " + this.yearsWorked;
	}
	
	
}
