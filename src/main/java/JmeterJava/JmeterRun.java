package JmeterJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.jmeter.engine.StandardJMeterEngine;
//import org.apache.jmeter.protocol.http.sampler.HTTPSampler;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
public class JmeterRun {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	/*	 // JMeter Engine
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
		*/
		
		
		
	      // Engine
  /*      StandardJMeterEngine jm = new StandardJMeterEngine();
        // jmeter.properties
        JMeterUtils.loadJMeterProperties("C:/Users/sthomas/jmeter.properties");
        HashTree hashTree = new HashTree();     

        // HTTP Sampler
        HTTPSampler httpSampler = new HTTPSampler();
        httpSampler.setDomain("www.google.com");
        httpSampler.setPort(80);
        httpSampler.setPath("/");
        httpSampler.setMethod("GET");

        // Loop Controller
        LoopController loopCtrl = new LoopController();
        ((LoopController)loopCtrl).setLoops(1);
        ((LoopController)loopCtrl).addTestElement(httpSampler);
        ((LoopController)loopCtrl).setFirst(true);
        ((LoopController)loopCtrl).initialize();
        // Thread Group
        SetupThreadGroup threadGroup = new SetupThreadGroup();
        threadGroup.setNumThreads(1);
        threadGroup.setRampUp(1);
        threadGroup.setSamplerController((LoopController)loopCtrl);

        // Test plan
        TestPlan testPlan = new TestPlan("MY TEST PLAN");

        hashTree.add("testPlan", testPlan);
        hashTree.add("loopCtrl", loopCtrl);
        hashTree.add("threadGroup", threadGroup);
        hashTree.add("httpSampler", httpSampler);       

        jm.configure(hashTree);

        jm.run();*/
    
	}

}
