import static sushi.compile.path_condition_distance.DistanceBySimilarityWithPathCondition.distance;

import static java.lang.Double.*;
import static java.lang.Math.*;

import sushi.compile.path_condition_distance.*;
import sushi.logging.Level;
import sushi.logging.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvoSuiteWrapper_0_31 {
    private static final double SMALL_DISTANCE = 1;
    private static final double BIG_DISTANCE = 1E300;


    public double test0(actions.addElement.AddElementAction __ROOT_this) throws Exception {
        //generated for state .1.1.2.1.1.1.1.1.1.1.1.2.2.2.1.2.2.2.2.2[44]
        final ArrayList<ClauseSimilarityHandler> pathConditionHandler = new ArrayList<>();
        ValueCalculator valueCalculator;
        // {R0} == Object[0] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this", Class.forName("actions.addElement.AddElementAction")));
        // pre_init(actions/addElement/AddElementAction)
        ;
        // pre_init(com/opensymphony/xwork2/ActionSupport)
        ;
        // {R3} == Object[1] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure", Class.forName("common.LinkedList")));
        // {V13} >= 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.size");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V13 = (int) variables.get(0);
                return (V13) >= (0) ? 0 : isNaN((V13) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V13) - (0));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // pre_init(jbse/meta/Analysis)
        ;
        // 0 < {V13}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.size");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V13 = (int) variables.get(0);
                return (0) < (V13) ? 0 : isNaN((0) - (V13)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((0) - (V13));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {R8} == Object[2] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure.header", Class.forName("common.LinkedList$Entry")));
        // {R11} == Object[3] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure.header.next", Class.forName("common.LinkedList$Entry")));
        // {R17} == Object[1] (aliases {ROOT}:this.dataStructure)
        pathConditionHandler.add(new SimilarityWithRefToAlias("{ROOT}:this.dataStructure.header.next._owner", "{ROOT}:this.dataStructure"));
        // pre_init(common/LinkedList)
        ;
        // pre_init(java/util/AbstractSequentialList)
        ;
        // pre_init(java/util/AbstractList)
        ;
        // pre_init(java/util/AbstractCollection)
        ;
        // {R14} == Object[4] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure.header.next.element", Class.forName("model.addElement.MyType")));
        // {R20} == Object[5] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure.header.next.element.stringElement", Class.forName("java.lang.String")));
        // {R18} == Object[6] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure.header.next.element.b1", Class.forName("model.addElement.BType")));
        // {R22} == Object[7] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure.header.next.element.b1.a1", Class.forName("model.addElement.AType")));
        // {R23} == Object[8] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure.header.next.element.b1.a2", Class.forName("model.addElement.AType")));
        // {R19} == Object[9] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure.header.next.element.b2", Class.forName("model.addElement.BType")));
        // {R24} == Object[10] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure.header.next.element.b2.a1", Class.forName("model.addElement.AType")));
        // {R25} == Object[11] (fresh)
        pathConditionHandler.add(new SimilarityWithRefToFreshObject("{ROOT}:this.dataStructure.header.next.element.b2.a2", Class.forName("model.addElement.AType")));
        // {V34} != 0
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b1.a1.firstInt");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V34 = (int) variables.get(0);
                return (V34) != (0) ? 0 : isNaN((V34) - (0)) ? BIG_DISTANCE : SMALL_DISTANCE;
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V35} != 1
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b1.a1.secondInt");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V35 = (int) variables.get(0);
                return (V35) != (1) ? 0 : isNaN((V35) - (1)) ? BIG_DISTANCE : SMALL_DISTANCE;
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V37} < {V27}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b1.a2.firstInt");
                retVal.add("{ROOT}:this.dataStructure.header.next.element.intElement");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V37 = (int) variables.get(0);
                final int V27 = (int) variables.get(1);
                return (V37) < (V27) ? 0 : isNaN((V37) - (V27)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V37) - (V27));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V27} != 4
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.header.next.element.intElement");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V27 = (int) variables.get(0);
                return (V27) != (4) ? 0 : isNaN((V27) - (4)) ? BIG_DISTANCE : SMALL_DISTANCE;
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V42} == {V44}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b2.a1.secondInt");
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b2.a2.firstInt");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V42 = (int) variables.get(0);
                final int V44 = (int) variables.get(1);
                return (V42) == (V44) ? 0 : isNaN((V42) - (V44)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V42) - (V44));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V41} >= 10
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b2.a1.firstInt");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V41 = (int) variables.get(0);
                return (V41) >= (10) ? 0 : isNaN((V41) - (10)) ? BIG_DISTANCE : SMALL_DISTANCE + abs((V41) - (10));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V42} != 2
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b2.a1.secondInt");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V42 = (int) variables.get(0);
                return (V42) != (2) ? 0 : isNaN((V42) - (2)) ? BIG_DISTANCE : SMALL_DISTANCE;
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V42} + {V38} >= {V27} + 2 + {V44}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b2.a1.secondInt");
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b1.a2.secondInt");
                retVal.add("{ROOT}:this.dataStructure.header.next.element.intElement");
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b2.a2.firstInt");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V42 = (int) variables.get(0);
                final int V38 = (int) variables.get(1);
                final int V27 = (int) variables.get(2);
                final int V44 = (int) variables.get(3);
                return ((V42) + (V38)) >= (((V27) + (2)) + (V44)) ? 0 : isNaN(((V42) + (V38)) - (((V27) + (2)) + (V44))) ? BIG_DISTANCE : SMALL_DISTANCE + abs(((V42) + (V38)) - (((V27) + (2)) + (V44)));
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));
        // {V27} + {V35} != {V34} + {V38}
        valueCalculator = new ValueCalculator() {
            @Override public Iterable<String> getVariableOrigins() {
                ArrayList<String> retVal = new ArrayList<>();
                retVal.add("{ROOT}:this.dataStructure.header.next.element.intElement");
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b1.a1.secondInt");
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b1.a1.firstInt");
                retVal.add("{ROOT}:this.dataStructure.header.next.element.b1.a2.secondInt");
                return retVal;
            }
            @Override public double calculate(List<Object> variables) {
                final int V27 = (int) variables.get(0);
                final int V35 = (int) variables.get(1);
                final int V34 = (int) variables.get(2);
                final int V38 = (int) variables.get(3);
                return ((V27) + (V35)) != ((V34) + (V38)) ? 0 : isNaN(((V27) + (V35)) - ((V34) + (V38))) ? BIG_DISTANCE : SMALL_DISTANCE;
            }
        };
        pathConditionHandler.add(new SimilarityWithNumericExpression(valueCalculator));

        final HashMap<String, Object> candidateObjects = new HashMap<>();
        candidateObjects.put("{ROOT}:this", __ROOT_this);

        double d = distance(pathConditionHandler, candidateObjects);
        if (d == 0.0d)
            System.out.println("test0 0 distance");
        return d;
    }
}
