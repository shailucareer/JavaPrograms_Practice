package tests.testng_practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TestNgListener implements IAnnotationTransformer{
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
		List<String> groupNames = Arrays.asList(annotation.getGroups());
  		System.out.println(groupNames.toString());
  		//Value 'betaTest' can be read from many places like properties file, run time parameter etc...
  		//For Simplicity, group is hardcoded in this program
  		
  		String groupNameToSkip = "alphaTest";

  		if(groupNames.contains(groupNameToSkip)){
  			System.out.println("found group name");
  			annotation.setEnabled(false);
  		}
	}
	
}
