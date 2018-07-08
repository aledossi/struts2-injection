package test;

import static defs.Defs.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import sushi.configure.Coverage;
import sushi.configure.JBSEParameters;
import sushi.configure.MergerParameters;
import sushi.configure.MinimizerParameters;
import sushi.configure.Options;
import sushi.configure.ParametersModifier;
import sushi.logging.Level;

public class SushiParams extends ParametersModifier {
	static final String METHOD_CLASS      = "actions/addElement/AddElementAction";
	static final String METHOD_DESCRIPTOR = "()Ljava/lang/String;";
	static final String METHOD_NAME       = "execute";
	
	@Override
	public void modify(Options p) {
		//Local configurations
		p.setEvosuitePath(EVOSUITE_PATH);
		p.setSushiLibPath(SUSHI_LIB_PATH);
		p.setZ3Path(Z3_PATH);
		
		//Target 
		p.setClassesPath(BIN_PATH, JBSE_PATH, RT_PATH,
				//Struts2 Required Jars
				STRUTS2_CORE, LOG4J, LOG4J_CORE, OGNL);
		
		
		p.setTargetMethod(METHOD_CLASS, METHOD_DESCRIPTOR, METHOD_NAME);

		//Analysis params 
		p.setEvosuiteBudget(3600);
		p.setJBSEBudget(3600);
		
		// Installare GLPK per minimizzazione braches?
		//p.setCoverage(Coverage.BRANCHES);
		
		p.setCoverage(Coverage.UNSAFE);
		p.setLogLevel(Level.DEBUG);
		
		//Tmp out directories
		p.setOutDirectory(OUT_PATH);
		p.setTmpDirectoryBase(TMP_BASE_PATH);
		p.setTmpDirectoryName("Test_TMP");
		
		p.setPhases(1, 2, 3, 4, 5, 6); //1. JBSE, 2. merge JBSE, 3. fitness function, 4. javac, 5. evosuite
		
		//Parallelism
		p.setRedundanceEvosuite(1);
		p.setParallelismEvosuite(1);
	}

	@Override
	public void modify(JBSEParameters p) 
	throws FileNotFoundException, IOException, sushi.configure.ParseException {		
		//Invariant file:
		loadHEXFile(WORKSPACE + "Struts2Injection/src/defs/linked_list.jbse", p);
	}	
	
	@Override
	public void modify(MergerParameters p) {
		//p.setBranchesToCover("jbse/meta/Analysis:(Z)V:ass3rt:1:4");
	}


	@Override
	public void modify(List<String> p) {
		p.add("-Dobject_reuse_probability=0.8");
		p.add("-Delite=5");
		p.add("-Dinline=true");
		p.add("-Dcluster_recursion=2");
	}
}
