package Qaclickacademy;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	
	//Interview Question with what plugin you can execute all your test cases
	//MavenSureFire
	//mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
	//in cmd type "dir" to list out directory then type cd Mavenjava(folder)
	//If maven want to recognise all the test we needed to add "Test" at the end of the java class file name
	
	//command
	//"mvn clean" to clean the project
	//"mvn compile" to compile the project to check the syntax the error
	//"mvn test" to run the test
	
	//Run the xml file from the Maven
	//Run a single test "mvn -Dtest=TestCircle test"
	
	//Profile
	//<profiles> <profile> <id>Regression</id> <build> </profile> </profiles>
	
	//mvn test -PRegression
	
	//<configuration> for TestNg
	
	//************************************************************************************//
	//cmd to install Jenkins "java -jar jenkins.war -httpPort=8080"
	//We need Java and Maven to run Jenkins
	//Click on "Manage Jenkins" then click on "Global tool configuration" then "Intall JDK" give the home path and "Maven path"
	//Click on "New item" and then click on "Free style project"
	//Click on "advance"
	//Copy "Mavenjava" folder in ".jenkins"
	//Then Jenkins will automatically identify 
	//"${JENKINS_HOME}/Mavenjava" 
	
	
	//******************************************************************************//
	//TestNG Reports for Jenkin Jobs
	//install TestNG report plugin click on "Manage Jenkins" then click on "Manage plugins" then install "TestNG"
	//After intall select the project and click on the configration
	//Select the post build 
	//Min Hour DayMonth Month DayWeek
	//After build there will be a link for TestNG report
	
	
	//***************************************************************************//
	//Excel Data Driven Testing Utilities
	//Apache POI API FOR drive Excel
	//Create the Mavne project from ecplise 
	  
	  
	  
	  
	  
	
	
	@Test
	public void BrowserAutomation()
	{
		
	System.out.println("BrowserAutomation");	
		
	}//BrowserAutomation
	
	@Test
	public void ElementsUI()
	{
		
	System.out.println("ElementsUI");	
		
	}//ElementsUI

}
