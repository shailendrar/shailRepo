package JUnitScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import org.junit.Test;

public class JunitTest {

	@Test
	public void test() throws IOException {
		 // JMeter Engine
		   StandardJMeterEngine jmeter = new StandardJMeterEngine();

		   // Initialize Properties, logging, locale, etc.
		   JMeterUtils.loadJMeterProperties("src/test/resources/jmeter.properties");
		   JMeterUtils.setJMeterHome("D:\\apache-jmeter-5.0\\apache-jmeter-5.0");
		   JMeterUtils.initLogging();// you can comment this line out to see extra log messages of i.e. DEBUG level
		   JMeterUtils.initLocale();

		   
		   
		   // Initialize JMeter SaveService
		   String jMVerison;
		   jMVerison = SaveService.getVERSION(); 
		   System.out.println("The Save Serive JMeter VErsion is - " + jMVerison);
		   SaveService.loadProperties();

		   HashTree testPlanTree = null;
		   // Load existing .jmx Test Plan
		   File iFile = new File("src/test/jmeter/JMeter-Maven_Integration.jmx");
		   FileInputStream in;
			try {
				in = new FileInputStream(iFile);
		       testPlanTree = SaveService.loadTree(iFile);
		       in.close();			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		   // Run JMeter Test
		   jmeter.configure(testPlanTree);
		   jmeter.run();
				   	   
	}

}
