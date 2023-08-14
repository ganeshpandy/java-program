class Project
{
	private int projectId;
	private String projectName ;
	
	public int getProjectId()
	{
		return projectId;
	}
	
	public void setProjectId(int projectId)
	{
		this.projectId=projectId;
	}
	
	public String getProjectName()
	{
		return projectName;
	}
	
	public void setProjectName(String projectName)
	{
		this.projectName=projectName;
	}
	
	Project(String projectName,int projectId)
	{
		this.projectName=projectName;
		this.projectId=projectId;
	}

}