package org.tsnif.multilevelinheritance;

public class TeamMember extends TeamLead{
	private int member_count;
	
	
	public TeamMember(String deptName, String name, int empID, String leadName, String projectName,int member_count)
	{
		super(deptName, name, empID, leadName, projectName);
		this.member_count=member_count;
	}


	public int getMember_count()
	{
		return member_count;
	}


	public void setMember_count(int member_count) {
		this.member_count = member_count;
	}


	@Override
	public String toString() {
		return "TeamMember [member_count=" + member_count + ", toString()=" + super.toString() + "]";
	}
}
