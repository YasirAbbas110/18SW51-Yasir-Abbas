class Sports
{
	final String getName()
	{
		return "Generic Sport";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n members in "+getName());
	}
}
class Cricket extends Sports
{
	String getName()
	{
		return "Cricket";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has 11 members in "+getName());
	}
}

class Task3
{
	public static void main(String[] args)
	{
		Sports sport = new Sports();
		sport.getNumberOfTeamMembers();
		Cricket cricket = new Cricket();
		cricket.getNumberOfTeamMembers();
	}
}