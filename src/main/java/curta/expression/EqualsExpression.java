package curta.expression;

import curta.CurtaNode;
import curta.function.Function;

import java.util.Map;

public class EqualsExpression extends Expression {

    @Override
    public Object eval(CurtaNode ast, Map<String, Object> vars, Map<String, Function> functions, Map<Integer, Expression> expressions) {

        Object lhs = super.evalChild(0, ast, vars, functions, expressions);
        Object rhs = super.evalChild(1, ast, vars, functions, expressions);

        if(lhs == rhs) {
            return true;
        }
        else if(lhs == null || rhs == null) {
            return false;
        }
        else if((lhs instanceof Number) && (rhs instanceof Number)) {
            // otherwise 1 != 1.0
            return ((Number)lhs).doubleValue() == ((Number)rhs).doubleValue();
        }

        return lhs.equals(rhs);
    }
}