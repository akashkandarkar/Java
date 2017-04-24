package ExceptionHandling;

public class Account 
{
	String accId;
	String accType;
	public String getAccId() 
	{
		return accId;
	}
	public void setAccId(String accid) throws AccountException 
	{
		if(accid.startsWith("ACC") && accid.length()==6)
			{
				this.accId = accid;
			}
		else {
			throw new AccountException("acc must start with ACC");
		}
		
	}
	public String getAccType() 
	{
		return accType;
	}
	public void setAccType(String accType) 
	{
		if(accType.equalsIgnoreCase("current") && accType.equalsIgnoreCase("saving"))
		{
			this.accType = accType;
		}
		
	}
	@Override
	public String toString() 
	{
		return "Account [accId=" + accId + ", accType=" + accType + "]";
	}


}
