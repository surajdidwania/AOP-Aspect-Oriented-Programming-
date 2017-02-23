package org.suraj.javaStyle.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@After("allgetters() && getter()") //Wildcard Expression Irrespectve of the return type as long as it has been executed with get start
	public void LoggingAdvise()
	{
		System.out.println("Advise Run Get Method Called");
	}
	@Before("allgetters()")  //PointCuts
	public void secondAdvise()
	{
		System.out.println("Second Advise Executed");
	}
	@Pointcut("execution(public * get*(..))")
	public void allgetters()
	{
		
	}
	/*@Pointcut("within(org.suraj.javaStyle.model..*)") // All the classes in the package and subpackages
*/	@Pointcut("within(org.suraj.javaStyle.model.Circle)")
	public void getter(){}
	
	/*@PointCut(args()) 
	public void getter1(){}//It takes the multiple method name as the argument 
}*/
}

/*C:\ProgramData\Oracle\Java\javapath*/