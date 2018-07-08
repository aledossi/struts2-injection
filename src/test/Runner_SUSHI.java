package test;

import static defs.Defs.*;
import static test.SushiParams.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import jbse.apps.run.RunParameters;
import jbse.apps.run.Run;
import jbse.apps.run.RunParameters.DecisionProcedureType;
import jbse.apps.run.RunParameters.StateFormatMode;
import jbse.apps.run.RunParameters.StepShowMode;
import jbse.apps.settings.ParseException;
import jbse.apps.settings.SettingsReader;



public class Runner_SUSHI {
	static final String OUT_FILE = PROJECT_HOME + "out/testSuite.java";
	
	public static void set (RunParameters p) throws FileNotFoundException, IOException, ParseException {
		p.addClasspath(CLASSPATH);
        p.addSourcePath(SOURCEPATH);
        p.setMethodSignature(METHOD_CLASS, METHOD_DESCRIPTOR, METHOD_NAME);
        p.setOutputFileName(OUT_FILE);
        p.setDecisionProcedureType(DecisionProcedureType.Z3);
        p.setExternalDecisionProcedurePath(Z3_PATH_STRING);
        p.setStepShowMode(StepShowMode.LEAVES);
        
        // Invariant set
        SettingsReader rd = new SettingsReader(WORKSPACE + 
        		"Struts2Injection/src/defs/linked_list.jbse");
        rd.fillRunParameters(p);
        
        // Export
        p.setStateFormatMode(StateFormatMode.FULLTEXT);
        p.setStepShowMode(StepShowMode.ALL);
        
        p.setShowWarnings(false);
        
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		final RunParameters p = new RunParameters();
		set(p);
		final Run r = new Run(p);
        r.run();
	}
}
