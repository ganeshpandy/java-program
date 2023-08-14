class Department 
{
	private int departmentCode;
	private String departmentName;
	private double departmentFees;
	
	public int getDepartmentCode()
	{
		return departmentCode;
	}
	
	public void setDepartmentCode(int departmentCode)
	{
		this.departmentCode=departmentCode;
	}
	
	public String getDepartmentName()
	{
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName)
	{
		this.departmentName=departmentName;
	}
	
	public double getDepartmentFees()
	{
		return departmentFees;
	}
	
	public void setDepartmentFees(double departmentFees)
	{
		this.departmentFees=departmentFees;
	}
	
	//AGGREGATION HAS-A TYPE OF RELATIONSHIP
	
	private Student student;
	public Student getStudent()
	{
		return student;
	}
	
	public void setStudent(Student student)
	{
		this.student=student;
	}
	
	Department(String departmentName,int departmentCode,double departmentFees)
	{
		this.departmentName=departmentName;
		this.departmentCode=departmentCode;
		this.departmentFees=departmentFees;
	}
//----------------------------------------------------------------------------------------------------------------------
     public void createStudent(Student student)
	 {
		  if((student.getStudentName()!=null&&student.getStudentId()!=0&&student.getStudentNumber()!=null))
		  {
			    this.student=student;
				System.out.println("the student object created successfully"); 
				System.out.println();
		  }
		  else
		  {
			  System.out.println("student doesnt exist");
		  }
	  }  
//------------------------------------------------------------------------------------------------------	  
	  public void readStudent()
	  {
		  if((student.getStudentName()!=null&&student.getStudentId()!=0&&student.getStudentNumber()!=null))
		  {
			  System.out.println("student details");
		      System.out.println("-------------------");
		      System.out.println("student name is "+student.getStudentName());
		      System.out.println("student id is "+student.getStudentId()); 
		      System.out.println("student number is "+student.getStudentNumber()); 
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("student doesnt exist");
		  }
	  }
//-------------------------------------------------------------------------------------------------------
      public void updateStudent(String studentName,int studentId,String studentNumber)
	  {
		  if((student.getStudentName()!=null&&student.getStudentId()!=0&&student.getStudentNumber()!=null))
		  {
			
              student.setStudentId(studentId);
		      student.setStudentName(studentName); 
		      student.setStudentNumber(studentNumber); 
			  System.out.println("student object is updated successfully ");
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("student doesnt exist");
		  }		  

	  }
//-------------------------------------------------------------------------------------------------------
	
    public void deleteStudent(int studentId)
	  {
		  if(student.getStudentId()==studentId)
		  {
			  this.student=null;
			  System.out.println("student object is deleted successfully ");
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("student doesnt exist");
			  System.out.println();
		  }		  

	  }		
}