class College
{
	private String collegeName;
	private String collegeArea;
	private String collegePincode;
	
	public String getCollegeName()
	{
		return collegeName;
	}
	
	public void setCollegeName(String collegeName)
	{
		this.collegeName=collegeName;
	}
	
	public String getCollegeArea()
	{
		return collegeArea;
	}
	
	public void setCollegeArea(String collegeArea)
	{
		this.collegeArea=collegeArea;
	}
	
	public String getCollegePincode()
	{
		return collegePincode;
	}
	
	public void setCollegePincode(String collegePincode)
	{
		this.collegePincode=collegePincode;
	}
	
	//aggregation HAS-A type of relationship
	private Department department;
	
	public Department getDepartment()
	{
		return department;
	}
	
	public void setDepartment(Department department)
	{
		this.department=department;
	}
	
	College(String collegeName,String collegeArea,String collegePincode)
	{
		this.collegeName=collegeName;
		this.collegeArea=collegeArea;
		this.collegePincode=collegePincode;
	}
//--------------------------------------------------------------------------------------------------------------------
 public void createDepartment(Department department)
	 {
		  if(department.getDepartmentName()!=null&&department.getDepartmentCode()!=0&&department.getDepartmentFees()!=0.0)
		  {
			    this.department=department;
				System.out.println("the department object created successfully");
				System.out.println();
			  
		  }
		  else
		  {
			  System.out.println("department doesnt exist");
		  }
	  }  
//--------------------------------------------------------------------------------------------------------------------	  
	  public void readDepartment()
	  {
		  if((department.getDepartmentName()!=null&&department.getDepartmentCode()!=0&&department.getDepartmentFees()!=0.0))
		  {
			  System.out.println("department details");
		      System.out.println("-------------------");
		      System.out.println("department name is "+department.getDepartmentName());
		      System.out.println("department code is "+department.getDepartmentCode()); 
		      System.out.println("department fees is "+department.getDepartmentFees()); 
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("department doesnt exist");
		  }
	  }
//-------------------------------------------------------------------------------------------------------
      public void updateDepartment(String departmentName,int departmentCode,double departmentFees)
	  {
         if((department.getDepartmentName()!=null&&department.getDepartmentCode()!=0&&department.getDepartmentFees()!=0.0))
		  {
			
              department.setDepartmentFees(departmentFees);
		      department.setDepartmentCode(departmentCode); 
		      department.setDepartmentName(departmentName); 
			  System.out.println("department object is updated successfully ");
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("department doesnt exist");
		  }		  

	  }
//-------------------------------------------------------------------------------------------------------
	
    public void deleteDepartment(String departmentName)
	  {
		  if(department.getDepartmentName()==departmentName)
		  {
			  this.department=null;
			  System.out.println("department object is deleted successfully ");
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("department doesnt exist");
			  System.out.println();
		  }		  

	  }		
}