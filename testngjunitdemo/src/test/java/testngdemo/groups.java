package testngdemo;

import org.testng.annotations.Test;

public class groups {
	
	
@Test(priority=1,groups = {"smoke"})
public void tc1() {
System.out.println("This is a smoke Testing");	
}
@Test(priority=2,groups = {"regression"})
public void tc2() {
System.out.println("This is a regression Testing");	
}
@Test(priority=1,groups = {"smoke"})
public void tc3() {
System.out.println("This is a smoke Testing");	
}
@Test(priority=2,groups = {"regression"})
public void tc4() {
System.out.println("This is a regression Testing");	
}

}
