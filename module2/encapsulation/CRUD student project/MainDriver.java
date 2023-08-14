import java.util.Scanner;
class MainDriver{
	static Student student;
	static Project project;
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		boolean data=true;
		do{
			System.out.println("select ur choice");
			System.out.println("----------------");
			System.out.println("1.press 1 to create the student");
			System.out.println("2.press 2 to read the student");
			System.out.println("3.press 3 to create the project");
			System.out.println("4.press 4 to read the project");
			System.out.println("5.press 5 to update the project");
			System.out.println("6.press 6 to delete the project");
			System.out.println("7.press 7 to exit");
			int choice=scanner.nextInt();
			switch(choice){
				case 1:{
					System.out.println("enter the student id");
					int studentId=scanner.nextInt();
					System.out.println("enter the student name");
					String studentName=scanner.next();
					student=new Student(studentId,studentName);
					System.out.println("student create operation performed successfully");
				}
				break;
				case 2:{
					System.out.println("student details");
					System.out.println("----------------");
					System.out.println("student id:"+student.studentId());
					System.out.println("student Name:"+student.getStudentName);
					System.out.println("student read operation performed successfully");
				}
				break;
				case 3:{
					System.out.println("enter the project id");
					int projectId=scanner.nextInt();
					System.out.println("enter the project name");
					String projectName=scanner.next();
					project=new project(projectId,projectName);
					student.createTheProject(project);
				}
				break;
			case 4:{
				student.readTheProject();
			}
			break;
			case 5:{
				System.out.println("enter the new project id");
				int projectId=scanner.nextInt();
				System.out.println("enter the new project name");
				String projectName=scanner.next();
				student.updateTheProject(projectId,projectName);
			}
			break;
			case 6:{
				System.out.println("enter the current project id");
				int projectId=scanner.nextInt();
				Student.deleteTheProject(projectId);
			}
			break;
			case 7:{
				data=false;
				System.out.println("thank u");
			}
			break;
			default:{
				System.out.println("invalid choice");
			}
			break;
		}
	}while(data);
}
}