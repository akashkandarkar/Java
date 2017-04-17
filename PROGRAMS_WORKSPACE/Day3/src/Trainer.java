
public class Trainer extends Person 
{

	
	private int num_of_skills;
	private int expInYears;
	
	public Trainer(String fname, String lname, String address,int num_of_skills, int expInYears) 
	{
		super(fname, lname, address);
		this.num_of_skills = num_of_skills;
		this.expInYears = expInYears;
	}

	public void TrainerKaMethod() {
		
	}


	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		System.out.println(this.getFname());
		System.out.println(this.getLname());
		System.out.println(this.getAddress());
		System.out.println(this.num_of_skills);
		System.out.println(this.expInYears);
	}

}
