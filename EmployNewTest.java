package MavenProject.JunitDemos;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployNewTest {

	@Test
	public void testConstructor() {
		Employ employ1 = new Employ();
		employ1.setEmpno(1);
		employ1.setName("Akhila");
		employ1.setGender(Gender.FEMALE);
		employ1.setDept("Java");
		employ1.setDesig("Programmer");
		employ1.setBasic(84834);
		assertEquals(1,employ1.getEmpno());
		assertEquals("Akhila",employ1.getName());
		assertEquals(Gender.FEMALE,employ1.getGender());
		assertEquals("java",employ1.getDept());
		assertEquals("Programmer",employ1.getDesig());
		assertEquals(84834,employ1.getBasic(),0);
		
		assertNotNull(employ1);
		Employ employ2 = new Employ(1,"Javed Khan",Gender.MALE,"Java","Programmer",88424);
		assertEquals(1,employ2.getEmpno());
		assertEquals("Javed Khan",employ2.getName());
		assertEquals(Gender.MALE,employ2.getGender());
		assertEquals("java",employ2.getDept());
		assertEquals("Programmer",employ2.getDesig());
		assertEquals(88424,employ2.getBasic(),0);



	}
	}


