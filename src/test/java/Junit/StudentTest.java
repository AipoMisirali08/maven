package Junit;

import org.junit.Assert;
import org.junit.Test;
import com.google.Student;



public class StudentTest {

	@Test
	public void reverseMethodTest() {
		Student s1=new Student();
		String actual=s1.reverseString("aika");
		Assert.assertEquals("Reverse method verification", "akia", actual);;
		
	}

}
