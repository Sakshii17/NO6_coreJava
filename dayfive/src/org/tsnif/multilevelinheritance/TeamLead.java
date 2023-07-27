package org.tsnif.multilevelinheritance;
//child class 1 and parent class ()B
public class TeamLead extends Manager {
	
	//private data members
	
	private String leadName;
	private String projectName;
	
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//paramterized constructor
	public TeamLead(String deptName, String name, int empID, String leadName, String projectName) {
		super(deptName, name, empID);
		this.leadName = leadName;
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	

}
