class Student
{
  	private int studentId;
	private String studentName;
	private String studentNumber;
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public void setStudentId(int studentId)
	{
		this.studentId=studentId;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	
	public String getStudentNumber()
	{
		return studentNumber;
	}
	
	public void setStudentNumber(String studentNumber)
	{
		this.studentNumber=studentNumber;
	}
	
	//aggregation HAS-A type of relationship
	
	  private Project project;
	  public Project getProject()
	  {
		  return project;
	  }
	  public void setProject(Project project)
	  {
		  this.project=project;
	  }
	  
	  Student(String studentName,int studentId,String studentNumber)
	  {
		  this.studentId=studentId;
		  this.studentName=studentName;
		  this.studentNumber=studentNumber;
	  }
//----------------------------------------------------------------------------------------------------------------------
     public void createProject(Project project)
	 {
		  if(project.getProjectName()!=null&&project.getProjectId()!=0)
		  {
			    this.project=project;
				System.out.println("the project object created successfully"); 
				System.out.println();
		  }
		  else
		  {
			  System.out.println("student doesnt exist");
		  }
	  }  
//------------------------------------------------------------------------------------------------------	  
	  public void readProject()
	  {
		  if((project.getProjectName()!=null&&project.getProjectId()!=0))
		  {
			  System.out.println("project details");
		      System.out.println("-------------------");
		      System.out.println("project name is "+project.getProjectName());
		      System.out.println("project id is "+project.getProjectId());
			  System.out.println("project object created  successfully");
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("project doesnt exist");
		  }
	  }
//-------------------------------------------------------------------------------------------------------
      public void updateProject(String projectName,int projectId)
	  {
		  if((project.getProjectName()!=null&&project.getProjectId()!=0))
		  {
			
		      project.setProjectId(projectId);
		      project.setProjectName(projectName); 
			  System.out.println("project object is updated successfully ");
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("project doesnt exist");
		  }		  

	  }
//-------------------------------------------------------------------------------------------------------
	
    public void deleteProject(int projectId)
	  {
		  if(project.getProjectId()==projectId)
		  {
			  this.project=null;
			  System.out.println("project object is deleted successfully ");
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("project doesnt exist");
			  System.out.println();
		  }		  

	  }	
	  	  	  	  	  
}
