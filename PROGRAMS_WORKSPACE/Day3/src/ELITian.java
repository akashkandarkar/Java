import java.util.Date;


public class ELITian extends Associate 
{
	private int groupid;
	private String mappedIBU;
	public ELITian(int id, String name, Date joinDate, int groupid,
			String mappedIBU) 
	{
		super(id, name, joinDate);
		this.groupid = groupid;
		this.mappedIBU = mappedIBU;
	}
	@Override
	public String toString() {
		return "ELITian [groupid=" + groupid + ", mappedIBU=" + mappedIBU
				+ ", Id=" + getId() + ", Name=" + getName()
				+ ", JoinDate=" + getJoinDate() + "]";
	}

	
	
	
	
}
