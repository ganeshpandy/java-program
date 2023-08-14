class University
{
	private String universityName;
	private String universityArea;
	private String universityPincode;
	
	University(String universityName,String universityArea,String universityPincode)
	{
		this.universityName=universityName;
		this.universityArea=universityArea;
		this.universityPincode=universityPincode;
	}
	
	public String getUniversityName()
	{
		return universityName;
	}
	
	public void setUniversityName(String universityName)
	{
		this.universityName=universityName;
	}
	
	public String getUniversityArea()
	{
		return universityArea;
	}
	
	public void setUniversityArea(String universityArea)
	{
		this.universityArea=universityArea;
	}
	
	public String getUniversityPincode()
	{
		return universityPincode;
	}
	
	public void setUniversityPincode(String universityPincode)
	{
		this.universityPincode=universityPincode;
	}
	
	//aggregation HAS-A type of relationship
	private College college;
	public College getCollege()
	{
		return college;
	}
	
	public void setCollege(College college)
	{
		this.college=college;
	}
//-----------------------------------------------------------------------------------------------------

     public void createCollege(College college)
	 {
		  if(college.getCollegeName()!=null&&college.getCollegeArea()!=null&&college.getCollegePincode()!=null)
		  {
			  this.college=college;
			  System.out.println("the college object created successfully"); 
			  System.out.println();
		  }
		  else
		  {
			  System.out.println("college doesnt exist");
		  }
	  }  
	  
//------------------------------------------------------------------------------------------------------
	  public void readCollege()
	  {
		 if(college.getCollegeName()!=null&&college.getCollegeArea()!=null&&college.getCollegePincode()!=null)
		  {
			  System.out.println("college details");
		      System.out.println("-------------------");
		      System.out.println("college name is "+college.getCollegeName());
		      System.out.println("college area is "+college.getCollegeArea()); 
		      System.out.println("college pincode is "+college.getCollegePincode()); 
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("college doesnt exist");
		  } 
		
	  }
//-------------------------------------------------------------------------------------------------------
      public void updateCollege(String collegeName,String collegeArea,String collegePincode)
	  {
		  if(college.getCollegeName()!=null&&college.getCollegeArea()!=null&&college.getCollegePincode()!=null)
		  {
			
		      college.setCollegeName(collegeName);
		      college.setCollegeArea(collegeArea); 
		      college.setCollegePincode(collegePincode); 
			  System.out.println("college object is updated successfully ");
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("college doesnt exist");
		  }		  

	  }
	  
//-------------------------------------------------------------------------------------------------------
	
    public void deleteCollege(String collegeName)
	  {
		  if(college.getCollegeName()==collegeName)
		  {
			  this.college=null;
			  System.out.println("college object is deleted successfully ");
		      System.out.println();
		  }
		  else
		  {
			  System.out.println("college doesnt exist");
			  System.out.println();
		  }		  

	  }
}
