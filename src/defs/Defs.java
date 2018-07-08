package defs;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Defs {
	
	// General Paths
	public static final String HOME 			 = "/home/alessandro/";
	public static final String WORKSPACE 	     = HOME + "eclipse-workspace/";
	
    // CVC4, Z3
    public static final String CVC4_PATH         = "/usr/bin/cvc4";
    public static final String Z3_PATH_STRING    = HOME + "Z3/bin/z3";

    // JBSE & Sushi Paths
    public static final String SUSHI_HOME		 = HOME + "sushi/";
    public static final String JBSE_HOME         = SUSHI_HOME + "jbse/";
    public static final String JBSE_CLASSPATH    = JBSE_HOME + "target/classes/";
    public static final String JBSE_SOURCEPATH   = JBSE_HOME + "src/";
    
    // Testing Paths
    public static final String PROJECT_HOME      = WORKSPACE + "Struts2Injection/";
    public static final String ACTION_CLASSPATH  = PROJECT_HOME + "build/classes/";
    public static final String ACTION_SOURCEPATH = PROJECT_HOME + "WebContent/WEB-INF/src/";
    
    // Paths
    public static final Path RT_PATH			 = Paths.get(SUSHI_HOME + "jbse/data/jre/rt.jar");
    public static final Path Z3_PATH 			 = Paths.get(Z3_PATH_STRING);
    public static final Path JBSE_PATH			 = Paths.get(JBSE_CLASSPATH);
    public static final Path BIN_PATH            = Paths.get(ACTION_CLASSPATH);
    public static final Path OUT_PATH			 = Paths.get(PROJECT_HOME, "src");
    public static final Path TMP_BASE_PATH		 = Paths.get(PROJECT_HOME, "tmp");
    public static final Path EVOSUITE_PATH 	 	 = Paths.get(SUSHI_HOME + "evosuite/evosuite-shaded-1.0.3.jar");
    public static final Path SUSHI_LIB_PATH 	 = Paths.get(SUSHI_HOME + "runtime/target/classes/");
    
    
    /***** Struts2 Required Jars *****/
	public static final String STRUTS2_LIB		 = WORKSPACE + "Struts2Injection/WebContent/WEB-INF/lib/";
	    
	public static final Path STRUTS2_CORE	 	 = Paths.get(STRUTS2_LIB, "struts2-core-2.5.2.jar");
	public static final Path LOG4J				 = Paths.get(STRUTS2_LIB, "log4j-api-2.5.jar");
	public static final Path LOG4J_CORE			 = Paths.get(STRUTS2_LIB, "log4j-core-2.5.jar");
	public static final Path OGNL				 = Paths.get(STRUTS2_LIB, "ognl-3.1.10.jar");
    
    public static final String[] CLASSPATH       = { ACTION_CLASSPATH, 
                                                     SUSHI_HOME + "jbse/target/jbse-0.8.0-SNAPSHOT.jar", 
                                                     SUSHI_HOME + "jbse/data/jre/rt.jar",
                                                     STRUTS2_LIB + "struts2-core-2.5.2.jar"
    												};
    
    public static final String[] SOURCEPATH      = { JBSE_SOURCEPATH, ACTION_SOURCEPATH };
}