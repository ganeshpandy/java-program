import java.util.Scanner;
class MainDriver
{
		static Student student;
		static Project project;
		static College college;
		static Department department;
		static University university;
		
	public static void main(String[] args)
	{
      Scanner scn=new Scanner(System.in);
	  boolean flag=true;	  
	  do{
		  System.out.println("select options");
		  System.out.println("----------------");
		  System.out.println("press 1 to create university object");
		  System.out.println("press 2 to read university object");
		  System.out.println("press 3 to create college object");
		  System.out.println("press 4 to read college object");
		  System.out.println("press 5 to update college object");
		  System.out.println("press 6 to delete college object");
		  System.out.println("press 7 to create department object");
		  System.out.println("press 8 to read department object");
		  System.out.println("press 9 to update department object");
		  System.out.println("press 10 to delete department object");
		  System.out.println("press 11 to create student object");
		  System.out.println("press 12 to read student object");
		  System.out.println("press 13 to update student object");
		  System.out.println("press 14 to delete student object");
		  System.out.println("press 15 to create project object");
		  System.out.println("press 16 to read project object");
		  System.out.println("press 17 to update project object");
		  System.out.println("press 18 to delete project object");
		  System.out.println("press 19 to quit");
		  int options=scn.nextInt();
		  System.out.println();
		  
		  switch(options)
		  {
			case 1:
			{
                  System.out.println("enter the name for university");
				  String universityName=scn.next();
				  System.out.println("enter the area for university");
				  String universityArea=scn.next();
				  System.out.println("enter the pincode for university");
				  String universityPincode=scn.next();
				  university=new University(universityName,universityArea,universityPincode); 
				  System.out.println("the university obj created successfully");
				  System.out.println();
				  
			}break;		
            
 			case 2:
			{
				System.out.println("the university name is "+university.getUniversityName());
				System.out.println("the university area is "+university.getUniversityArea());
				System.out.println("the university pincode is "+university.getUniversityPincode());
				System.out.println();
			}break;	
			
			case 3:
			{
				  System.out.println("enter the name for college");
				  String collegeName=scn.next();
				  System.out.println("enter the area for college");
				  String collegeArea=scn.next();
				  System.out.println("enter the pincode for college");
				  String collegePincode=scn.next();
				  college=new College(collegeName,collegeArea,collegePincode);
				  university.createCollege(college);
				  System.out.println("the college obj created successfully");
				  System.out.println();
			}break;		
			
			case 4:
			{
			    university.readCollege();
				System.out.println();
			}break;		
			
			case 5:
			{
				System.out.println("enter new college name");
				String collegeName=scn.next();
				System.out.println("enter new college area");
				String collegeArea=scn.next();
				System.out.println("enter new college pincode");
				String collegePincode=scn.next();
				System.out.println();
				university.updateCollege(collegeName,collegeArea,collegePincode);
				System.out.println();
			}break;	
			
			case 6:
			{
                System.out.println("enter new college name");
				String collegeName=scn.next();
				System.out.println();
				university.deleteCollege(collegeName);
				System.out.println("the college name deleted successfully");
				System.out.println();
			}break;		
			
			case 7:
			{
				System.out.println("enter department name");
				String departmentName=scn.next();
				System.out.println("enter department code");
				int departmentCode=scn.nextInt();
				System.out.println("enter department fees");
				double departmentFees=scn.nextDouble();
			    department=new Department(departmentName,departmentCode,departmentFees);
				college.createDepartment(department);
				System.out.println("the department obj created successfully");
				System.out.println();
			}break;	
			
			case 8:
			{
				college.readDepartment();
				System.out.println();
			}break;		
			
			case 9:
			{
				System.out.println("enter new department name");
				String departmentName=scn.next();
				System.out.println("enter new department code");
				int departmentCode=scn.nextInt();
				System.out.println("enter new department fees");
				double departmentFees=scn.nextDouble();
				System.out.println();
				
				college.updateDepartment(departmentName,departmentCode,departmentFees);
				System.out.println();
			}break;		
			
			case 10:
			{
				System.out.println("enter new department name");
				String departmentName=scn.next();
				System.out.println();
				college.deleteDepartment(departmentName);
				System.out.println();
			}break;	
			
			case 11:
			{
				System.out.println("enter student name");
				String studentName=scn.next();
				System.out.println("enter studentId");
				int studentId=scn.nextInt();
				System.out.println("enter student number");
				String studentNumber=scn.next();
				
				student=new Student(studentName,studentId,studentNumber);
				department.createStudent(student);
				 System.out.println("the student obj created successfully");
				 System.out.println();
			}break;		
			
			case 12:
			{
				department.readStudent();
				System.out.println();
			}break;		
			
			case 13:
			{
				System.out.println("enter new student name");
				String studentName=scn.next();
				System.out.println("enter new studentId");
				int studentId=scn.nextInt();
				System.out.println("enter new student number");
				String studentNumber=scn.next();
				
				department.updateStudent(studentName,studentId,studentNumber);
				System.out.println();
			}break;		
			
			case 14:
			{
				System.out.println("enter new studentId");
				int studentId=scn.nextInt();
				System.out.println("enter new student number");
				System.out.println();
				department.deleteStudent(studentId);
				System.out.println();
				
			}break;		
			
			case 15:
			{
				System.out.println("enter project name");
				String projectName=scn.next();
				System.out.println("enter project Id");
				int projectId=scn.nextInt();
				project=new Project(projectName,projectId);
				student.createProject(project);
				System.out.println("the project obj created successfully");
				System.out.println();
			}break;		
			
			case 16:
			{
				student.readProject();
				System.out.println();
			}break;		
			
			case 17:
			{
				System.out.println("enter new project name");
				String projectName=scn.next();
				System.out.println("enter new project Id");
				int projectId=scn.nextInt();
				System.out.println();
				
				student.updateProject(projectName,projectId);
				System.out.println();
			}break;		
			
			case 18:
			{
				System.out.println("enter new project Id");
				int projectId=scn.nextInt();
				System.out.println();
				student.deleteProject(projectId);
				System.out.println();
			}break;		
			
			case 19:
			{
				flag=false;
				System.out.println("thank u");
				System.out.println();
			}break;		
			
			default :
			{
				System.out.println("invalid input");
				System.out.println();
			}		
		  }
	  }while(flag);
	}
}





